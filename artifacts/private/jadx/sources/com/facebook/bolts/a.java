package com.facebook.bolts;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C0905a f99278b = new C0905a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f99279c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<Throwable> f99280a;

    /* JADX INFO: renamed from: com.facebook.bolts.a$a, reason: collision with other inner class name */
    public static final class C0905a {
        public /* synthetic */ C0905a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0905a() {
        }
    }

    public a(@Nullable String str, @Nullable List<? extends Throwable> list) {
        super(str, (list == null || list.isEmpty()) ? null : list.get(0));
        List<Throwable> listUnmodifiableList = Collections.unmodifiableList(list == null ? CollectionsKt.emptyList() : list);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(innerThrowables ?: emptyList())");
        this.f99280a = listUnmodifiableList;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(@NotNull PrintStream err) {
        Intrinsics.checkNotNullParameter(err, "err");
        super.printStackTrace(err);
        int i10 = -1;
        for (Throwable th2 : this.f99280a) {
            err.append("\n");
            err.append("  Inner throwable #");
            i10++;
            err.append((CharSequence) String.valueOf(i10));
            err.append(": ");
            if (th2 != null) {
                th2.printStackTrace(err);
            }
            err.append("\n");
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(@NotNull PrintWriter err) {
        Intrinsics.checkNotNullParameter(err, "err");
        super.printStackTrace(err);
        int i10 = -1;
        for (Throwable th2 : this.f99280a) {
            err.append("\n");
            err.append("  Inner throwable #");
            i10++;
            err.append((CharSequence) String.valueOf(i10));
            err.append(": ");
            if (th2 != null) {
                th2.printStackTrace(err);
            }
            err.append("\n");
        }
    }
}
