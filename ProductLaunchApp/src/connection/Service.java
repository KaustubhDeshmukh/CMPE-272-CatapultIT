/**
 * Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package connection;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.jws.WebService;
import org.rosuda.JRI.Rengine;

@WebService
public class Service {
	
	static int invocationCount = 0;
	
	static Rengine re =  null;
	
	static final HashMap<String, String> companyBVMap = new HashMap<String,String>();
	
	{
		companyBVMap.put("Samsung", "0.6");
		companyBVMap.put("Apple", "0.68");
		companyBVMap.put("Acer", "0.57");
		companyBVMap.put("Toshiba", "0.35");
		companyBVMap.put("Asus", "0.27");
		companyBVMap.put("Lenovo", "0.59");
		companyBVMap.put("Micromax", "0.03");
		companyBVMap.put("HCL", "0.12");
		companyBVMap.put("Amazon", "0.08");
		companyBVMap.put("HP", "0.16");
		companyBVMap.put("HTC", "0.66");
		companyBVMap.put("Huawei", "0.3");
		companyBVMap.put("LG", "0.04");
		companyBVMap.put("Sony", "0.47");
		companyBVMap.put("Blackberry", "0.56");
		companyBVMap.put("Dell", "0.3");
		companyBVMap.put("Google", "0.83");
		companyBVMap.put("Others", "1");
	
		
	}
	
	public String login(String user, String pwd)
	{
				
		
		DatabaseConnection db=new DatabaseConnection();
		String result;
		
		//int id=Integer.parseInt(user);
		
		result = db.login1(user,pwd);
		//System.out.println(result);
		return result;
	}
	
	public String signup(String user, String pwd, String name, String company)
	{
		
		DatabaseConnection db=new DatabaseConnection();
		String result;
		
		//int id=Integer.parseInt(user);
		
		result = db.signUp(user,pwd,name,company);
		//System.out.println(result);
		return result;
	}

	public String rcall(String companyName,String productName,String processorFrequency,String processCores,String processorQuality,String macSupport,String androidSupport,String windowsSupport,String blackberrySupport,String displaySize,String displayQuality,String displayResolution,String ram,String ramType,
			String onBoardMemory,String expandableMemory,String batterybackUp,String batteryType,String weight,String backCameraMP,String backCameraQuality,String frontCameraMP,String frontCameraQuality,String hdmiSupport,String touchInput,String thickness,String dimensions,String wifiSupport,String wifiQuality,
			String bluetoothSupport,String bluetoothQuality,String usbSupport,String usbQuality,String fourGSupport,String threeGSupport)
	{
		if(invocationCount == 0){
			
			Service.createREngine();
			
			Service.generateCoeff();
			
			invocationCount++;
		}
		
		String brandValueApplicable = companyBVMap.get(companyName);
		
		int actualBV = 1/(1 - Integer.parseInt(brandValueApplicable));
		
		System.out.println("Effective BV for "+companyName+" is "+actualBV);
		
		String predictRCall = "X <- predict(results,data.frame(ProcessorFrequency="+processorFrequency+",processorCores="+processCores+",MacSupport="+macSupport+"," +
				"AndroidSupport="+androidSupport+",Windowssupport="+windowsSupport+",BlackberryOSSupport="+blackberrySupport+",Displaysize="+displaySize+",Displayquality="+displayQuality+",RAM="+ram+",OnBoardMemory="+onBoardMemory+"," +
				"ExpandedMemoryCapable="+expandableMemory+",BatteryBackup="+batterybackUp+",Batteryreverse="+batteryType+",weight="+weight+"," +
				"Camera1BackSide="+backCameraMP+",Camera2FrontSide="+frontCameraMP+",Cameraquality="+backCameraQuality+",HDMISupport="+hdmiSupport+",Touchinput="+touchInput+"," +
				"Thickness="+thickness+",DimensionsLenghtInTOBreadth="+dimensions+",WiFiQuality="+wifiQuality+",USBSupport="+usbSupport+",USBQuality="+usbQuality+",FourGSupport="+fourGSupport+"," +
				"ThreeGSupport="+threeGSupport+"), interval=\"prediction\")";
		
		re.eval(predictRCall);
		
		re.eval("Price <- function (x,y){x*y}");
		
		re.eval("Y <- Price(X[1],"+actualBV+")");
		
		Double price = re.eval("Y").asDouble();
		
		return price.toString();
	}
	public String bev(String advertizingBudget,String consumerTradePromotionBudget,String salesForceBudget,String generalOtherBudget)
	{
				
		String result= null;
		return result;
	}
	
	private synchronized static void createREngine(){
		
		
		System.out.println("Creating Rengine (with arguments)");
		
		try{
		
		re=new Rengine(null, true, null);
	    
		System.out.println("Rengine created, waiting for R");
	    
		if (!re.waitForR()) {
	        System.out.println("Cannot load R");
	        return;
	    }
		
		System.out.println("R-Engine created successfully");
		
		}catch( Exception createREngineExcep){
			
			System.out.println("Exception received while creating R-Engine "+createREngineExcep.toString());
			
			createREngineExcep.printStackTrace();
		}
	}
	
		private synchronized static void generateCoeff(){
			
			try{
		
			re.eval("File <- read.csv('C:\\\\SJSU\\\\R\\\\FinalData.csv')");
			
			re.eval("results <- lm(PricewithLaunchPriceOneMinusBV ~ ProcessorFrequency+processorCores+MacSupport+AndroidSupport+Windowssupport+BlackberryOSSupport+Displaysize+Displayquality+RAM+OnBoardMemory+ExpandedMemoryCapable+BatteryBackup+Batteryreverse+weight+Camera1BackSide+Camera2FrontSide+Cameraquality+HDMISupport+Touchinput+Thickness+DimensionsLenghtInTOBreadth+WiFiQuality+USBSupport+USBQuality+FourGSupport,data=File)");
			
			}catch(Exception generateCoeffExcep){
				
				System.out.println("Exception while reading file and generating coeffcients "+generateCoeffExcep.toString());
			}
		}
	
}
