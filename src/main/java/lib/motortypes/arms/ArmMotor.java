package lib.motortypes.arms;

import lib.motormechanisms.controlrequests.AngularPositionRequest;
import lib.motormechanisms.controlrequests.AngularVelocityRequest;
import lib.motormechanisms.controlrequests.CurrentRequest;
import lib.motormechanisms.controlrequests.VoltageRequest;
import lib.motortypes.MotorControllerType;

public interface ArmMotor {

    public int getCanId();

    public String getCanNetworkName();

    public MotorControllerType getMotorControllerType();

    public double getCurrentAmps();

    public double getVoltageVolts();

    public double getAngleDegrees();

    public void setAngleDegrees(double angleDegrees);

    public double getAngularVelocityDegreesPerSecond();

    public void accept(VoltageRequest request);

    public void accept(CurrentRequest request);

    public void acceptPositionVoltage(AngularPositionRequest request);

    public void acceptTrapPositionVoltage(AngularPositionRequest request);

    public void acceptExpoPositionVoltage(AngularPositionRequest request);

    public void acceptVelocityVoltage(AngularVelocityRequest request);

    public void acceptTrapVelocityVoltage(AngularVelocityRequest request);

    public void acceptPositionCurrent(AngularPositionRequest request);

    public void acceptTrapPositionCurrent(AngularPositionRequest request);

    public void acceptExpoPositionCurrent(AngularPositionRequest request);

    public void acceptVelocityCurrent(AngularVelocityRequest request);

    public void acceptTrapVelocityCurrent(AngularVelocityRequest request);
}