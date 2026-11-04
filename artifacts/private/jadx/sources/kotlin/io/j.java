package kotlin.io;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public class j extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final File f312572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final File f312573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f312574c;

    public /* synthetic */ j(File file, File file2, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i10 & 2) != 0 ? null : file2, (i10 & 4) != 0 ? null : str);
    }

    @NotNull
    public final File a() {
        return this.f312572a;
    }

    @Nullable
    public final File b() {
        return this.f312573b;
    }

    @Nullable
    public final String c() {
        return this.f312574c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@NotNull File file, @Nullable File file2, @Nullable String str) {
        super(f.b(file, file2, str));
        Intrinsics.checkNotNullParameter(file, "file");
        this.f312572a = file;
        this.f312573b = file2;
        this.f312574c = str;
    }
}
