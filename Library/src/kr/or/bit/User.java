package kr.or.bit;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

public class User implements Serializable {
   private String cellNum; // 전화번호
   private String name; // 이름
   private Date date; // 시간
   private HashMap<Integer, String> borrowBook = null; // 빌린 책 목록
   
   public Date getDate() { // date getter
		return date;
	}
	public User() { // constructor
       super();
       date = new Date();
   }
	
   public User(String cellNum, String name) { // constructor
       super();
       this.cellNum = cellNum;
       this.name = name;
   }
   public String getName() { // name getter
       return name;
   }
   public void setName(String name) { // name setter
       this.name = name;
   }
   public String getCellNum() { // cellnum getter
       return cellNum;
   }
   public void setCellNum(String cellNum) { // cellnum setter
       this.cellNum = cellNum;
   }
   public HashMap<Integer, String> getBorrowBook() { // getter borrowbook
       if (borrowBook == null) {
           borrowBook = new HashMap<Integer, String>();
       }
       return borrowBook;
   }
   @Override
  	public String toString() { // tostring
  		return "User [cellNum=" + cellNum + ", name=" + name + "]";
  	}
}


