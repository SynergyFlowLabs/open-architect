package androidx.compose.ui.input.indirect;

import android.view.MotionEvent;
import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
public final class a implements h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f38737e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f38738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f38739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f38740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final MotionEvent f38741d;

    public /* synthetic */ a(long j10, long j11, int i10, MotionEvent motionEvent, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, i10, motionEvent);
    }

    @Override // androidx.compose.ui.input.indirect.c
    public int a() {
        return this.f38740c;
    }

    @Override // androidx.compose.ui.input.indirect.c
    public long b() {
        return this.f38739b;
    }

    @Override // androidx.compose.ui.input.indirect.c
    public long c() {
        return this.f38738a;
    }

    @NotNull
    public final MotionEvent d() {
        return this.f38741d;
    }

    private a(long j10, long j11, int i10, MotionEvent motionEvent) {
        this.f38738a = j10;
        this.f38739b = j11;
        this.f38740c = i10;
        this.f38741d = motionEvent;
    }
}
