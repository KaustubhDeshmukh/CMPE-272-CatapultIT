package connection;

public class ServiceProxy implements connection.Service {
  private String _endpoint = null;
  private connection.Service service = null;
  
  public ServiceProxy() {
    _initServiceProxy();
  }
  
  public ServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initServiceProxy();
  }
  
  private void _initServiceProxy() {
    try {
      service = (new connection.ServiceServiceLocator()).getService();
      if (service != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)service)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)service)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (service != null)
      ((javax.xml.rpc.Stub)service)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public connection.Service getService() {
    if (service == null)
      _initServiceProxy();
    return service;
  }
  
  public java.lang.String bev(java.lang.String user1, java.lang.String user2, java.lang.String user3, java.lang.String user4) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.bev(user1, user2, user3, user4);
  }
  
  public java.lang.String login(java.lang.String user, java.lang.String pwd) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.login(user, pwd);
  }
  
  public java.lang.String signup(java.lang.String user, java.lang.String pwd, java.lang.String name, java.lang.String company) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.signup(user, pwd, name, company);
  }
  
  public java.lang.String rcall(java.lang.String user, java.lang.String user0, java.lang.String user1, java.lang.String user2, java.lang.String user3, java.lang.String user4, java.lang.String user5, java.lang.String user6, java.lang.String user7, java.lang.String user8, java.lang.String user9, java.lang.String user10, java.lang.String user11, java.lang.String user12, java.lang.String user13, java.lang.String user14, java.lang.String user15, java.lang.String user16, java.lang.String user17, java.lang.String user18, java.lang.String user19, java.lang.String user20, java.lang.String user21, java.lang.String user22, java.lang.String user23, java.lang.String user24, java.lang.String user25, java.lang.String user26, java.lang.String user27, java.lang.String user28, java.lang.String user29, java.lang.String user30, java.lang.String user31, java.lang.String user32, java.lang.String user33) throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    return service.rcall(user, user0, user1, user2, user3, user4, user5, user6, user7, user8, user9, user10, user11, user12, user13, user14, user15, user16, user17, user18, user19, user20, user21, user22, user23, user24, user25, user26, user27, user28, user29, user30, user31, user32, user33);
  }
  
  
}