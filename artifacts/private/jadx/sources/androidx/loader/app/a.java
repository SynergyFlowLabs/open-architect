package androidx.loader.app;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.l0;
import androidx.annotation.p0;
import androidx.lifecycle.m2;
import androidx.lifecycle.o0;
import androidx.loader.content.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: androidx.loader.app.a$a, reason: collision with other inner class name */
    public interface InterfaceC0484a<D> {
        @NonNull
        @l0
        c<D> a(int i10, @p0 Bundle bundle);

        @l0
        void b(@NonNull c<D> cVar, D d10);

        @l0
        void c(@NonNull c<D> cVar);
    }

    public static void c(boolean z10) {
        b.f52610d = z10;
    }

    @NonNull
    public static <T extends o0 & m2> a d(@NonNull T t10) {
        return new b(t10, t10.getViewModelStore());
    }

    @l0
    public abstract void a(int i10);

    @Deprecated
    public abstract void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    @p0
    public abstract <D> c<D> e(int i10);

    public boolean f() {
        return false;
    }

    @NonNull
    @l0
    public abstract <D> c<D> g(int i10, @p0 Bundle bundle, @NonNull InterfaceC0484a<D> interfaceC0484a);

    public abstract void h();

    @NonNull
    @l0
    public abstract <D> c<D> i(int i10, @p0 Bundle bundle, @NonNull InterfaceC0484a<D> interfaceC0484a);
}
