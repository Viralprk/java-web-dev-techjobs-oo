package org.launchcode.techjobs_oo;

import java.util.*;

public class Job {

    private int id;
    private static int nextId = 1;
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }


    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job that = (Job) o;
        return id == that.id;
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }


    @Override
    public String toString() {
        String noData = "Data not available";
        String finalString = "";

        ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();

        HashMap<String, String> idField = new HashMap<String, String>();
        idField.put("ID :", Integer.toString(this.id));
        list.add(idField);

        HashMap<String, String> nameFields = new HashMap<String, String>();
        nameFields.put("Name :", this.getName() != null ?this.getName():noData);
        list.add(nameFields);

        HashMap<String, String> empFields = new HashMap<String, String>();
        empFields.put("Employer :", this.employer.toString() != null?this.employer.toString():noData);
        list.add(empFields);

        HashMap<String, String> locationFields = new HashMap<String, String>();
        locationFields.put("Location :", this.location.toString() != null?this.location.toString():noData);
        list.add(locationFields);

        HashMap<String, String> positionTypeFields = new HashMap<String, String>();
        positionTypeFields.put("Position Type :", this.positionType.toString()!= null?this.positionType.toString():noData);
        list.add(positionTypeFields);

        HashMap<String, String> coreCompetencyFields = new HashMap<String, String>();
        coreCompetencyFields.put("Core Competency :", this.getCoreCompetency().toString()!= null?this.getCoreCompetency().toString():noData);
        list.add(coreCompetencyFields);



        for (int i = 0; i < list.size(); i++) {
            HashMap<String, String> data = list.get(i);
            finalString =  finalString + "\n";
            for (Map.Entry<String, String> entry : data.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                finalString =  finalString + key + value;
            }
        }

        return  finalString;
    }



}
