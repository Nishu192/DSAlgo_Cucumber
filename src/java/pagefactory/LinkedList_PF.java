package pagefactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedList_PF {
		@FindBy(xpath="/html/body/div[2]/div[3]/div/div/a[text()='Get Started']") WebElement lnk_HomeLinkedListGetStarted;
		
		@FindBy(xpath="//a[text()='Introduction']") WebElement lnk_LinkedListIntro ;
		@FindBy(xpath="//p[text()='Introduction']")WebElement txt_Introductiontitle;
		
		@FindBy(xpath="//a[text()='Creating Linked LIst']") WebElement  lnk_LinkedListCreating;
		@FindBy(xpath="//p[text()='Creating Linked LIst']")WebElement txt_CreatingLinkedLIsttitle;
		
		@FindBy(xpath="//a[text()='Types of Linked List']") WebElement lnk_LinkedListTypes ;
		@FindBy(xpath="//p[text()='Types of Linked List']")WebElement txt_TypesofLinkedListtitle;
		
		@FindBy(xpath="//a[text()='Implement Linked List in Python']") WebElement lnk_LinkedListInPython  ;
		@FindBy(xpath="//p[text()='Implement Linked List in Python']")WebElement txt_ImplementLinkedListinPythontitle;
		
		@FindBy(xpath="//a[text()='Traversal']") WebElement lnk_LinkedListTraversal  ;
		@FindBy(xpath="//p[text()='Traversal']")WebElement txt_Traversaltitle;
		
		@FindBy(xpath="//a[text()='Insertion']") WebElement lnk_LinkedListInsertion;
		@FindBy(xpath="//p[text()='Insertion']")WebElement txt_Insertiontitle;
		
		@FindBy(xpath="//a[text()='Deletion']") WebElement  lnk_LinkedListDeletion;
		@FindBy(xpath="//p[text()='Deletion']")WebElement txt_Deletiontitle;
		
		@FindBy(xpath="//div[@class='container']/div/div/div/a[text()='Practice Questions']") WebElement lnk_PracticeQuestions;
		@FindBy(xpath="//a[text()='Try here>>>']")
		WebElement lnk_TryHere;
		
		@FindBy(xpath="//div[@class='CodeMirror-code']/div/pre[@class=' CodeMirror-line ']")
		WebElement txt_codeEditor;
		
		@FindBy(xpath="//button[@type='button']")
		WebElement btn_run;
		
		public LinkedList_PF(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		
		public void clickHomeGetStartedLinkedList() {
			lnk_HomeLinkedListGetStarted.click();
		}
		
		public void clickIntroduction() {
			lnk_LinkedListIntro.click();
		}
		
		public void clickCreatingLinkedLIst() {
			lnk_LinkedListCreating.click();
		}
	
		public void clickTypesofLinkedList() {
			lnk_LinkedListTypes.click();
		}

		public void clickImplementLinkedListinPython() {
			lnk_LinkedListInPython.click();
		}
		
		public void clickTraversal() {
			lnk_LinkedListTraversal.click();
		}
		
		public void clickInsertion() {
			lnk_LinkedListInsertion.click();
		}
		
		public void clickDeletion() {
			lnk_LinkedListDeletion.click();
		}
		
		public void clickPracticeQuestion()
		{
			lnk_PracticeQuestions.click();
		}
		
		public void clickLinkedListTryHere()
		{
			lnk_TryHere.click();
		}
		
		public void blankEditor()
		{
			txt_codeEditor.sendKeys("");
		}
		
		public void enterValidCode()
		{
			txt_codeEditor.sendKeys("code from excel");
		}
		
		public void enterInvalidCode()
		{
			txt_codeEditor.sendKeys("invalid code from excel");
		}
		
		public void clickLinkedListRun()
		{
			btn_run.click();
		}
		
		 public String gettxt_Introductiontitle() {
				String msg=txt_Introductiontitle.getText();
				System.out.println("The user able to see Title: "+msg);
				return msg;
			}
		 
		 public String gettxt_CreatingLinkedLIsttitle() {
				String msg=txt_CreatingLinkedLIsttitle.getText();
				System.out.println("The user able to see Title: "+msg);
				return msg;
			}
		 
		 public String gettxt_TypesofLinkedListtitle() {
				String msg=txt_TypesofLinkedListtitle.getText();
				System.out.println("The user able to see Title: "+msg);
				return msg;
			}
		 
		 public String gettxt_ImplementLinkedListinPythontitle() {
				String msg=txt_ImplementLinkedListinPythontitle.getText();
				System.out.println("The user able to see Title: "+msg);
				return msg;
			}
		 
		 public String gettxt_Traversaltitle() {
				String msg=txt_Traversaltitle.getText();
				System.out.println("The user able to see Title: "+msg);
				return msg;
			}
		 
		 public String gettxt_Insertiontitle() {
				String msg=txt_Insertiontitle.getText();
				System.out.println("The user able to see Title: "+msg);
				return msg;
			}
		 
		 public String gettxt_Deletiontitle() {
				String msg=txt_Deletiontitle.getText();
				System.out.println("The user able to see Title: "+msg);
				return msg;
			}
		
}
