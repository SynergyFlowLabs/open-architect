package ta;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f376228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f376229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f376230c;

    public b(@NotNull String fileName, @NotNull String contentType, @NotNull String content) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f376228a = fileName;
        this.f376229b = contentType;
        this.f376230c = content;
    }

    public static /* synthetic */ b e(b bVar, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bVar.f376228a;
        }
        if ((i10 & 2) != 0) {
            str2 = bVar.f376229b;
        }
        if ((i10 & 4) != 0) {
            str3 = bVar.f376230c;
        }
        return bVar.d(str, str2, str3);
    }

    @NotNull
    public final String a() {
        return this.f376228a;
    }

    @NotNull
    public final String b() {
        return this.f376229b;
    }

    @NotNull
    public final String c() {
        return this.f376230c;
    }

    @NotNull
    public final b d(@NotNull String fileName, @NotNull String contentType, @NotNull String content) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(content, "content");
        return new b(fileName, contentType, content);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Intrinsics.areEqual(this.f376228a, bVar.f376228a) && Intrinsics.areEqual(this.f376229b, bVar.f376229b) && Intrinsics.areEqual(this.f376230c, bVar.f376230c)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String f() {
        return this.f376230c;
    }

    @NotNull
    public final String g() {
        return this.f376229b;
    }

    @NotNull
    public final String h() {
        return this.f376228a;
    }

    public int hashCode() {
        return (((this.f376228a.hashCode() * 31) + this.f376229b.hashCode()) * 31) + this.f376230c.hashCode();
    }

    @NotNull
    public String toString() {
        return "AiChatMessageAttachment(fileName=" + this.f376228a + ", contentType=" + this.f376229b + ", content=" + this.f376230c + ")";
    }
}
