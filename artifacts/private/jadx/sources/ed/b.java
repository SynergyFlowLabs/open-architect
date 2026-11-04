package ed;

import androidx.annotation.f1;
import androidx.annotation.l;
import androidx.annotation.v;
import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@w0(parameters = 0)
public final class b extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f274754i = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f274755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f274756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private String f274757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final Integer f274758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final d f274759g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f274760h;

    public /* synthetic */ b(int i10, int i11, String str, Integer num, d dVar, boolean z10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, (i12 & 4) != 0 ? null : str, (i12 & 8) != 0 ? null : num, (i12 & 16) != 0 ? null : dVar, (i12 & 32) != 0 ? true : z10);
    }

    @Nullable
    public final String b() {
        return this.f274757e;
    }

    @Nullable
    public final Integer c() {
        return this.f274758f;
    }

    @Nullable
    public final d d() {
        return this.f274759g;
    }

    public final int e() {
        return this.f274755c;
    }

    public final int f() {
        return this.f274756d;
    }

    public final boolean g() {
        return this.f274760h;
    }

    public final void h(@Nullable String str) {
        this.f274757e = str;
    }

    public b(@v int i10, @f1 int i11, @Nullable String str, @l @Nullable Integer num, @Nullable d dVar, boolean z10) {
        super(c.a.ClickableItem);
        this.f274755c = i10;
        this.f274756d = i11;
        this.f274757e = str;
        this.f274758f = num;
        this.f274759g = dVar;
        this.f274760h = z10;
    }
}
