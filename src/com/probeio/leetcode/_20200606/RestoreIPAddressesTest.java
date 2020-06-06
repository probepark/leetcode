package com.probeio.leetcode._20200606;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class RestoreIPAddressesTest {

    @Test
    public void restoreIpAddresses() {
        RestoreIPAddresses restoreIPAddresses = new RestoreIPAddresses();
        assertEquals(Arrays.asList("255.255.11.135", "255.255.111.35"), restoreIPAddresses.restoreIpAddresses("25525511135"));
    }

    @Test
    public void restoreIpAddresses2() {
        RestoreIPAddresses restoreIPAddresses = new RestoreIPAddresses();
        assertEquals(Arrays.asList("0.10.0.10","0.100.1.0"), restoreIPAddresses.restoreIpAddresses("010010"));
    }
}