package com.rabbitmq.client;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;
import javax.security.sasl.Sasl;
import javax.security.sasl.SaslClient;
import javax.security.sasl.SaslException;

/* JADX INFO: loaded from: classes13.dex */
public class i0 implements h1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f265107d = {"PLAIN"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f265108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f265109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CallbackHandler f265110c;

    private class a implements i1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SaslClient f265111a;

        public a(SaslClient saslClient) {
            this.f265111a = saslClient;
        }

        @Override // com.rabbitmq.client.i1
        public k0 a(k0 k0Var, String str, String str2) {
            try {
                return com.rabbitmq.client.impl.x0.b(this.f265111a.evaluateChallenge(k0Var.z()));
            } catch (SaslException e10) {
                throw new RuntimeException((Throwable) e10);
            }
        }

        @Override // com.rabbitmq.client.i1
        public String getName() {
            return this.f265111a.getMechanismName();
        }
    }

    private class b implements CallbackHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r f265113a;

        public b(r rVar) {
            this.f265113a = rVar;
        }

        @Override // javax.security.auth.callback.CallbackHandler
        public void handle(Callback[] callbackArr) throws UnsupportedCallbackException, IOException {
            for (Callback callback : callbackArr) {
                if (callback instanceof NameCallback) {
                    ((NameCallback) callback).setName(this.f265113a.H());
                } else {
                    if (!(callback instanceof PasswordCallback)) {
                        throw new UnsupportedCallbackException(callback, "Unrecognized Callback");
                    }
                    ((PasswordCallback) callback).setPassword(this.f265113a.u().toCharArray());
                }
            }
        }
    }

    public i0(r rVar) {
        this(rVar, f265107d);
    }

    @Override // com.rabbitmq.client.h1
    public i1 a(String[] strArr) {
        HashSet hashSet = new HashSet(Arrays.asList(strArr));
        for (String str : this.f265109b) {
            if (hashSet.contains(str)) {
                try {
                    SaslClient saslClientCreateSaslClient = Sasl.createSaslClient(new String[]{str}, (String) null, "AMQP", this.f265108a.q(), (Map) null, this.f265110c);
                    if (saslClientCreateSaslClient != null) {
                        return new a(saslClientCreateSaslClient);
                    }
                } catch (SaslException e10) {
                    throw new RuntimeException((Throwable) e10);
                }
            }
        }
        return null;
    }

    public i0(r rVar, String[] strArr) {
        this.f265108a = rVar;
        this.f265110c = new b(rVar);
        this.f265109b = Arrays.asList(strArr);
    }
}
