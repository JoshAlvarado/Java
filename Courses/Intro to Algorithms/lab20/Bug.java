// Define an ABSTRACT class named Bug, which inherits
// from Animal and implements the CanCrawl interface.
// This class needs to define a constructor which takes
// a name, and that name should be used to initialize the
// superclass.

      public abstract class Bug extends Animal implements CanCrawl {
          public Bug(String name) {
          super(name);
        }
          public void crawl() {    
          printWithHeader("slowly crawls along");    
          }
      }