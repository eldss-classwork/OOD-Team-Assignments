package edu.neu.khoury.cs5004.assignment7.problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LicenseTest {
  private License license;

  @Before
  public void setUp() throws Exception {
    license = new License(1, new Name("a", "b"), new Date(1, 1,1), "US",
    new Date(1, 1, 1), new Date(1,1,1));
  }

  @Test
  public void getLicenseNumber() {
    assertEquals(1, license.getLicenseNumber());
  }

  @Test
  public void getDriverName() {
    assertEquals(new Name("a", "b"), license.getDriverName());
  }

  @Test
  public void getDriverBirthdate() {
    assertEquals(new Date(1, 1,1), license.getDriverBirthdate());
  }

  @Test
  public void getCuntryOrStateOfIssuance() {
    assertEquals("US", license.getCuntryOrStateOfIssuance());
  }

  @Test
  public void getExpirationDate() {
    assertEquals(new Date(1, 1,1), license.getExpirationDate());
  }

  @Test
  public void getIssuanceDate() {
    assertEquals(new Date(1,1,1), license.getIssuanceDate());
  }

  @Test
  public void equals1() {
    assertTrue(license.equals(license));
    assertFalse(license.equals(null));

    License license1 = new License(1, new Name("a", "b"), new Date(1, 1,1), "US",
        new Date(1, 1, 1), new Date(1,1,1));
    assertEquals(license1, license);
  }

  @Test
  public void hashCode1() {
    assertEquals(license.hashCode(), license.hashCode());
    License license1 = new License(1, new Name("a", "b"), new Date(1, 1,1), "US",
        new Date(1, 1, 1), new Date(1,1,1));
    assertEquals(license1.hashCode(), license.hashCode());
  }

  @Test
  public void toString1() {
    assertEquals("License{licenseNumber=1, driverName=Name{firstName='a', lastName='b'},"
        + " driverBirthdate=Date{localDate=0001-01-01},"
        + " cuntryOrStateOfIssuance='US', expirationDate=Date{localDate=0001-01-01},"
        + " issuanceDate=Date{localDate=0001-01-01}}", license.toString());
  }
}