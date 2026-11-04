package io.customer.messagingpush.processor;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.l1;
import androidx.core.app.p0;
import eh.d;
import io.customer.messagingpush.activity.NotificationClickReceiverActivity;
import io.customer.messagingpush.c;
import io.customer.messagingpush.data.model.CustomerIOParsedPushPayload;
import io.customer.messagingpush.f;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nPushMessageProcessorImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PushMessageProcessorImpl.kt\nio/customer/messagingpush/processor/PushMessageProcessorImpl\n+ 2 ApplicationInfoExtensions.kt\nio/customer/messagingpush/extensions/ApplicationInfoExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n19#2,10:239\n1#3:249\n*S KotlinDebug\n*F\n+ 1 PushMessageProcessorImpl.kt\nio/customer/messagingpush/processor/PushMessageProcessorImpl\n*L\n119#1:239,10\n*E\n"})
public final class b implements io.customer.messagingpush.processor.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final bh.a f288463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final c f288464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final io.customer.messagingpush.util.b f288465e;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f288466a;

        static {
            int[] iArr = new int[xg.a.values().length];
            try {
                iArr[xg.a.RESET_TASK_STACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[xg.a.ACTIVITY_PREVENT_RESTART.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[xg.a.ACTIVITY_NO_FLAGS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f288466a = iArr;
        }
    }

    public b(@NotNull bh.a pushLogger, @NotNull c moduleConfig, @NotNull io.customer.messagingpush.util.b deepLinkUtil) {
        Intrinsics.checkNotNullParameter(pushLogger, "pushLogger");
        Intrinsics.checkNotNullParameter(moduleConfig, "moduleConfig");
        Intrinsics.checkNotNullParameter(deepLinkUtil, "deepLinkUtil");
        this.f288463c = pushLogger;
        this.f288464d = moduleConfig;
        this.f288465e = deepLinkUtil;
    }

    private final f e() {
        return zg.c.h(d.f274883c);
    }

    private final void f(Context context, CustomerIOParsedPushPayload customerIOParsedPushPayload) {
        j(customerIOParsedPushPayload);
        g(context, customerIOParsedPushPayload);
    }

    private final void g(Context context, CustomerIOParsedPushPayload customerIOParsedPushPayload) {
        this.f288463c.k(customerIOParsedPushPayload, this.f288464d.c());
        String strM = customerIOParsedPushPayload.m();
        if (strM == null || StringsKt.w3(strM)) {
            strM = null;
        }
        yg.a aVarB = this.f288464d.b();
        if ((aVarB != null ? aVarB.b(customerIOParsedPushPayload, context) : null) != null) {
            this.f288463c.b();
            return;
        }
        Intent intentA = strM != null ? this.f288465e.a(context, strM) : null;
        if (intentA == null) {
            Intent intentB = strM != null ? this.f288465e.b(context, strM) : null;
            if (intentB != null) {
                this.f288463c.e();
                context.startActivity(intentB);
                return;
            }
        }
        Intent intentC = this.f288465e.c(context);
        if (intentA != null) {
            this.f288463c.c();
            h(context, intentA, customerIOParsedPushPayload);
        } else if (intentC == null) {
            this.f288463c.f();
        } else {
            this.f288463c.d();
            h(context, intentC, customerIOParsedPushPayload);
        }
    }

    private final void h(Context context, Intent intent, CustomerIOParsedPushPayload customerIOParsedPushPayload) {
        intent.putExtra(NotificationClickReceiverActivity.f288391d, customerIOParsedPushPayload);
        int i10 = a.f288466a[this.f288464d.c().ordinal()];
        if (i10 == 1) {
            p0 p0VarM = p0.m(context);
            p0VarM.d(intent);
            Intrinsics.checkNotNullExpressionValue(p0VarM, "apply(...)");
            p0VarM.w();
            return;
        }
        if (i10 == 2) {
            intent.setFlags(805306368);
            context.startActivity(intent);
        } else {
            if (i10 != 3) {
                throw new k0();
            }
            context.startActivity(intent);
        }
    }

    private final void i(String str, String str2) {
        if (!this.f288464d.a()) {
            this.f288463c.o();
            return;
        }
        this.f288463c.x(str);
        f.a.a(e(), str2, "Delivered", str, null, 8, null);
        d.f274883c.v().d(new io.customer.sdk.communication.a.g(str, kh.a.Delivered, str2));
    }

    private final void j(CustomerIOParsedPushPayload customerIOParsedPushPayload) {
        if (!this.f288464d.a()) {
            this.f288463c.o();
            return;
        }
        this.f288463c.y(customerIOParsedPushPayload);
        d.f274883c.v().d(new io.customer.sdk.communication.a.g(customerIOParsedPushPayload.k(), kh.a.Opened, customerIOParsedPushPayload.l()));
    }

    @Override // io.customer.messagingpush.processor.a
    public void a(@NotNull Context activityContext, @NotNull Intent intent) {
        Object objM785constructorimpl;
        Parcelable parcelable;
        Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            Result.a aVar = Result.Companion;
            Bundle extras = intent.getExtras();
            CustomerIOParsedPushPayload customerIOParsedPushPayload = null;
            Parcelable parcelable2 = null;
            if (extras != null) {
                if (Build.VERSION.SDK_INT > 33) {
                    parcelable = (Parcelable) extras.getParcelable(NotificationClickReceiverActivity.f288391d, CustomerIOParsedPushPayload.class);
                } else {
                    Parcelable parcelable3 = extras.getParcelable(NotificationClickReceiverActivity.f288391d);
                    if (parcelable3 instanceof CustomerIOParsedPushPayload) {
                        parcelable2 = parcelable3;
                    }
                    parcelable = (CustomerIOParsedPushPayload) parcelable2;
                }
                customerIOParsedPushPayload = (CustomerIOParsedPushPayload) parcelable;
            }
            if (customerIOParsedPushPayload == null) {
                this.f288463c.g(new IllegalArgumentException("Payload is null, cannot handle notification intent"));
            } else {
                f(activityContext, customerIOParsedPushPayload);
            }
            objM785constructorimpl = Result.m785constructorimpl(Unit.f312394a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thD = Result.d(objM785constructorimpl);
        if (thD != null) {
            this.f288463c.g(thD);
        }
    }

    @Override // io.customer.messagingpush.processor.a
    public void b(@NotNull String deliveryId, @NotNull String deliveryToken) {
        Intrinsics.checkNotNullParameter(deliveryId, "deliveryId");
        Intrinsics.checkNotNullParameter(deliveryToken, "deliveryToken");
        if (d(deliveryId)) {
            return;
        }
        i(deliveryId, deliveryToken);
    }

    @Override // io.customer.messagingpush.processor.a
    public void c(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Bundle extras = intent.getExtras();
        String string = extras != null ? extras.getString("CIO-Delivery-ID") : null;
        String string2 = extras != null ? extras.getString("CIO-Delivery-Token") : null;
        if (string != null && string2 != null && !d(string)) {
            i(string, string2);
        }
    }

    @l1
    public final synchronized boolean d(@Nullable String str) {
        if (str != null) {
            if (!StringsKt.w3(str)) {
                io.customer.messagingpush.processor.a.C1959a c1959a = io.customer.messagingpush.processor.a.f288458a;
                if (c1959a.a().contains(str)) {
                    this.f288463c.q(str);
                    return true;
                }
                if (c1959a.a().size() >= 10) {
                    c1959a.a().removeLast();
                }
                c1959a.a().addFirst(str);
                this.f288463c.s(str);
                return false;
            }
        }
        this.f288463c.v();
        return true;
    }
}
