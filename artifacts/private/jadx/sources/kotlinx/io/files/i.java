package kotlinx.io.files;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final File f315767a;

    public i(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.f315767a = file;
    }

    @NotNull
    public final File a() {
        return this.f315767a;
    }

    @NotNull
    public final String b() {
        String name = this.f315767a.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    @Nullable
    public final i c() {
        File parentFile = this.f315767a.getParentFile();
        if (parentFile == null) {
            return null;
        }
        return new i(parentFile);
    }

    public final boolean d() {
        return this.f315767a.isAbsolute();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            return Intrinsics.areEqual(toString(), ((i) obj).toString());
        }
        return false;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    @NotNull
    public String toString() {
        String string = this.f315767a.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
