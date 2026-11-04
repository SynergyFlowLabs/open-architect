package com.facebook;

import java.util.Arrays;
import java.util.Random;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class u extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f102157a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f102158b = 1;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public u() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(String str, boolean z10) {
        if (z10) {
            try {
                r5.e eVar = r5.e.f359063a;
                r5.e.g(str);
            } catch (Exception unused) {
            }
        }
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        String message = getMessage();
        return message == null ? "" : message;
    }

    public u(@Nullable final String str) {
        super(str);
        Random random = new Random();
        if (str != null) {
            g0 g0Var = g0.f99617a;
            if (!g0.N() || random.nextInt(100) <= 50) {
                return;
            }
            com.facebook.internal.t tVar = com.facebook.internal.t.f100072a;
            com.facebook.internal.t.a(com.facebook.internal.t.b.ErrorReport, new com.facebook.internal.t.a() { // from class: com.facebook.t
                @Override // com.facebook.internal.t.a
                public final void a(boolean z10) {
                    u.b(str, z10);
                }
            });
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public u(@Nullable String str, @NotNull Object... args) {
        String str2;
        Intrinsics.checkNotNullParameter(args, "args");
        if (str == null) {
            str2 = null;
        } else {
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            str2 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(this, *args)");
        }
        this(str2);
    }

    public u(@Nullable String str, @Nullable Throwable th2) {
        super(str, th2);
    }

    public u(@Nullable Throwable th2) {
        super(th2);
    }
}
