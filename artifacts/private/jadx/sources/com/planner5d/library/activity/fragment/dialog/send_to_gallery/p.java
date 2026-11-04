package com.planner5d.library.activity.fragment.dialog.send_to_gallery;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 1)
public final class p extends k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f132930e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f132931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f132932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f132933d;

    public p() {
        this(false, false, false, 7, null);
    }

    public final boolean a() {
        return this.f132932c;
    }

    public final boolean b() {
        return this.f132933d;
    }

    public final boolean c() {
        return this.f132931b;
    }

    public /* synthetic */ p(boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? true : z12);
    }

    public p(boolean z10, boolean z11, boolean z12) {
        this.f132931b = z10;
        this.f132932c = z11;
        this.f132933d = z12;
    }
}
