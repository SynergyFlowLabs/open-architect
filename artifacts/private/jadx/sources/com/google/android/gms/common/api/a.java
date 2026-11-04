package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a.d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class a<O extends d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC0967a f105897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f105898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f105899c;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.a$a, reason: collision with other inner class name */
    @g6.a
    public static abstract class AbstractC0967a<T extends f, O> extends e<T, O> {
        @NonNull
        @g6.a
        @Deprecated
        public T c(@NonNull Context context, @NonNull Looper looper, @NonNull com.google.android.gms.common.internal.h hVar, @NonNull O o10, @NonNull l.b bVar, @NonNull l.c cVar) {
            return (T) d(context, looper, hVar, o10, bVar, cVar);
        }

        @NonNull
        @g6.a
        public T d(@NonNull Context context, @NonNull Looper looper, @NonNull com.google.android.gms.common.internal.h hVar, @NonNull O o10, @NonNull com.google.android.gms.common.api.internal.f fVar, @NonNull com.google.android.gms.common.api.internal.r rVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    @g6.a
    public interface b {
    }

    @g6.a
    public static class c<C extends b> {
    }

    public interface d {

        @NonNull
        public static final C0969d N1 = new C0969d(null);

        /* JADX INFO: renamed from: com.google.android.gms.common.api.a$d$a, reason: collision with other inner class name */
        public interface InterfaceC0968a extends c, e {
            @NonNull
            Account r();
        }

        public interface b extends c {
            @p0
            GoogleSignInAccount B1();
        }

        public interface c extends d {
        }

        /* JADX INFO: renamed from: com.google.android.gms.common.api.a$d$d, reason: collision with other inner class name */
        public static final class C0969d implements e {
            private C0969d() {
                throw null;
            }

            /* synthetic */ C0969d(b0 b0Var) {
            }
        }

        public interface e extends d {
        }

        public interface f extends c, e {
        }
    }

    @l1
    @g6.a
    public static abstract class e<T extends b, O> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @g6.a
        public static final int f105900a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @g6.a
        public static final int f105901b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @g6.a
        public static final int f105902c = Integer.MAX_VALUE;

        @NonNull
        @g6.a
        public List<Scope> a(@p0 O o10) {
            return Collections.EMPTY_LIST;
        }

        @g6.a
        public int b() {
            return Integer.MAX_VALUE;
        }
    }

    @g6.a
    public interface f extends b {
        @g6.a
        boolean a();

        @g6.a
        boolean b();

        @g6.a
        void d();

        @g6.a
        void e(@NonNull String str);

        @g6.a
        boolean f();

        @g6.a
        void g(@NonNull com.google.android.gms.common.internal.f.c cVar);

        @g6.a
        boolean h();

        @p0
        @g6.a
        IBinder i();

        @g6.a
        boolean isConnected();

        @NonNull
        @g6.a
        Set<Scope> j();

        @g6.a
        void k(@p0 com.google.android.gms.common.internal.o oVar, @p0 Set<Scope> set);

        @g6.a
        void m(@NonNull String str, @p0 FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @p0 String[] strArr);

        @g6.a
        int n();

        @NonNull
        @g6.a
        Intent p();

        @NonNull
        @g6.a
        String q();

        @NonNull
        @g6.a
        Feature[] r();

        @g6.a
        boolean s();

        @g6.a
        void t(@NonNull com.google.android.gms.common.internal.f.e eVar);

        @NonNull
        @g6.a
        Feature[] v();

        @p0
        @g6.a
        String w();
    }

    @g6.a
    public static final class g<C extends f> extends c<C> {
    }

    @g6.a
    public <C extends f> a(@NonNull String str, @NonNull AbstractC0967a<C, O> abstractC0967a, @NonNull g<C> gVar) {
        com.google.android.gms.common.internal.w.s(abstractC0967a, "Cannot construct an Api with a null ClientBuilder");
        com.google.android.gms.common.internal.w.s(gVar, "Cannot construct an Api with a null ClientKey");
        this.f105899c = str;
        this.f105897a = abstractC0967a;
        this.f105898b = gVar;
    }

    @NonNull
    public final AbstractC0967a a() {
        return this.f105897a;
    }

    @NonNull
    public final c b() {
        return this.f105898b;
    }

    @NonNull
    public final e c() {
        return this.f105897a;
    }

    @NonNull
    public final String d() {
        return this.f105899c;
    }
}
