package com.training;

import java.lang.reflect.Field;

import com.training.entity.Student;
import com.training.stereotypes.Column;
import com.training.stereotypes.Table;

public class AnnotationProcessor {
	public static void main(String[] arg) {
		Student stud=new Student();
		Class<?> cls=stud.getClass();
		Table tableRef=cls.getAnnotation(Table.class);
		String tableName=tableRef.TableName();
		String sql="select * from "+tableName;
		System.out.println(sql);
		
		try {
		Field idField=cls.getDeclaredField("id");
		Column idcol = idField.getAnnotation(Column.class);
		String colName=idcol.name();
		String sql2="select * from "+tableName+" where "+colName+"=?";
		System.out.println(sql2);	
	}catch(NoSuchFieldException e) {
		e.printStackTrace();
	}
		catch(SecurityException e) {
			e.printStackTrace();
		}

}
}