package hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource.Converter;

import hello_world.test.com.example.karim.bitctrl_app_3.Model.Model.Model.ComputerNote;
import hello_world.test.com.example.karim.bitctrl_app_3.RemoteDataSource.Entity.ComputerImpl;

public class RemoteDataLocalDataComputer {

DateToString dateToString = new DateToString();

    public ComputerNote convertRemoteDataToLocalData( ComputerImpl remoteDataComputer){
        ComputerNote localDataComputer = new ComputerNote(
                remoteDataComputer.getId().intValue(),
                remoteDataComputer.getPlayersystem().intValue(),
                remoteDataComputer.getInstallationpoint().intValue(),
                remoteDataComputer.getCompany(),
                remoteDataComputer.getSupport().getId().intValue(),
                remoteDataComputer.getChannel(),
                remoteDataComputer.getTyp(),
                remoteDataComputer.getDistributiontyp(),
                remoteDataComputer.getPlayeros(),
                remoteDataComputer.getPlayertyp(),
                remoteDataComputer.getHostname(),
                remoteDataComputer.getPhonenumber(),
                remoteDataComputer.getSim(),
                remoteDataComputer.getLogid(),
                remoteDataComputer.getEnable(),
                remoteDataComputer.getDescription(),
                dateToString.getStrDate(remoteDataComputer.getLastvalidupdate()),
                remoteDataComputer.getIp(),
                remoteDataComputer.getMac(),
                remoteDataComputer.getMaclan(),
                remoteDataComputer.getMacversion(),
                remoteDataComputer.getMaincontrolversion(),
                remoteDataComputer.getSernumber(),
                remoteDataComputer.getOperationhours() );

        return localDataComputer;
    }
}






