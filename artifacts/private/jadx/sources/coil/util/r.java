package coil.util;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nDebugLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugLogger.kt\ncoil/util/DebugLogger\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n1#2:44\n*E\n"})
public final class r implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f87857a;

    @oj.j
    public r() {
        this(0, 1, null);
    }

    private final void a(int i10) {
        if (2 > i10 || i10 >= 8) {
            throw new IllegalArgumentException(("Invalid log level: " + i10).toString());
        }
    }

    @Override // coil.util.z
    public int g() {
        return this.f87857a;
    }

    @Override // coil.util.z
    public void h(@NotNull String str, int i10, @Nullable String str2, @Nullable Throwable th2) {
        if (str2 != null) {
            Log.println(i10, str, str2);
        }
        if (th2 != null) {
            StringWriter stringWriter = new StringWriter();
            th2.printStackTrace(new PrintWriter(stringWriter));
            Log.println(i10, str, stringWriter.toString());
        }
    }

    @Override // coil.util.z
    public void i(int i10) {
        a(i10);
        this.f87857a = i10;
    }

    @oj.j
    public r(int i10) {
        this.f87857a = i10;
        a(i10);
    }

    public /* synthetic */ r(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 3 : i10);
    }
}
