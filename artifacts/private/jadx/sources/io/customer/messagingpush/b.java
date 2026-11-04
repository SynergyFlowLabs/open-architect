package io.customer.messagingpush;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.app.w;
import com.google.firebase.messaging.RemoteMessage;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.customer.messagingpush.activity.NotificationClickReceiverActivity;
import io.customer.messagingpush.data.model.CustomerIOParsedPushPayload;
import java.net.URL;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.j;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nCustomerIOPushNotificationHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerIOPushNotificationHandler.kt\nio/customer/messagingpush/CustomerIOPushNotificationHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,248:1\n1#2:249\n*E\n"})
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f288394g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f288395h = "link";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f288396i = "image";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final String f288397j = "title";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final String f288398k = "body";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final String f288399l = "requestCode";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final String f288400m = "com.google.firebase.messaging.default_notification_icon";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private static final String f288401n = "com.google.firebase.messaging.default_notification_color";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.customer.messagingpush.processor.a f288402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final RemoteMessage f288403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final io.customer.messagingpush.util.f f288404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final eh.d f288405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final bh.a f288406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final f0 f288407f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: io.customer.messagingpush.b$b, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "io.customer.messagingpush.CustomerIOPushNotificationHandler$addImage$1", f = "CustomerIOPushNotificationHandler.kt", i = {0}, l = {234}, m = "invokeSuspend", n = {"style"}, s = {"L$0"})
    static final class C1955b extends o implements Function2<s0, kotlin.coroutines.d<? super w.n>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f288408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f288409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bitmap f288410c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f288411d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f288412e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ w.n f288413f;

        /* JADX INFO: renamed from: io.customer.messagingpush.b$b$a */
        @kotlin.coroutines.jvm.internal.f(c = "io.customer.messagingpush.CustomerIOPushNotificationHandler$addImage$1$1", f = "CustomerIOPushNotificationHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements Function2<s0, kotlin.coroutines.d<? super Bitmap>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f288414a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ URL f288415b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(URL url, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f288415b = url;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f288415b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f288414a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                try {
                    return BitmapFactory.decodeStream(FirebasePerfUrlConnection.openStream(this.f288415b));
                } catch (Exception unused) {
                    return null;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Bitmap> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1955b(Bitmap bitmap, String str, String str2, w.n nVar, kotlin.coroutines.d<? super C1955b> dVar) {
            super(2, dVar);
            this.f288410c = bitmap;
            this.f288411d = str;
            this.f288412e = str2;
            this.f288413f = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C1955b(this.f288410c, this.f288411d, this.f288412e, this.f288413f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            w.k kVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f288409b;
            if (i10 == 0) {
                ResultKt.m(obj);
                w.k kVarI = new w.k().B(this.f288410c).I(this.f288411d);
                Intrinsics.checkNotNullExpressionValue(kVarI, "setSummaryText(...)");
                URL url = new URL(this.f288412e);
                n0 n0VarC = l1.c();
                a aVar = new a(url, null);
                this.f288408a = kVarI;
                this.f288409b = 1;
                Object objH = kotlinx.coroutines.i.h(n0VarC, aVar, this);
                if (objH == objL) {
                    return objL;
                }
                kVar = kVarI;
                obj = objH;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kVar = (w.k) this.f288408a;
                ResultKt.m(obj);
            }
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap == null) {
                return null;
            }
            w.n nVar = this.f288413f;
            kVar.D(bitmap);
            nVar.b0(bitmap);
            return nVar.z0(kVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super w.n> dVar) {
            return ((C1955b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public b(@NotNull io.customer.messagingpush.processor.a pushMessageProcessor, @NotNull RemoteMessage remoteMessage, @NotNull io.customer.messagingpush.util.f notificationChannelCreator) {
        Intrinsics.checkNotNullParameter(pushMessageProcessor, "pushMessageProcessor");
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        Intrinsics.checkNotNullParameter(notificationChannelCreator, "notificationChannelCreator");
        this.f288402a = pushMessageProcessor;
        this.f288403b = remoteMessage;
        this.f288404c = notificationChannelCreator;
        eh.d dVar = eh.d.f274883c;
        this.f288405d = dVar;
        this.f288406e = zg.c.i(dVar);
        this.f288407f = g0.c(new Function0() { // from class: io.customer.messagingpush.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.d(this.f288389a);
            }
        });
    }

    private final w.n b(String str, w.n nVar, String str2, Bitmap bitmap) {
        return (w.n) j.b(null, new C1955b(bitmap, str2, str, nVar, null), 1, null);
    }

    static /* synthetic */ w.n c(b bVar, String str, w.n nVar, String str2, Bitmap bitmap, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            bitmap = null;
        }
        return bVar.b(str, nVar, str2, bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle d(b bVar) {
        Bundle bundle = new Bundle();
        Map<String, String> mapT1 = bVar.f288403b.T1();
        Intrinsics.checkNotNullExpressionValue(mapT1, "getData(...)");
        for (Map.Entry<String, String> entry : mapT1.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    private final Bundle f() {
        return (Bundle) this.f288407f.getValue();
    }

    private final c g() {
        return zg.c.k(this.f288405d);
    }

    public static /* synthetic */ boolean i(b bVar, Context context, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return bVar.h(context, z10);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00bc A[PHI: r6
      0x00bc: PHI (r6v7 java.lang.String) = (r6v6 java.lang.String), (r6v28 java.lang.String) binds: [B:35:0x00a8, B:40:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x00dd A[PHI: r6
      0x00dd: PHI (r6v10 java.lang.String) = (r6v9 java.lang.String), (r6v23 java.lang.String) binds: [B:44:0x00c9, B:49:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x004a A[PHI: r3
      0x004a: PHI (r3v12 java.lang.Integer) = (r3v4 java.lang.Integer), (r3v15 java.lang.Integer) binds: [B:12:0x0059, B:7:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    private final void j(Context context, String str, String str2) {
        Integer numA;
        int iIntValue;
        Integer numA2;
        String strB;
        Integer numA3;
        String str3;
        String str4;
        String str5;
        String str6;
        Uri uriL;
        String strF;
        String strK;
        this.f288406e.w(this.f288403b);
        String string = context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
        int iAbs = Math.abs((int) System.currentTimeMillis());
        f().putInt(f288399l, iAbs);
        Bundle bundleA = gh.c.a(context);
        RemoteMessage.d dVarP2 = this.f288403b.p2();
        String string2 = null;
        if (dVarP2 == null || (strK = dVarP2.k()) == null || (numA = ah.b.b(context, strK)) == null) {
            numA = bundleA != null ? ah.a.a(bundleA, "com.google.firebase.messaging.default_notification_icon") : null;
            if (numA != null) {
                iIntValue = numA.intValue();
            } else {
                iIntValue = context.getApplicationInfo().icon;
            }
        } else {
            iIntValue = numA.intValue();
        }
        RemoteMessage.d dVarP3 = this.f288403b.p2();
        if (dVarP3 == null || (strF = dVarP3.f()) == null || (numA2 = ah.c.a(strF)) == null) {
            Integer numA4 = (bundleA == null || (numA3 = ah.a.a(bundleA, "com.google.firebase.messaging.default_notification_color")) == null) ? null : ah.b.a(context, numA3.intValue());
            if (numA4 == null) {
                numA2 = (bundleA == null || (strB = ah.a.b(bundleA, "com.google.firebase.messaging.default_notification_color")) == null) ? null : ah.c.a(strB);
            } else {
                numA2 = numA4;
            }
        }
        String string3 = f().getString("title");
        if (string3 != null) {
            str3 = string3;
        } else {
            RemoteMessage.d dVarP4 = this.f288403b.p2();
            string3 = dVarP4 != null ? dVarP4.w() : null;
            if (string3 == null) {
                str3 = "";
            } else {
                str3 = string3;
            }
        }
        String string4 = f().getString("body");
        if (string4 == null) {
            RemoteMessage.d dVarP5 = this.f288403b.p2();
            string4 = dVarP5 != null ? dVarP5.a() : null;
            str4 = string4 != null ? string4 : "";
        }
        Object systemService = context.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        w.n nVarZ0 = new w.n(context, this.f288404c.a(context, string, bundleA, notificationManager)).t0(iIntValue).O(str3).N(str4).C(true).x0(RingtoneManager.getDefaultUri(2)).B0(string).z0(new w.l().A(str4));
        Intrinsics.checkNotNullExpressionValue(nVarZ0, "setStyle(...)");
        if (numA2 != null) {
            nVarZ0.I(numA2.intValue());
        }
        try {
            String string5 = f().getString("image");
            if (string5 == null) {
                RemoteMessage.d dVarP6 = this.f288403b.p2();
                if (dVarP6 != null && (uriL = dVarP6.l()) != null) {
                    string2 = uriL.toString();
                }
                str6 = string2;
            } else {
                str6 = string5;
            }
            if (str6 != null) {
                str5 = str4;
                try {
                    c(this, str6, nVarZ0, str5, null, 8, null);
                } catch (Exception e10) {
                    e = e10;
                    str5 = str5;
                    e.printStackTrace();
                }
            } else {
                str5 = str4;
            }
        } catch (Exception e11) {
            e = e11;
            str5 = str4;
        }
        CustomerIOParsedPushPayload customerIOParsedPushPayload = new CustomerIOParsedPushPayload(new Bundle(f()), f().getString("link"), str, str2, str3, str5);
        yg.a aVarB = g().b();
        if (aVarB != null) {
            aVarB.a(customerIOParsedPushPayload, nVarZ0);
        }
        nVarZ0.M(e(context, iAbs, customerIOParsedPushPayload));
        Notification notificationH = nVarZ0.h();
        Intrinsics.checkNotNullExpressionValue(notificationH, "build(...)");
        notificationManager.notify(iAbs, notificationH);
    }

    @androidx.annotation.l1(otherwise = 2)
    @NotNull
    public final PendingIntent e(@NotNull Context context, int i10, @NotNull CustomerIOParsedPushPayload payload) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intent intent = new Intent(context, (Class<?>) NotificationClickReceiverActivity.class);
        intent.putExtra(NotificationClickReceiverActivity.f288391d, payload);
        PendingIntent activity = PendingIntent.getActivity(context, i10, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        return activity;
    }

    public final boolean h(@NotNull Context context, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f288406e.u(this.f288403b, z10);
        if (f().isEmpty()) {
            this.f288406e.r();
            return false;
        }
        String string = f().getString("CIO-Delivery-ID");
        String string2 = f().getString("CIO-Delivery-Token");
        if (string == null || string2 == null) {
            this.f288406e.t();
            return false;
        }
        this.f288406e.p();
        this.f288402a.b(string, string2);
        if (z10) {
            j(context, string, string2);
        }
        return true;
    }
}
