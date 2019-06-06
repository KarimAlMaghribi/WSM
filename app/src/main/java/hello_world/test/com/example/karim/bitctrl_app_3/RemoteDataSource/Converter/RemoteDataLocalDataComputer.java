package hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource.Converter;

import hello_world.test.com.example.karim.bitctrl_app_3.Model.Model.Model.ComputerNote;
import hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource.Entity.Computer;
import hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource.Entity.ComputerImpl;
import hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource.Entity.User;

public class RemoteDataLocalDataComputer {

    private static final DateToString dateToString = new DateToString();

    private String bubu;

    public static final User convertRemoteUserToLocalUser(User remotUser){

        return remotUser;
    }

    public static ComputerNote convertRemoteComputerToLocalComputer( Computer remoteDataComputer){

        ComputerNote localDataComputer = new ComputerNote();

        localDataComputer.setId(remoteDataComputer.getId().intValue());
        localDataComputer.setPlayersystem(remoteDataComputer.getPlayersystem().intValue());
        localDataComputer.setInstallationpoint(remoteDataComputer.getInstallationpoint().intValue());
        localDataComputer.setCompany(remoteDataComputer.getCompany());
        localDataComputer.setSupportID(remoteDataComputer.getSupport().getId().intValue());
        localDataComputer.setChannel(remoteDataComputer.getChannel());
        localDataComputer.setTyp(remoteDataComputer.getTyp());
        localDataComputer.setDistributiontyp(remoteDataComputer.getDistributiontyp());
        localDataComputer.setPlayeros(remoteDataComputer.getPlayeros());
        localDataComputer.setPlayertyp(remoteDataComputer.getPlayertyp());
        localDataComputer.setHostname(remoteDataComputer.getHostname());
        localDataComputer.setPhonenumber(remoteDataComputer.getPhonenumber());
        localDataComputer.setSim(remoteDataComputer.getSim());
        localDataComputer.setLogid(remoteDataComputer.getLogid());
        localDataComputer.setEnable(remoteDataComputer.getEnable());
        localDataComputer.setDescription(remoteDataComputer.getDescription());
        localDataComputer.setLastvalidupdate(dateToString.getStrDate(remoteDataComputer.getLastvalidupdate()));
        localDataComputer.setIp(remoteDataComputer.getIp());
        localDataComputer.setMac(remoteDataComputer.getMac());
        localDataComputer.setMaclan(remoteDataComputer.getMaclan());
        localDataComputer.setMacversion(remoteDataComputer.getMacversion());
        localDataComputer.setMaincontrolversion(remoteDataComputer.getMaincontrolversion());
        localDataComputer.setSernumber(remoteDataComputer.getSernumber());
        localDataComputer.setOperationhours(remoteDataComputer.getOperationhours());

        return localDataComputer;
    }
}






