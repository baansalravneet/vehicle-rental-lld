package com.navi.vehiclerental.commands.impl;

import com.navi.vehiclerental.commands.Command;
import com.navi.vehiclerental.services.OnboardService;

/**
 * Add branch command
 */
public class AddBranchCommand implements Command {

  private final OnboardService onboardService;
  private final String branchId;
  private final String[] vehicleTypes;

  public AddBranchCommand(OnboardService onboardService, String branchId, String... vehicleTypes) {
    this.onboardService = onboardService;
    this.branchId = branchId;
    this.vehicleTypes = vehicleTypes;
  }

  @Override
  public void execute() {
    if (onboardService.addBranch(this.branchId, this.vehicleTypes)) {
      System.out.println("TRUE");
    } else {
      System.out.println("FALSE");
    }
  }
}
