package com.facebook.login.widget;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import com.facebook.login.m;
import com.facebook.login.p;
import com.facebook.login.z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends e {

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @Nullable
    private Uri f101584m3;

    /* JADX INFO: renamed from: com.facebook.login.widget.a$a, reason: collision with other inner class name */
    private final class C0913a extends e.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f101585b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0913a(a this$0) {
            super(this$0);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f101585b = this$0;
        }

        @Override // com.facebook.login.widget.e.c
        @NotNull
        protected z b() {
            if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                return null;
            }
            try {
                m mVarA = m.f101510t.a();
                mVarA.D0(this.f101585b.getDefaultAudience());
                mVarA.G0(p.DEVICE_AUTH);
                mVarA.V0(this.f101585b.getDeviceRedirectUri());
                return mVarA;
            } catch (Throwable th2) {
                com.facebook.internal.instrument.crashshield.b.c(th2, this);
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, @NotNull AttributeSet attrs, int i10) {
        super(context, attrs, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    @Nullable
    public final Uri getDeviceRedirectUri() {
        return this.f101584m3;
    }

    @Override // com.facebook.login.widget.e
    @NotNull
    protected e.c getNewLoginClickListener() {
        return new C0913a(this);
    }

    public final void setDeviceRedirectUri(@Nullable Uri uri) {
        this.f101584m3 = uri;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
