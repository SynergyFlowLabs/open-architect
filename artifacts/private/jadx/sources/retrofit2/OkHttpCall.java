package retrofit2;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import fj.h;
import java.io.IOException;
import java.util.Objects;
import okhttp3.d0;
import okhttp3.e;
import okhttp3.f;
import okhttp3.f0;
import okhttp3.g0;
import okhttp3.x;
import okio.e1;
import okio.l;
import okio.l0;
import okio.n;
import okio.y;

/* JADX INFO: loaded from: classes14.dex */
final class OkHttpCall<T> implements Call<T> {
    private final Object[] args;
    private final e.a callFactory;
    private volatile boolean canceled;

    @h
    @gj.a("this")
    private Throwable creationFailure;

    @gj.a("this")
    private boolean executed;
    private final Object instance;

    @h
    @gj.a("this")
    private e rawCall;
    private final RequestFactory requestFactory;
    private final Converter<g0, T> responseConverter;

    static final class ExceptionCatchingResponseBody extends g0 {
        private final g0 delegate;
        private final n delegateSource;

        @h
        IOException thrownException;

        ExceptionCatchingResponseBody(g0 g0Var) {
            this.delegate = g0Var;
            this.delegateSource = l0.e(new y(g0Var.source()) { // from class: retrofit2.OkHttpCall.ExceptionCatchingResponseBody.1
                @Override // okio.y, okio.b1
                public long read(l lVar, long j10) throws IOException {
                    try {
                        return super.read(lVar, j10);
                    } catch (IOException e10) {
                        ExceptionCatchingResponseBody.this.thrownException = e10;
                        throw e10;
                    }
                }
            });
        }

        @Override // okhttp3.g0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
        }

        @Override // okhttp3.g0
        public long contentLength() {
            return this.delegate.contentLength();
        }

        @Override // okhttp3.g0
        public x contentType() {
            return this.delegate.contentType();
        }

        @Override // okhttp3.g0
        public n source() {
            return this.delegateSource;
        }

        void throwIfCaught() throws IOException {
            IOException iOException = this.thrownException;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    static final class NoContentResponseBody extends g0 {
        private final long contentLength;

        @h
        private final x contentType;

        NoContentResponseBody(@h x xVar, long j10) {
            this.contentType = xVar;
            this.contentLength = j10;
        }

        @Override // okhttp3.g0
        public long contentLength() {
            return this.contentLength;
        }

        @Override // okhttp3.g0
        public x contentType() {
            return this.contentType;
        }

        @Override // okhttp3.g0
        public n source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    OkHttpCall(RequestFactory requestFactory, Object obj, Object[] objArr, e.a aVar, Converter<g0, T> converter) {
        this.requestFactory = requestFactory;
        this.instance = obj;
        this.args = objArr;
        this.callFactory = aVar;
        this.responseConverter = converter;
    }

    private e createRawCall() throws IOException {
        e eVarA = this.callFactory.a(this.requestFactory.create(this.instance, this.args));
        if (eVarA != null) {
            return eVarA;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    @gj.a("this")
    private e getRawCall() throws IOException {
        e eVar = this.rawCall;
        if (eVar != null) {
            return eVar;
        }
        Throwable th2 = this.creationFailure;
        if (th2 != null) {
            if (th2 instanceof IOException) {
                throw ((IOException) th2);
            }
            if (th2 instanceof RuntimeException) {
                throw ((RuntimeException) th2);
            }
            throw ((Error) th2);
        }
        try {
            e eVarCreateRawCall = createRawCall();
            this.rawCall = eVarCreateRawCall;
            return eVarCreateRawCall;
        } catch (IOException | Error | RuntimeException e10) {
            Utils.throwIfFatal(e10);
            this.creationFailure = e10;
            throw e10;
        }
    }

    @Override // retrofit2.Call
    public void cancel() {
        e eVar;
        this.canceled = true;
        synchronized (this) {
            try {
                eVar = this.rawCall;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (eVar != null) {
            eVar.cancel();
        }
    }

    @Override // retrofit2.Call
    public void enqueue(final Callback<T> callback) {
        e eVar;
        Throwable th2;
        Objects.requireNonNull(callback, "callback == null");
        synchronized (this) {
            try {
                if (this.executed) {
                    throw new IllegalStateException("Already executed.");
                }
                this.executed = true;
                eVar = this.rawCall;
                th2 = this.creationFailure;
                if (eVar == null && th2 == null) {
                    try {
                        e eVarCreateRawCall = createRawCall();
                        this.rawCall = eVarCreateRawCall;
                        eVar = eVarCreateRawCall;
                    } catch (Throwable th3) {
                        th2 = th3;
                        Utils.throwIfFatal(th2);
                        this.creationFailure = th2;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (th2 != null) {
            callback.onFailure(this, th2);
            return;
        }
        if (this.canceled) {
            eVar.cancel();
        }
        FirebasePerfOkHttpClient.enqueue(eVar, new f() { // from class: retrofit2.OkHttpCall.1
            private void callFailure(Throwable th5) {
                try {
                    callback.onFailure(OkHttpCall.this, th5);
                } catch (Throwable th6) {
                    Utils.throwIfFatal(th6);
                    th6.printStackTrace();
                }
            }

            @Override // okhttp3.f
            public void onFailure(e eVar2, IOException iOException) {
                callFailure(iOException);
            }

            @Override // okhttp3.f
            public void onResponse(e eVar2, f0 f0Var) {
                try {
                    try {
                        callback.onResponse(OkHttpCall.this, OkHttpCall.this.parseResponse(f0Var));
                    } catch (Throwable th5) {
                        Utils.throwIfFatal(th5);
                        th5.printStackTrace();
                    }
                } catch (Throwable th6) {
                    Utils.throwIfFatal(th6);
                    callFailure(th6);
                }
            }
        });
    }

    @Override // retrofit2.Call
    public Response<T> execute() throws IOException {
        e rawCall;
        synchronized (this) {
            try {
                if (this.executed) {
                    throw new IllegalStateException("Already executed.");
                }
                this.executed = true;
                rawCall = getRawCall();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.canceled) {
            rawCall.cancel();
        }
        return parseResponse(FirebasePerfOkHttpClient.execute(rawCall));
    }

    @Override // retrofit2.Call
    public boolean isCanceled() {
        boolean z10 = true;
        if (this.canceled) {
            return true;
        }
        synchronized (this) {
            try {
                e eVar = this.rawCall;
                if (eVar == null || !eVar.isCanceled()) {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // retrofit2.Call
    public synchronized boolean isExecuted() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.executed;
    }

    Response<T> parseResponse(f0 f0Var) throws IOException {
        g0 g0VarR = f0Var.r();
        f0 f0VarC = f0Var.j0().b(new NoContentResponseBody(g0VarR.contentType(), g0VarR.contentLength())).c();
        int iE = f0VarC.E();
        if (iE < 200 || iE >= 300) {
            try {
                Response<T> responseError = Response.error(Utils.buffer(g0VarR), f0VarC);
                g0VarR.close();
                return responseError;
            } catch (Throwable th2) {
                g0VarR.close();
                throw th2;
            }
        }
        if (iE != 204 && iE != 205) {
            ExceptionCatchingResponseBody exceptionCatchingResponseBody = new ExceptionCatchingResponseBody(g0VarR);
            try {
                return Response.success(this.responseConverter.convert(exceptionCatchingResponseBody), f0VarC);
            } catch (RuntimeException e10) {
                exceptionCatchingResponseBody.throwIfCaught();
                throw e10;
            }
        }
        g0VarR.close();
        return Response.success((Object) null, f0VarC);
    }

    @Override // retrofit2.Call
    public synchronized d0 request() {
        try {
            try {
            } catch (IOException e10) {
                throw new RuntimeException("Unable to create request.", e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return getRawCall().request();
    }

    @Override // retrofit2.Call
    public synchronized e1 timeout() {
        try {
            try {
            } catch (IOException e10) {
                throw new RuntimeException("Unable to create call.", e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return getRawCall().timeout();
    }

    @Override // retrofit2.Call
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public OkHttpCall<T> m100clone() {
        return new OkHttpCall<>(this.requestFactory, this.instance, this.args, this.callFactory, this.responseConverter);
    }
}
