package com.training.daos;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.time.LocalDate;

import com.training.entity.Student;
import com.training.ifaces.CrudRepository;

public class StudentDaoImpl implements CrudRepository<Student,Integer> {
   private Connection con;//to establish connection to DB,to use in this class call that method and pass that as an arg
   
	public StudentDaoImpl(Connection con) {
	super();
	this.con = con;
}

	@Override
	public boolean add(Student t) {
	   String sql="insert into student values(?,?,?,?)";
	   int rowAdded=0;
	   try(PreparedStatement pstmt=con.prepareStatement(sql) ){
		   pstmt.setInt(1,t.getRollNumber());
		   pstmt.setString(2,t.getStudentName());
		   pstmt.setDate(3,Date.valueOf(t.getDateofBirth()));
		   pstmt.setDouble(4, t.getMarkScored());
		   
		   rowAdded=pstmt.executeUpdate();
		   
		   
	   }catch(SQLException e) {
		   e.printStackTrace();
		   
	   }
	   
		return rowAdded==1?true:false;
	}

	@Override
	public List<Student> findAll() {
        String sql="select * from student";
        List<Student> list=new ArrayList<Student>();
        try(PreparedStatement pstmt=con.prepareStatement(sql)) {
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next()) {
				int rollNumber=rs.getInt("rollNumber");
				String SyudentName=rs.getString("SyudentName");
				LocalDate dateofBirth=rs.getDate("dateofBirth").toLocalDate();
				double markScored=rs.getDouble("markScored");
				Student student =new Student(rollNumber, SyudentName, dateofBirth, markScored);
					list.add(student);	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int update(Student t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean remove(Student t) {
		
		String sql="delete from student where rollNumber=?";
		   int rowDeleted=0;
		   try(PreparedStatement pstmt=con.prepareStatement(sql) ){
			   pstmt.setInt(1,t.getRollNumber());
			   rowDeleted=pstmt.executeUpdate();
			   
			   
		   }catch(SQLException e) {
			   e.printStackTrace();
			   
		   }
		   
			return rowDeleted==1?true:false;
		}
	

	@Override
	public Student findById(Integer e) {
		String sql="select * from student where rollNumber=?";
        Student obj=null;
        try(PreparedStatement pstmt=con.prepareStatement(sql)) {
			pstmt.setInt(1,e);
              ResultSet rs=pstmt.executeQuery();
              if(rs.next()) {
				int rollNumber=rs.getInt("rollNumber");
				String SyudentName=rs.getString("SyudentName");
				LocalDate dateofBirth=rs.getDate("dateofBirth").toLocalDate();
				double markScored=rs.getDouble("markScored");
				obj =new Student(rollNumber, SyudentName, dateofBirth, markScored);
				
			
		} }catch (Exception e1) {
			e1.printStackTrace();
		}
		return obj;
		
	}

}
