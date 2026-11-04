package retrofit2;

import fj.h;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import okhttp3.d0;
import okio.e1;

/* JADX INFO: loaded from: classes14.dex */
final class DefaultCallAdapterFactory extends CallAdapter.Factory {

    @h
    private final Executor callbackExecutor;

    static final class ExecutorCallbackCall<T> implements Call<T> {
        final Executor callbackExecutor;
        final Call<T> delegate;

        /* JADX INFO: renamed from: retrofit2.DefaultCallAdapterFactory$ExecutorCallbackCall$1, reason: invalid class name */
        class AnonymousClass1 implements Callback<T> {
            final /* synthetic */ Callback val$callback;

            AnonymousClass1(Callback callback) {
                this.val$callback = callback;
            }

            public static /* synthetic */ void b(AnonymousClass1 anonymousClass1, Callback callback, Response response) {
                if (ExecutorCallbackCall.this.delegate.isCanceled()) {
                    callback.onFailure(ExecutorCallbackCall.this, new IOException("Canceled"));
                } else {
                    callback.onResponse(ExecutorCallbackCall.this, response);
                }
            }

            @Override // retrofit2.Callback
            public void onFailure(Call<T> call, final Throwable th2) {
                Executor executor = ExecutorCallbackCall.this.callbackExecutor;
                final Callback callback = this.val$callback;
                executor.execute(new Runnable() { // from class: retrofit2.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        callback.onFailure(DefaultCallAdapterFactory.ExecutorCallbackCall.this, th2);
                    }
                });
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call, final Response<T> response) {
                Executor executor = ExecutorCallbackCall.this.callbackExecutor;
                final Callback callback = this.val$callback;
                executor.execute(new Runnable() { // from class: retrofit2.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultCallAdapterFactory.ExecutorCallbackCall.AnonymousClass1.b(this.f366646a, callback, response);
                    }
                });
            }
        }

        ExecutorCallbackCall(Executor executor, Call<T> call) {
            this.callbackExecutor = executor;
            this.delegate = call;
        }

        @Override // retrofit2.Call
        public void cancel() {
            this.delegate.cancel();
        }

        @Override // retrofit2.Call
        public void enqueue(Callback<T> callback) {
            Objects.requireNonNull(callback, "callback == null");
            this.delegate.enqueue(new AnonymousClass1(callback));
        }

        @Override // retrofit2.Call
        public Response<T> execute() throws IOException {
            return this.delegate.execute();
        }

        @Override // retrofit2.Call
        public boolean isCanceled() {
            return this.delegate.isCanceled();
        }

        @Override // retrofit2.Call
        public boolean isExecuted() {
            return this.delegate.isExecuted();
        }

        @Override // retrofit2.Call
        public d0 request() {
            return this.delegate.request();
        }

        @Override // retrofit2.Call
        public e1 timeout() {
            return this.delegate.timeout();
        }

        @Override // retrofit2.Call
        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public Call<T> clone() {
            return new ExecutorCallbackCall(this.callbackExecutor, this.delegate.m100clone());
        }
    }

    DefaultCallAdapterFactory(@h Executor executor) {
        this.callbackExecutor = executor;
    }

    @Override // retrofit2.CallAdapter.Factory
    @h
    public CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (CallAdapter.Factory.getRawType(type) != Call.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        }
        final Type parameterUpperBound = Utils.getParameterUpperBound(0, (ParameterizedType) type);
        final Executor executor = Utils.isAnnotationPresent(annotationArr, SkipCallbackExecutor.class) ? null : this.callbackExecutor;
        return new CallAdapter<Object, Call<?>>() { // from class: retrofit2.DefaultCallAdapterFactory.1
            @Override // retrofit2.CallAdapter
            public Type responseType() {
                return parameterUpperBound;
            }

            @Override // retrofit2.CallAdapter
            public Call<?> adapt(Call<Object> call) {
                Executor executor2 = executor;
                return executor2 == null ? call : new ExecutorCallbackCall(executor2, call);
            }
        };
    }
}
