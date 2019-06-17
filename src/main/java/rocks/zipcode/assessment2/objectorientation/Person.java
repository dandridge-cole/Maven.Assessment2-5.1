package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {
    private Address address;
    private Long id;
    private String name;
    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    public Person(Long id, String name, Address address) {
        this.address=address;
        this.name=name;
        this.id=id;
    }

    public Person() {
        this.id=Long.MIN_VALUE;
        this.name="";
        this.address=new Address();
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id=id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address=address;
    }

    @Override
    public String toString(){
        return String.format("Person{id=%d, name='%s', address=%s}",this.id,this.name,this.address.toString());
    }

    @Override
    public boolean equals(Object o) {
        if(this == o)return true;
        if(o==null || this.getClass() != o.getClass())return false;
        Person po = (Person)o;
        if(this.address==null&&po.address==null);
        else if (this.address==null||po.address==null)return false;
        if(this.id==null&&po.id==null);
        else if (this.id==null||po.id==null)return false;
        return
                (this.id==null||this.id.equals(po.id)) &&
                this.name.equals(po.name) &&
                (this.address==null||this.address.equals(po.address));
    }
}