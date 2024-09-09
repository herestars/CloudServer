/*
* Licensed to the Apache Software Foundation (ASF) under one or more
* contributor license agreements.  See the NOTICE file distributed with
* this work for additional information regarding copyright ownership.
* The ASF licenses this file to You under the Apache License, Version 2.0
* (the "License"); you may not use this file except in compliance with
* the License.  You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package org.stars.ai.service.proto;

import com.google.protobuf.Message;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.stream.StreamObserver;
import org.apache.dubbo.rpc.*;
import org.apache.dubbo.rpc.model.MethodDescriptor;
import org.apache.dubbo.rpc.model.ServiceDescriptor;
import org.apache.dubbo.rpc.model.StubMethodDescriptor;
import org.apache.dubbo.rpc.model.StubServiceDescriptor;
import org.apache.dubbo.rpc.stub.*;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public final class DubboTongYiServiceTriple {

    public static final String SERVICE_NAME = TongYiService.SERVICE_NAME;

    private static final StubServiceDescriptor serviceDescriptor = new StubServiceDescriptor(SERVICE_NAME,TongYiService.class);

    static {
        org.apache.dubbo.rpc.protocol.tri.service.SchemaDescriptorRegistry.addSchemaDescriptor(SERVICE_NAME,GreetProto.getDescriptor());
        StubSuppliers.addSupplier(SERVICE_NAME, DubboTongYiServiceTriple::newStub);
        StubSuppliers.addSupplier(TongYiService.JAVA_SERVICE_NAME,  DubboTongYiServiceTriple::newStub);
        StubSuppliers.addDescriptor(SERVICE_NAME, serviceDescriptor);
        StubSuppliers.addDescriptor(TongYiService.JAVA_SERVICE_NAME, serviceDescriptor);
    }

    @SuppressWarnings("all")
    public static TongYiService newStub(Invoker<?> invoker) {
        return new TongYiServiceStub((Invoker<TongYiService>)invoker);
    }

    /**
         * <pre>
         *  Sends a greeting
         * </pre>
         */
    private static final StubMethodDescriptor sayHelloMethod = new StubMethodDescriptor("SayHello",
    HelloRequest.class, HelloResponse.class, MethodDescriptor.RpcType.UNARY,
    obj -> ((Message) obj).toByteArray(), obj -> ((Message) obj).toByteArray(), HelloRequest::parseFrom,
    HelloResponse::parseFrom);

    private static final StubMethodDescriptor sayHelloAsyncMethod = new StubMethodDescriptor("SayHello",
    HelloRequest.class, CompletableFuture.class, MethodDescriptor.RpcType.UNARY,
    obj -> ((Message) obj).toByteArray(), obj -> ((Message) obj).toByteArray(), HelloRequest::parseFrom,
    HelloResponse::parseFrom);

    private static final StubMethodDescriptor sayHelloProxyAsyncMethod = new StubMethodDescriptor("SayHelloAsync",
    HelloRequest.class, HelloResponse.class, MethodDescriptor.RpcType.UNARY,
    obj -> ((Message) obj).toByteArray(), obj -> ((Message) obj).toByteArray(), HelloRequest::parseFrom,
    HelloResponse::parseFrom);
    /**
         * <pre>
         *  获取图片
         * </pre>
         */
    private static final StubMethodDescriptor getPictureMethod = new StubMethodDescriptor("GetPicture",
    HelloRequest.class, HelloResponse.class, MethodDescriptor.RpcType.UNARY,
    obj -> ((Message) obj).toByteArray(), obj -> ((Message) obj).toByteArray(), HelloRequest::parseFrom,
    HelloResponse::parseFrom);

    private static final StubMethodDescriptor getPictureAsyncMethod = new StubMethodDescriptor("GetPicture",
    HelloRequest.class, CompletableFuture.class, MethodDescriptor.RpcType.UNARY,
    obj -> ((Message) obj).toByteArray(), obj -> ((Message) obj).toByteArray(), HelloRequest::parseFrom,
    HelloResponse::parseFrom);

    private static final StubMethodDescriptor getPictureProxyAsyncMethod = new StubMethodDescriptor("GetPictureAsync",
    HelloRequest.class, HelloResponse.class, MethodDescriptor.RpcType.UNARY,
    obj -> ((Message) obj).toByteArray(), obj -> ((Message) obj).toByteArray(), HelloRequest::parseFrom,
    HelloResponse::parseFrom);
    /**
         * <pre>
         *  获取音频
         * </pre>
         */
    private static final StubMethodDescriptor getVoiceMethod = new StubMethodDescriptor("GetVoice",
    HelloRequest.class, HelloResponse.class, MethodDescriptor.RpcType.UNARY,
    obj -> ((Message) obj).toByteArray(), obj -> ((Message) obj).toByteArray(), HelloRequest::parseFrom,
    HelloResponse::parseFrom);

    private static final StubMethodDescriptor getVoiceAsyncMethod = new StubMethodDescriptor("GetVoice",
    HelloRequest.class, CompletableFuture.class, MethodDescriptor.RpcType.UNARY,
    obj -> ((Message) obj).toByteArray(), obj -> ((Message) obj).toByteArray(), HelloRequest::parseFrom,
    HelloResponse::parseFrom);

    private static final StubMethodDescriptor getVoiceProxyAsyncMethod = new StubMethodDescriptor("GetVoiceAsync",
    HelloRequest.class, HelloResponse.class, MethodDescriptor.RpcType.UNARY,
    obj -> ((Message) obj).toByteArray(), obj -> ((Message) obj).toByteArray(), HelloRequest::parseFrom,
    HelloResponse::parseFrom);




    static{
        serviceDescriptor.addMethod(sayHelloMethod);
        serviceDescriptor.addMethod(sayHelloProxyAsyncMethod);
        serviceDescriptor.addMethod(getPictureMethod);
        serviceDescriptor.addMethod(getPictureProxyAsyncMethod);
        serviceDescriptor.addMethod(getVoiceMethod);
        serviceDescriptor.addMethod(getVoiceProxyAsyncMethod);
    }

    public static class TongYiServiceStub implements TongYiService{
        private final Invoker<TongYiService> invoker;

        public TongYiServiceStub(Invoker<TongYiService> invoker) {
            this.invoker = invoker;
        }

        /**
         * <pre>
         *  Sends a greeting
         * </pre>
         */
        @Override
        public HelloResponse sayHello(HelloRequest request){
            return StubInvocationUtil.unaryCall(invoker, sayHelloMethod, request);
        }

        public CompletableFuture<HelloResponse> sayHelloAsync(HelloRequest request){
            return StubInvocationUtil.unaryCall(invoker, sayHelloAsyncMethod, request);
        }

        /**
         * <pre>
         *  Sends a greeting
         * </pre>
         */
        public void sayHello(HelloRequest request, StreamObserver<HelloResponse> responseObserver){
            StubInvocationUtil.unaryCall(invoker, sayHelloMethod , request, responseObserver);
        }
        /**
         * <pre>
         *  获取图片
         * </pre>
         */
        @Override
        public HelloResponse getPicture(HelloRequest request){
            return StubInvocationUtil.unaryCall(invoker, getPictureMethod, request);
        }

        public CompletableFuture<HelloResponse> getPictureAsync(HelloRequest request){
            return StubInvocationUtil.unaryCall(invoker, getPictureAsyncMethod, request);
        }

        /**
         * <pre>
         *  获取图片
         * </pre>
         */
        public void getPicture(HelloRequest request, StreamObserver<HelloResponse> responseObserver){
            StubInvocationUtil.unaryCall(invoker, getPictureMethod , request, responseObserver);
        }
        /**
         * <pre>
         *  获取音频
         * </pre>
         */
        @Override
        public HelloResponse getVoice(HelloRequest request){
            return StubInvocationUtil.unaryCall(invoker, getVoiceMethod, request);
        }

        public CompletableFuture<HelloResponse> getVoiceAsync(HelloRequest request){
            return StubInvocationUtil.unaryCall(invoker, getVoiceAsyncMethod, request);
        }

        /**
         * <pre>
         *  获取音频
         * </pre>
         */
        public void getVoice(HelloRequest request, StreamObserver<HelloResponse> responseObserver){
            StubInvocationUtil.unaryCall(invoker, getVoiceMethod , request, responseObserver);
        }



    }

    public static abstract class TongYiServiceImplBase implements TongYiService, ServerService<TongYiService> {

        private <T, R> BiConsumer<T, StreamObserver<R>> syncToAsync(java.util.function.Function<T, R> syncFun) {
            return new BiConsumer<T, StreamObserver<R>>() {
                @Override
                public void accept(T t, StreamObserver<R> observer) {
                    try {
                        R ret = syncFun.apply(t);
                        observer.onNext(ret);
                        observer.onCompleted();
                    } catch (Throwable e) {
                        observer.onError(e);
                    }
                }
            };
        }

        @Override
        public CompletableFuture<HelloResponse> sayHelloAsync(HelloRequest request){
                return CompletableFuture.completedFuture(sayHello(request));
        }
        @Override
        public CompletableFuture<HelloResponse> getPictureAsync(HelloRequest request){
                return CompletableFuture.completedFuture(getPicture(request));
        }
        @Override
        public CompletableFuture<HelloResponse> getVoiceAsync(HelloRequest request){
                return CompletableFuture.completedFuture(getVoice(request));
        }

        /**
        * This server stream type unary method is <b>only</b> used for generated stub to support async unary method.
        * It will not be called if you are NOT using Dubbo3 generated triple stub and <b>DO NOT</b> implement this method.
        */
        public void sayHello(HelloRequest request, StreamObserver<HelloResponse> responseObserver){
            sayHelloAsync(request).whenComplete((r, t) -> {
                if (t != null) {
                    responseObserver.onError(t);
                } else {
                    responseObserver.onNext(r);
                    responseObserver.onCompleted();
                }
            });
        }
        public void getPicture(HelloRequest request, StreamObserver<HelloResponse> responseObserver){
            getPictureAsync(request).whenComplete((r, t) -> {
                if (t != null) {
                    responseObserver.onError(t);
                } else {
                    responseObserver.onNext(r);
                    responseObserver.onCompleted();
                }
            });
        }
        public void getVoice(HelloRequest request, StreamObserver<HelloResponse> responseObserver){
            getVoiceAsync(request).whenComplete((r, t) -> {
                if (t != null) {
                    responseObserver.onError(t);
                } else {
                    responseObserver.onNext(r);
                    responseObserver.onCompleted();
                }
            });
        }

        @Override
        public final Invoker<TongYiService> getInvoker(URL url) {
            PathResolver pathResolver = url.getOrDefaultFrameworkModel()
            .getExtensionLoader(PathResolver.class)
            .getDefaultExtension();
            Map<String,StubMethodHandler<?, ?>> handlers = new HashMap<>();

            pathResolver.addNativeStub( "/" + SERVICE_NAME + "/SayHello");
            pathResolver.addNativeStub( "/" + SERVICE_NAME + "/SayHelloAsync");
            // for compatibility
            pathResolver.addNativeStub( "/" + JAVA_SERVICE_NAME + "/SayHello");
            pathResolver.addNativeStub( "/" + JAVA_SERVICE_NAME + "/SayHelloAsync");

            pathResolver.addNativeStub( "/" + SERVICE_NAME + "/GetPicture");
            pathResolver.addNativeStub( "/" + SERVICE_NAME + "/GetPictureAsync");
            // for compatibility
            pathResolver.addNativeStub( "/" + JAVA_SERVICE_NAME + "/GetPicture");
            pathResolver.addNativeStub( "/" + JAVA_SERVICE_NAME + "/GetPictureAsync");

            pathResolver.addNativeStub( "/" + SERVICE_NAME + "/GetVoice");
            pathResolver.addNativeStub( "/" + SERVICE_NAME + "/GetVoiceAsync");
            // for compatibility
            pathResolver.addNativeStub( "/" + JAVA_SERVICE_NAME + "/GetVoice");
            pathResolver.addNativeStub( "/" + JAVA_SERVICE_NAME + "/GetVoiceAsync");


            BiConsumer<HelloRequest, StreamObserver<HelloResponse>> sayHelloFunc = this::sayHello;
            handlers.put(sayHelloMethod.getMethodName(), new UnaryStubMethodHandler<>(sayHelloFunc));
            BiConsumer<HelloRequest, StreamObserver<HelloResponse>> sayHelloAsyncFunc = syncToAsync(this::sayHello);
            handlers.put(sayHelloProxyAsyncMethod.getMethodName(), new UnaryStubMethodHandler<>(sayHelloAsyncFunc));
            BiConsumer<HelloRequest, StreamObserver<HelloResponse>> getPictureFunc = this::getPicture;
            handlers.put(getPictureMethod.getMethodName(), new UnaryStubMethodHandler<>(getPictureFunc));
            BiConsumer<HelloRequest, StreamObserver<HelloResponse>> getPictureAsyncFunc = syncToAsync(this::getPicture);
            handlers.put(getPictureProxyAsyncMethod.getMethodName(), new UnaryStubMethodHandler<>(getPictureAsyncFunc));
            BiConsumer<HelloRequest, StreamObserver<HelloResponse>> getVoiceFunc = this::getVoice;
            handlers.put(getVoiceMethod.getMethodName(), new UnaryStubMethodHandler<>(getVoiceFunc));
            BiConsumer<HelloRequest, StreamObserver<HelloResponse>> getVoiceAsyncFunc = syncToAsync(this::getVoice);
            handlers.put(getVoiceProxyAsyncMethod.getMethodName(), new UnaryStubMethodHandler<>(getVoiceAsyncFunc));




            return new StubInvoker<>(this, url, TongYiService.class, handlers);
        }


        @Override
        public HelloResponse sayHello(HelloRequest request){
            throw unimplementedMethodException(sayHelloMethod);
        }

        @Override
        public HelloResponse getPicture(HelloRequest request){
            throw unimplementedMethodException(getPictureMethod);
        }

        @Override
        public HelloResponse getVoice(HelloRequest request){
            throw unimplementedMethodException(getVoiceMethod);
        }





        @Override
        public final ServiceDescriptor getServiceDescriptor() {
            return serviceDescriptor;
        }
        private RpcException unimplementedMethodException(StubMethodDescriptor methodDescriptor) {
            return TriRpcStatus.UNIMPLEMENTED.withDescription(String.format("Method %s is unimplemented",
                "/" + serviceDescriptor.getInterfaceName() + "/" + methodDescriptor.getMethodName())).asException();
        }
    }

}
