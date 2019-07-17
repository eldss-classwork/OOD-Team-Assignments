package edu.neu.khoury.cs5004.assignment7.problem2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class RegistrationValidatorTest {
  private RegistrationValidator registrationValidator;
  private Driver driver;
  private Name driverName;
  private Date driverBirthday;
  private License driverLicenseInformation;
  private VehicleInfo vehicleInformation;
  private VehicleInsuranceInfo vehicleInsuranceInformation;
  private DriverHistory driverHistory;
  private VehicleHistory vehicleHistory;
  private Name name1;
  private Name name2;
  private List<Name> names;
  private VehicleViolation vehicleViolation;
  private VehicleCrash vehicleCrash;
  private HashSet<VehicleCrash> vehicleCrashes;
  private HashSet<VehicleViolation> vehicleViolations;
  private HashSet<DriverViolation> violations;
  private DriverViolation driverViolation;
  private HashSet<Driver> driversPool;

  @Before
  public void setUp() throws Exception {
    driverName = new Name("a", "a");
    driverBirthday = new Date(1,1,1990);
    driverLicenseInformation = new License(1, new Name("a", "a"),
        new Date(1, 1,1990), "US",
        new Date(1, 1, 2010), new Date(1,1,2022));
    vehicleInformation = new VehicleInfo("a", "a",
        new Date(1,1,2010), new Name("a", "a"));
    name1 = new Name("a", "a");
    name2 = new Name("a", "a");
    names = new ArrayList<>();
    names.add(name1);
    names.add(name2);
    vehicleInsuranceInformation = new VehicleInsuranceInfo(name1, names, new Date(1,1,2022));
    vehicleViolations = new HashSet<>();
    vehicleCrashes = new HashSet<>();
    vehicleViolation = new VehicleViolation(NonMovingViolation.PARKINGVIOLATION, new Name("a", "a"), new Date(1,1,1));
    vehicleCrash = new VehicleCrash(new Name("a", "a"), new Date(1,1,2010), Crash.CRASHWITHIINJURIES);
    vehicleCrashes.add(vehicleCrash);
    vehicleViolations.add(vehicleViolation);
    vehicleHistory = new VehicleHistory(vehicleCrashes, vehicleViolations);
    violations = new HashSet<>();
    driverViolation = new DriverViolation(MovingViolation.SPEEDING);
    violations.add(driverViolation);
    driverHistory = new DriverHistory(violations);
    driver = new Driver(driverName, driverBirthday,
        driverLicenseInformation,
        vehicleInformation,
        vehicleInsuranceInformation,
        driverHistory,
        vehicleHistory);
    registrationValidator = new RegistrationValidator(driver);
    driversPool = new HashSet<>();
    driversPool.add(driver);
  }

  @Test
  public void getDriversPool() {
    assertEquals(null, registrationValidator.getDriversPool());
  }

  @Test
  public void equals1() {
    assertTrue(registrationValidator.equals(registrationValidator));
    assertFalse(registrationValidator.equals(null));
  }

  @Test
  public void hashCode1() {
    assertEquals(31, registrationValidator.hashCode());
  }

  @Test
  public void toString1() {
    assertEquals("RegistrationValidator{driversPool=null}",registrationValidator.toString());
  }


}