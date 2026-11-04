package io.sentry.instrumentation.file;

import io.sentry.i1;
import io.sentry.n8;
import io.sentry.p1;
import io.sentry.q9;
import io.sentry.u8;
import io.sentry.util.a0;
import io.sentry.util.h0;
import io.sentry.w7;
import io.sentry.x9;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final p1 f305571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final File f305572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final n8 f305573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private x9 f305574d = x9.OK;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f305575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final u8 f305576f;

    /* JADX INFO: renamed from: io.sentry.instrumentation.file.a$a, reason: collision with other inner class name */
    @FunctionalInterface
    interface InterfaceC2223a<T> {
        T call() throws IOException;
    }

    a(@Nullable p1 p1Var, @Nullable File file, @NotNull n8 n8Var) {
        this.f305571a = p1Var;
        this.f305572b = file;
        this.f305573c = n8Var;
        this.f305576f = new u8(n8Var);
        w7.e().a("FileIO");
    }

    private void b() {
        if (this.f305571a != null) {
            String strA = h0.a(this.f305575e);
            File file = this.f305572b;
            if (file != null) {
                this.f305571a.w(c(file));
                if (this.f305573c.isSendDefaultPii()) {
                    this.f305571a.B("file.path", this.f305572b.getAbsolutePath());
                }
            } else {
                this.f305571a.w(strA);
            }
            this.f305571a.B("file.size", Long.valueOf(this.f305575e));
            boolean zA = this.f305573c.getThreadChecker().a();
            this.f305571a.B(q9.f306595h, Boolean.valueOf(zA));
            if (zA) {
                this.f305571a.B(q9.f306596i, this.f305576f.c());
            }
            this.f305571a.E(this.f305574d);
        }
    }

    @NotNull
    private String c(@NotNull File file) {
        String strA = h0.a(this.f305575e);
        if (this.f305573c.isSendDefaultPii()) {
            return file.getName() + " (" + strA + ")";
        }
        int iLastIndexOf = file.getName().lastIndexOf(46);
        if (iLastIndexOf <= 0 || iLastIndexOf >= file.getName().length() - 1) {
            return "*** (" + strA + ")";
        }
        return "***" + file.getName().substring(iLastIndexOf) + " (" + strA + ")";
    }

    @Nullable
    static p1 e(@NotNull i1 i1Var, @NotNull String str) {
        p1 p1VarP = a0.a() ? i1Var.p() : i1Var.e();
        if (p1VarP != null) {
            return p1VarP.h(str);
        }
        return null;
    }

    void a(@NotNull Closeable closeable) throws IOException {
        try {
            try {
                closeable.close();
                b();
            } catch (IOException e10) {
                this.f305574d = x9.INTERNAL_ERROR;
                if (this.f305571a != null) {
                    this.f305571a.D(e10);
                }
                throw e10;
            }
        } catch (Throwable th2) {
            b();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    <T> T d(@NotNull InterfaceC2223a<T> interfaceC2223a) throws IOException {
        try {
            T tCall = interfaceC2223a.call();
            if (tCall instanceof Integer) {
                int iIntValue = ((Integer) tCall).intValue();
                if (iIntValue != -1) {
                    this.f305575e += (long) iIntValue;
                    return tCall;
                }
            } else if (tCall instanceof Long) {
                long jLongValue = ((Long) tCall).longValue();
                if (jLongValue != -1) {
                    this.f305575e += jLongValue;
                }
            }
            return tCall;
        } catch (IOException e10) {
            this.f305574d = x9.INTERNAL_ERROR;
            p1 p1Var = this.f305571a;
            if (p1Var != null) {
                p1Var.D(e10);
            }
            throw e10;
        }
    }
}
