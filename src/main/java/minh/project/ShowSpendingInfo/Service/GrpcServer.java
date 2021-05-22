package minh.project.ShowSpendingInfo.Service;

import minh.project.ShowSpendingInfo.grpc.EvaluateGrpc;
import org.lognet.springboot.grpc.GRpcService;

import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

@GRpcService
public class GrpcServer extends EvaluateGrpc.EvaluateImplBase {
    @Override
    public void sendTable(minh.project.ShowSpendingInfo.grpc.Infos request,
                          io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
        System.out.println("receive message");
    }
}
