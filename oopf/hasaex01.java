class Address
{
	private String street;
	private String locality;
	private String city;

	public void setStreet(String street)
	{
		this.street=street;
	}
	public void setLocality(String locality)
	{
		this.locality=locality;
	}
	public void setCity(String city)
	{
		this.city=city;
	}

	public String getStreet()
	{
		return street;
	}
	public String getLocality()
	{
		return locality;
	}
	public String getCity()
	{
		return city;
	}

}
class Employee
{
	private int eid;
	private String ename;
	private float esal;
	Address addr;

	public void setEid(int eid)
	{
		this.eid=eid;
	}
	public void setEname(String ename)
	{
		this.ename=ename;
	}
	public void setEsal(float esal)
	{
		this.esal=esal;
	}

	public int getEid()
	{
		return eid;
	}
	public String getEname()
	{
		return ename;
	}
	public float getEsal()
	{
		return esal;
	}

	public void setAddr(Address addr)
	{
		this.addr=addr;
	}

	public Address getAddr()
	{
		return addr;
	}

	public void getEmpDetails()
	{
		System.out.println("Employee Details");
		System.out.println("Emp Id : "+eid);
		System.out.println("Emp Name : "+ename);
		System.out.println("Emp Sal : "+esal);
		System.out.println("Address Details");
		System.out.println("Street : "+addr.getStreet());
		System.out.println("Locality : "+addr.getLocality());
		System.out.println("City : "+addr.getCity());
	}
}

class Test
{
	public static void main(String[] args)
	{
		Address addr=new Address();
		addr.setStreet("Gopalwadi Road");
		addr.setLocality("Daund");
		addr.setCity("Daund");

		Employee emp=new Employee();
		emp.setEid(100);
		emp.setEname("Vedanta Computer");
		emp.setEsal(5000);
		emp.setAddr(addr);
		emp.getEmpDetails();

	}
}