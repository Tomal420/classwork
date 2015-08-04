/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.22.0-${svn.revision} modeling language!*/



/**
 * Introductory example of Umple showing classes,
 * attribute, association, generalization, methods
 * and the mixin capability. Generate java and run this.
 * 
 * The output will be:
 * The mentor of Tom The Student is Nick The Mentor
 * The students of Nick The Mentor are [Tom The Student]
 */
// line 11 "model.ump"
// line 30 "model.ump"
// line 43 "model.ump"
public class Person
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Person Attributes
  private String name;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Person(String aName)
  {
    name = aName;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  /**
   * Attribute, string by default
   */
  public String getName()
  {
    return name;
  }

  public void delete()
  {}

  // line 14 "model.ump"
  public String toString(){
    return(getName());
  }


  /**
   * Notice that we are defining more contents for Person
   * This uses Umple's mixin capability
   */
  // line 35 "model.ump"
   public static  void main(String [] args){
    Thread.currentThread().setUncaughtExceptionHandler(new UmpleExceptionHandler());
    Thread.setDefaultUncaughtExceptionHandler(new UmpleExceptionHandler());
    Mentor m = new Mentor("Nick The Mentor");
    Student s1 = new Student("Tom The Student");
    Student s2 = new Student("Tom The Student");
    Student s3 = new Student("Tom The Student");
    Student s4 = new Student("Tom The Student");
    Student s5 = new Student("Tom The Student");
   Student s6 = new Student("Tom The Student");
    s1.setMentor(m);
    if (m!=null && m.numberOfStudents() >= m.maximumNumberOfStudents())
    {
        System.out.println("number of students limit exceed");
      // return wasSet;
    }
    s2.setMentor(m);
    if (m!=null && m.numberOfStudents() >= m.maximumNumberOfStudents())
    {
        System.out.println("number of students limit exceed");
      // return wasSet;
    }
    s3.setMentor(m);
    if (m!=null && m.numberOfStudents() >= m.maximumNumberOfStudents())
    {
        System.out.println("number of students limit exceed");
      // return wasSet;
    }
    s4.setMentor(m);
    if (m!=null && m.numberOfStudents() >= m.maximumNumberOfStudents())
    {
        System.out.println("number of students limit exceed");
      // return wasSet;
    }
    s5.setMentor(m);
    if (m!=null && m.numberOfStudents() >= m.maximumNumberOfStudents())
    {
        System.out.println("number of students limit exceed");
      // return wasSet;
    }
    s6.setMentor(m);
    if (m!=null && m.numberOfStudents() >= m.maximumNumberOfStudents())
    {
        System.out.println("number of students limit exceed");
      // return wasSet;
    }
    if (m!=null && m.numberOfStudents() >= m.maximumNumberOfStudents())
    {
        System.out.println("number of students limit exceed");
      // return wasSet;
    }
    
    
    System.out.println("The mentor of "  + s1  + " is " +  s1.getMentor());
    System.out.println("The mentor of "  + s2  + " is " +  s2.getMentor());
    System.out.println("The mentor of "  + s3  + " is " +  s3.getMentor());
    System.out.println("The mentor of "  + s4  + " is " +  s4.getMentor());
    System.out.println("The mentor of "  + s5  + " is " +  s5.getMentor());
    System.out.println("The students of " +  m  + " are " +  m.getStudents());
    
    
  }

  public static class UmpleExceptionHandler implements Thread.UncaughtExceptionHandler
  {
    public void uncaughtException(Thread t, Throwable e)
    {
      translate(e);
      if(e.getCause()!=null)
      {
        translate(e.getCause());
      }
      e.printStackTrace();
    }
    public void translate(Throwable e)
    {
      java.util.List<StackTraceElement> result = new java.util.ArrayList<StackTraceElement>();
      StackTraceElement[] elements = e.getStackTrace();
      try
      {
        for(StackTraceElement element:elements)
        {
          String className = element.getClassName();
          String methodName = element.getMethodName();
          boolean methodFound = false;
          int index = className.lastIndexOf('.')+1;
          try {
            java.lang.reflect.Method query = this.getClass().getMethod(className.substring(index)+"_"+methodName,new Class[]{});
            UmpleSourceData sourceInformation = (UmpleSourceData)query.invoke(this,new Object[]{});
            for(int i=0;i<sourceInformation.size();++i)
            {
              int distanceFromStart = element.getLineNumber()-sourceInformation.getJavaLine(i)-(("main".equals(methodName))?2:0);
              if(distanceFromStart>=0&&distanceFromStart<=sourceInformation.getLength(i))
              {
                result.add(new StackTraceElement(element.getClassName(),element.getMethodName(),sourceInformation.getFileName(i),sourceInformation.getUmpleLine(i)+distanceFromStart));
                methodFound = true;
                break;
              }
            }
          }
          catch (Exception e2){}
          if(!methodFound)
          {
            result.add(element);
          }
        }
      }
      catch (Exception e1)
      {
        e1.printStackTrace();
      }
      e.setStackTrace(result.toArray(new StackTraceElement[0]));
    }
  //The following methods Map Java lines back to their original Umple file / line    
    public UmpleSourceData Person_toString(){ return new UmpleSourceData().setFileNames("model.ump").setUmpleLines(13).setJavaLines(60).setLengths(3);}
    public UmpleSourceData Person_main(){ return new UmpleSourceData().setFileNames("model.ump").setUmpleLines(34).setJavaLines(70).setLengths(3);}

  }
  public static class UmpleSourceData
  {
    String[] umpleFileNames;
    Integer[] umpleLines;
    Integer[] umpleJavaLines;
    Integer[] umpleLengths;
    
    public UmpleSourceData(){
    }
    public String getFileName(int i){
      return umpleFileNames[i];
    }
    public Integer getUmpleLine(int i){
      return umpleLines[i];
    }
    public Integer getJavaLine(int i){
      return umpleJavaLines[i];
    }
    public Integer getLength(int i){
      return umpleLengths[i];
    }
    public UmpleSourceData setFileNames(String... filenames){
      umpleFileNames = filenames;
      return this;
    }
    public UmpleSourceData setUmpleLines(Integer... umplelines){
      umpleLines = umplelines;
      return this;
    }
    public UmpleSourceData setJavaLines(Integer... javalines){
      umpleJavaLines = javalines;
      return this;
    }
    public UmpleSourceData setLengths(Integer... lengths){
      umpleLengths = lengths;
      return this;
    }
    public int size(){
      return umpleFileNames.length;
    }
  } 
}