package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RemoteViews;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.v0;
import androidx.annotation.w0;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class w {
    public static final int A = 2;

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public static final int A0 = 3;

    @e.a({"ActionValue"})
    public static final String B = "android.title";
    public static final int B0 = 1;

    @e.a({"ActionValue"})
    public static final String C = "android.title.big";
    public static final int C0 = 0;

    @e.a({"ActionValue"})
    public static final String D = "android.text";
    public static final int D0 = -1;

    @e.a({"ActionValue"})
    public static final String E = "android.subText";
    public static final String E0 = "call";

    @e.a({"ActionValue"})
    public static final String F = "android.remoteInputHistory";
    public static final String F0 = "navigation";

    @e.a({"ActionValue"})
    public static final String G = "android.infoText";
    public static final String G0 = "msg";

    @e.a({"ActionValue"})
    public static final String H = "android.summaryText";
    public static final String H0 = "email";

    @e.a({"ActionValue"})
    public static final String I = "android.bigText";
    public static final String I0 = "event";

    @e.a({"ActionValue"})
    public static final String J = "android.icon";
    public static final String J0 = "promo";

    @e.a({"ActionValue"})
    public static final String K = "android.largeIcon";
    public static final String K0 = "alarm";

    @e.a({"ActionValue"})
    public static final String L = "android.largeIcon.big";
    public static final String L0 = "progress";

    @e.a({"ActionValue"})
    public static final String M = "android.progress";
    public static final String M0 = "social";

    @e.a({"ActionValue"})
    public static final String N = "android.progressMax";
    public static final String N0 = "err";

    @e.a({"ActionValue"})
    public static final String O = "android.progressIndeterminate";
    public static final String O0 = "transport";

    @e.a({"ActionValue"})
    public static final String P = "android.showChronometer";
    public static final String P0 = "sys";

    @e.a({"ActionValue"})
    public static final String Q = "android.chronometerCountDown";
    public static final String Q0 = "service";

    @e.a({"ActionValue"})
    public static final String R = "android.colorized";
    public static final String R0 = "reminder";

    @e.a({"ActionValue"})
    public static final String S = "android.showWhen";
    public static final String S0 = "recommendation";

    @e.a({"ActionValue"})
    public static final String T = "android.picture";
    public static final String T0 = "status";

    @e.a({"ActionValue"})
    public static final String U = "android.pictureIcon";
    public static final String U0 = "workout";

    @e.a({"ActionValue"})
    public static final String V = "android.pictureContentDescription";
    public static final String V0 = "location_sharing";

    @e.a({"ActionValue"})
    public static final String W = "android.showBigPictureWhenCollapsed";
    public static final String W0 = "stopwatch";

    @e.a({"ActionValue"})
    public static final String X = "android.textLines";
    public static final String X0 = "missed_call";

    @e.a({"ActionValue"})
    public static final String Y = "android.template";
    public static final String Y0 = "voicemail";
    public static final String Z = "androidx.core.app.extra.COMPAT_TEMPLATE";
    public static final int Z0 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f47196a = "NotifCompat";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @e.a({"ActionValue"})
    @Deprecated
    public static final String f47197a0 = "android.people";

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final int f47198a1 = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e.a({"ActionValue"})
    public static final String f47199b = "android.intent.category.NOTIFICATION_PREFERENCES";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @e.a({"ActionValue"})
    public static final String f47200b0 = "android.people.list";

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final int f47201b1 = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e.a({"ActionValue"})
    public static final String f47202c = "android.intent.extra.CHANNEL_ID";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @e.a({"ActionValue"})
    public static final String f47203c0 = "android.backgroundImageUri";

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final int f47204c1 = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e.a({"ActionValue"})
    public static final String f47205d = "android.intent.extra.CHANNEL_GROUP_ID";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @e.a({"ActionValue"})
    public static final String f47206d0 = "android.mediaSession";

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final int f47207d1 = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e.a({"ActionValue"})
    public static final String f47208e = "android.intent.extra.NOTIFICATION_TAG";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @e.a({"ActionValue"})
    public static final String f47209e0 = "android.compactActions";

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final int f47210e1 = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @e.a({"ActionValue"})
    public static final String f47211f = "android.intent.extra.NOTIFICATION_ID";

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    @e.a({"ActionValue"})
    public static final String f47212f0 = "android.selfDisplayName";

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final String f47213f1 = "silent";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f47214g = -1;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    @e.a({"ActionValue"})
    public static final String f47215g0 = "android.messagingStyleUser";

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final int f47216g1 = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f47217h = 1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    @e.a({"ActionValue"})
    public static final String f47218h0 = "android.conversationTitle";

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final int f47219h1 = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f47220i = 2;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    @e.a({"ActionValue"})
    public static final String f47221i0 = "android.messages";

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final int f47222i1 = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f47223j = 4;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    @e.a({"ActionValue"})
    public static final String f47224j0 = "android.messages.historic";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f47225k = -1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    @e.a({"ActionValue"})
    public static final String f47226k0 = "android.isGroupConversation";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f47227l = 1;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    @e.a({"ActionValue"})
    public static final String f47228l0 = "android.callType";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f47229m = 2;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    @e.a({"ActionValue"})
    public static final String f47230m0 = "android.callIsVideo";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f47231n = 4;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    @e.a({"ActionValue"})
    public static final String f47232n0 = "android.callPerson";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f47233o = 8;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    @e.a({"ActionValue"})
    public static final String f47234o0 = "android.callPersonCompat";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f47235p = 16;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @e.a({"ActionValue"})
    public static final String f47236p0 = "android.verificationIcon";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f47237q = 32;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @e.a({"ActionValue"})
    public static final String f47238q0 = "android.verificationIconCompat";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f47239r = 64;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @e.a({"ActionValue"})
    public static final String f47240r0 = "android.verificationText";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Deprecated
    public static final int f47241s = 128;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @e.a({"ActionValue"})
    public static final String f47242s0 = "android.answerIntent";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f47243t = 256;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @e.a({"ActionValue"})
    public static final String f47244t0 = "android.declineIntent";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f47245u = 512;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @e.a({"ActionValue"})
    public static final String f47246u0 = "android.hangUpIntent";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f47247v = 4096;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    @e.a({"ActionValue"})
    public static final String f47248v0 = "android.answerColor";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f47249w = 0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @e.a({"ActionValue"})
    public static final String f47250w0 = "android.declineColor";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f47251x = -1;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @e.a({"ActionValue"})
    public static final String f47252x0 = "android.hiddenConversationTitle";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f47253y = -2;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @e.a({"ActionValue"})
    public static final String f47254y0 = "android.audioContents";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f47255z = 1;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    @androidx.annotation.l
    public static final int f47256z0 = 0;

    public static class b {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f47283m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f47284n = 1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f47285o = 2;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f47286p = 3;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f47287q = 4;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f47288r = 5;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f47289s = 6;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f47290t = 7;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final int f47291u = 8;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f47292v = 9;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f47293w = 10;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        static final String f47294x = "android.support.action.showsUserInterface";

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        static final String f47295y = "android.support.action.semanticAction";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Bundle f47296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private IconCompat f47297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final l0[] f47298c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final l0[] f47299d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f47300e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f47301f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f47302g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f47303h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Deprecated
        public int f47304i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public CharSequence f47305j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @androidx.annotation.p0
        public PendingIntent f47306k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f47307l;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final IconCompat f47308a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final CharSequence f47309b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final PendingIntent f47310c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f47311d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final Bundle f47312e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private ArrayList<l0> f47313f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f47314g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private boolean f47315h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private boolean f47316i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private boolean f47317j;

            /* JADX INFO: renamed from: androidx.core.app.w$b$a$a, reason: collision with other inner class name */
            @w0(20)
            static class C0379a {
                private C0379a() {
                }

                static Bundle a(Notification.Action action) {
                    return action.getExtras();
                }

                static RemoteInput[] b(Notification.Action action) {
                    return action.getRemoteInputs();
                }
            }

            /* JADX INFO: renamed from: androidx.core.app.w$b$a$b, reason: collision with other inner class name */
            @w0(23)
            static class C0380b {
                private C0380b() {
                }

                static Icon a(Notification.Action action) {
                    return action.getIcon();
                }
            }

            @w0(24)
            static class c {
                private c() {
                }

                static boolean a(Notification.Action action) {
                    return action.getAllowGeneratedReplies();
                }
            }

            @w0(28)
            static class d {
                private d() {
                }

                static int a(Notification.Action action) {
                    return action.getSemanticAction();
                }
            }

            @w0(29)
            static class e {
                private e() {
                }

                static boolean a(Notification.Action action) {
                    return action.isContextual();
                }
            }

            @w0(31)
            static class f {
                private f() {
                }

                static boolean a(Notification.Action action) {
                    return action.isAuthenticationRequired();
                }
            }

            public a(@androidx.annotation.p0 IconCompat iconCompat, @androidx.annotation.p0 CharSequence charSequence, @androidx.annotation.p0 PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            private void d() {
                if (this.f47316i && this.f47310c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            @NonNull
            @b1({b1.a.LIBRARY_GROUP_PREFIX})
            public static a f(@NonNull Notification.Action action) {
                a aVar = C0380b.a(action) != null ? new a(IconCompat.o(C0380b.a(action)), action.title, action.actionIntent) : new a(action.icon, action.title, action.actionIntent);
                RemoteInput[] remoteInputArrB = C0379a.b(action);
                if (remoteInputArrB != null && remoteInputArrB.length != 0) {
                    for (RemoteInput remoteInput : remoteInputArrB) {
                        aVar.b(l0.e(remoteInput));
                    }
                }
                int i10 = Build.VERSION.SDK_INT;
                aVar.f47311d = c.a(action);
                aVar.k(d.a(action));
                aVar.j(e.a(action));
                if (i10 >= 31) {
                    aVar.i(f.a(action));
                }
                aVar.a(C0379a.a(action));
                return aVar;
            }

            @NonNull
            public a a(@androidx.annotation.p0 Bundle bundle) {
                if (bundle != null) {
                    this.f47312e.putAll(bundle);
                }
                return this;
            }

            @NonNull
            public a b(@androidx.annotation.p0 l0 l0Var) {
                if (this.f47313f == null) {
                    this.f47313f = new ArrayList<>();
                }
                if (l0Var != null) {
                    this.f47313f.add(l0Var);
                }
                return this;
            }

            @NonNull
            public b c() {
                d();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<l0> arrayList3 = this.f47313f;
                if (arrayList3 != null) {
                    for (l0 l0Var : arrayList3) {
                        if (l0Var.r()) {
                            arrayList.add(l0Var);
                        } else {
                            arrayList2.add(l0Var);
                        }
                    }
                }
                return new b(this.f47308a, this.f47309b, this.f47310c, this.f47312e, arrayList2.isEmpty() ? null : (l0[]) arrayList2.toArray(new l0[arrayList2.size()]), arrayList.isEmpty() ? null : (l0[]) arrayList.toArray(new l0[arrayList.size()]), this.f47311d, this.f47314g, this.f47315h, this.f47316i, this.f47317j);
            }

            @NonNull
            public a e(@NonNull InterfaceC0381b interfaceC0381b) {
                interfaceC0381b.a(this);
                return this;
            }

            @NonNull
            public Bundle g() {
                return this.f47312e;
            }

            @NonNull
            public a h(boolean z10) {
                this.f47311d = z10;
                return this;
            }

            @NonNull
            public a i(boolean z10) {
                this.f47317j = z10;
                return this;
            }

            @NonNull
            public a j(boolean z10) {
                this.f47316i = z10;
                return this;
            }

            @NonNull
            public a k(int i10) {
                this.f47314g = i10;
                return this;
            }

            @NonNull
            public a l(boolean z10) {
                this.f47315h = z10;
                return this;
            }

            public a(int i10, @androidx.annotation.p0 CharSequence charSequence, @androidx.annotation.p0 PendingIntent pendingIntent) {
                this(i10 != 0 ? IconCompat.y(null, "", i10) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public a(@NonNull b bVar) {
                this(bVar.f(), bVar.f47305j, bVar.f47306k, new Bundle(bVar.f47296a), bVar.g(), bVar.b(), bVar.h(), bVar.f47301f, bVar.l(), bVar.k());
            }

            private a(@androidx.annotation.p0 IconCompat iconCompat, @androidx.annotation.p0 CharSequence charSequence, @androidx.annotation.p0 PendingIntent pendingIntent, @NonNull Bundle bundle, @androidx.annotation.p0 l0[] l0VarArr, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
                this.f47311d = true;
                this.f47315h = true;
                this.f47308a = iconCompat;
                this.f47309b = n.A(charSequence);
                this.f47310c = pendingIntent;
                this.f47312e = bundle;
                this.f47313f = l0VarArr == null ? null : new ArrayList<>(Arrays.asList(l0VarArr));
                this.f47311d = z10;
                this.f47314g = i10;
                this.f47315h = z11;
                this.f47316i = z12;
                this.f47317j = z13;
            }
        }

        /* JADX INFO: renamed from: androidx.core.app.w$b$b, reason: collision with other inner class name */
        public interface InterfaceC0381b {
            @NonNull
            a a(@NonNull a aVar);
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface c {
        }

        public b(int i10, @androidx.annotation.p0 CharSequence charSequence, @androidx.annotation.p0 PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.y(null, "", i10) : null, charSequence, pendingIntent);
        }

        @androidx.annotation.p0
        public PendingIntent a() {
            return this.f47306k;
        }

        public boolean b() {
            return this.f47300e;
        }

        @androidx.annotation.p0
        public l0[] c() {
            return this.f47299d;
        }

        @NonNull
        public Bundle d() {
            return this.f47296a;
        }

        @Deprecated
        public int e() {
            return this.f47304i;
        }

        @androidx.annotation.p0
        public IconCompat f() {
            int i10;
            if (this.f47297b == null && (i10 = this.f47304i) != 0) {
                this.f47297b = IconCompat.y(null, "", i10);
            }
            return this.f47297b;
        }

        @androidx.annotation.p0
        public l0[] g() {
            return this.f47298c;
        }

        public int h() {
            return this.f47302g;
        }

        public boolean i() {
            return this.f47301f;
        }

        @androidx.annotation.p0
        public CharSequence j() {
            return this.f47305j;
        }

        public boolean k() {
            return this.f47307l;
        }

        public boolean l() {
            return this.f47303h;
        }

        public static final class d implements InterfaceC0381b {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static final String f47318e = "android.wearable.EXTENSIONS";

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static final String f47319f = "flags";

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static final String f47320g = "inProgressLabel";

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static final String f47321h = "confirmLabel";

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static final String f47322i = "cancelLabel";

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static final int f47323j = 1;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private static final int f47324k = 2;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private static final int f47325l = 4;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private static final int f47326m = 1;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f47327a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private CharSequence f47328b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private CharSequence f47329c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private CharSequence f47330d;

            public d() {
                this.f47327a = 1;
            }

            private void l(int i10, boolean z10) {
                if (z10) {
                    this.f47327a = i10 | this.f47327a;
                } else {
                    this.f47327a = (~i10) & this.f47327a;
                }
            }

            @Override // androidx.core.app.w.b.InterfaceC0381b
            @NonNull
            public a a(@NonNull a aVar) {
                Bundle bundle = new Bundle();
                int i10 = this.f47327a;
                if (i10 != 1) {
                    bundle.putInt(f47319f, i10);
                }
                CharSequence charSequence = this.f47328b;
                if (charSequence != null) {
                    bundle.putCharSequence(f47320g, charSequence);
                }
                CharSequence charSequence2 = this.f47329c;
                if (charSequence2 != null) {
                    bundle.putCharSequence(f47321h, charSequence2);
                }
                CharSequence charSequence3 = this.f47330d;
                if (charSequence3 != null) {
                    bundle.putCharSequence(f47322i, charSequence3);
                }
                aVar.g().putBundle(f47318e, bundle);
                return aVar;
            }

            @NonNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d clone() {
                d dVar = new d();
                dVar.f47327a = this.f47327a;
                dVar.f47328b = this.f47328b;
                dVar.f47329c = this.f47329c;
                dVar.f47330d = this.f47330d;
                return dVar;
            }

            @androidx.annotation.p0
            @Deprecated
            public CharSequence c() {
                return this.f47330d;
            }

            @androidx.annotation.p0
            @Deprecated
            public CharSequence d() {
                return this.f47329c;
            }

            public boolean e() {
                return (this.f47327a & 4) != 0;
            }

            public boolean f() {
                return (this.f47327a & 2) != 0;
            }

            @androidx.annotation.p0
            @Deprecated
            public CharSequence g() {
                return this.f47328b;
            }

            public boolean h() {
                return (this.f47327a & 1) != 0;
            }

            @NonNull
            public d i(boolean z10) {
                l(1, z10);
                return this;
            }

            @NonNull
            @Deprecated
            public d j(@androidx.annotation.p0 CharSequence charSequence) {
                this.f47330d = charSequence;
                return this;
            }

            @NonNull
            @Deprecated
            public d k(@androidx.annotation.p0 CharSequence charSequence) {
                this.f47329c = charSequence;
                return this;
            }

            @NonNull
            public d m(boolean z10) {
                l(4, z10);
                return this;
            }

            @NonNull
            public d n(boolean z10) {
                l(2, z10);
                return this;
            }

            @NonNull
            @Deprecated
            public d o(@androidx.annotation.p0 CharSequence charSequence) {
                this.f47328b = charSequence;
                return this;
            }

            public d(@NonNull b bVar) {
                this.f47327a = 1;
                Bundle bundle = bVar.d().getBundle(f47318e);
                if (bundle != null) {
                    this.f47327a = bundle.getInt(f47319f, 1);
                    this.f47328b = bundle.getCharSequence(f47320g);
                    this.f47329c = bundle.getCharSequence(f47321h);
                    this.f47330d = bundle.getCharSequence(f47322i);
                }
            }
        }

        public b(@androidx.annotation.p0 IconCompat iconCompat, @androidx.annotation.p0 CharSequence charSequence, @androidx.annotation.p0 PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (l0[]) null, (l0[]) null, true, 0, true, false, false);
        }

        b(int i10, @androidx.annotation.p0 CharSequence charSequence, @androidx.annotation.p0 PendingIntent pendingIntent, @androidx.annotation.p0 Bundle bundle, @androidx.annotation.p0 l0[] l0VarArr, @androidx.annotation.p0 l0[] l0VarArr2, boolean z10, int i11, boolean z11, boolean z12, boolean z13) {
            this(i10 != 0 ? IconCompat.y(null, "", i10) : null, charSequence, pendingIntent, bundle, l0VarArr, l0VarArr2, z10, i11, z11, z12, z13);
        }

        b(@androidx.annotation.p0 IconCompat iconCompat, @androidx.annotation.p0 CharSequence charSequence, @androidx.annotation.p0 PendingIntent pendingIntent, @androidx.annotation.p0 Bundle bundle, @androidx.annotation.p0 l0[] l0VarArr, @androidx.annotation.p0 l0[] l0VarArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
            this.f47301f = true;
            this.f47297b = iconCompat;
            if (iconCompat != null && iconCompat.c() == 2) {
                this.f47304i = iconCompat.A();
            }
            this.f47305j = n.A(charSequence);
            this.f47306k = pendingIntent;
            this.f47296a = bundle == null ? new Bundle() : bundle;
            this.f47298c = l0VarArr;
            this.f47299d = l0VarArr2;
            this.f47300e = z10;
            this.f47302g = i10;
            this.f47301f = z11;
            this.f47303h = z12;
            this.f47307l = z13;
        }
    }

    @w0(20)
    static class c {
        private c() {
        }

        static boolean a(RemoteInput remoteInput) {
            return remoteInput.getAllowFreeFormInput();
        }

        static CharSequence[] b(RemoteInput remoteInput) {
            return remoteInput.getChoices();
        }

        static Bundle c(Notification.Action action) {
            return action.getExtras();
        }

        static Bundle d(RemoteInput remoteInput) {
            return remoteInput.getExtras();
        }

        static String e(Notification notification) {
            return notification.getGroup();
        }

        static CharSequence f(RemoteInput remoteInput) {
            return remoteInput.getLabel();
        }

        static RemoteInput[] g(Notification.Action action) {
            return action.getRemoteInputs();
        }

        static String h(RemoteInput remoteInput) {
            return remoteInput.getResultKey();
        }

        static String i(Notification notification) {
            return notification.getSortKey();
        }
    }

    @w0(23)
    static class d {
        private d() {
        }

        static Icon a(Notification.Action action) {
            return action.getIcon();
        }
    }

    @w0(24)
    static class e {
        private e() {
        }

        static boolean a(Notification.Action action) {
            return action.getAllowGeneratedReplies();
        }
    }

    @w0(26)
    static class f {
        private f() {
        }

        static int a(Notification notification) {
            return notification.getBadgeIconType();
        }

        static String b(Notification notification) {
            return notification.getChannelId();
        }

        static int c(Notification notification) {
            return notification.getGroupAlertBehavior();
        }

        static CharSequence d(Notification notification) {
            return notification.getSettingsText();
        }

        static String e(Notification notification) {
            return notification.getShortcutId();
        }

        static long f(Notification notification) {
            return notification.getTimeoutAfter();
        }
    }

    @w0(28)
    static class g {
        private g() {
        }

        static int a(Notification.Action action) {
            return action.getSemanticAction();
        }
    }

    @w0(29)
    static class h {
        private h() {
        }

        static boolean a(Notification notification) {
            return notification.getAllowSystemGeneratedContextualActions();
        }

        static Notification.BubbleMetadata b(Notification notification) {
            return notification.getBubbleMetadata();
        }

        static int c(RemoteInput remoteInput) {
            return remoteInput.getEditChoicesBeforeSending();
        }

        static LocusId d(Notification notification) {
            return notification.getLocusId();
        }

        static boolean e(Notification.Action action) {
            return action.isContextual();
        }
    }

    @w0(31)
    static class i {
        private i() {
        }

        static boolean a(Notification.Action action) {
            return action.isAuthenticationRequired();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public @interface j {
    }

    public static class k extends y {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f47331j = "androidx.core.app.NotificationCompat$BigPictureStyle";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private IconCompat f47332e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private IconCompat f47333f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f47334g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private CharSequence f47335h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f47336i;

        @w0(23)
        private static class a {
            private a() {
            }

            @w0(23)
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        @w0(31)
        private static class b {
            private b() {
            }

            @w0(31)
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            @w0(31)
            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            @w0(31)
            static void c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
                bigPictureStyle.showBigPictureWhenCollapsed(z10);
            }
        }

        public k() {
        }

        @androidx.annotation.p0
        private static IconCompat A(@androidx.annotation.p0 Parcelable parcelable) {
            if (parcelable == null) {
                return null;
            }
            if (parcelable instanceof Icon) {
                return IconCompat.n((Icon) parcelable);
            }
            if (parcelable instanceof Bitmap) {
                return IconCompat.t((Bitmap) parcelable);
            }
            return null;
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        @androidx.annotation.p0
        public static IconCompat F(@androidx.annotation.p0 Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            Parcelable parcelable = bundle.getParcelable(w.T);
            return parcelable != null ? A(parcelable) : A(bundle.getParcelable(w.U));
        }

        @NonNull
        public k B(@androidx.annotation.p0 Bitmap bitmap) {
            this.f47333f = bitmap == null ? null : IconCompat.t(bitmap);
            this.f47334g = true;
            return this;
        }

        @NonNull
        @w0(23)
        public k C(@androidx.annotation.p0 Icon icon) {
            this.f47333f = icon == null ? null : IconCompat.n(icon);
            this.f47334g = true;
            return this;
        }

        @NonNull
        public k D(@androidx.annotation.p0 Bitmap bitmap) {
            this.f47332e = bitmap == null ? null : IconCompat.t(bitmap);
            return this;
        }

        @NonNull
        @w0(31)
        public k E(@androidx.annotation.p0 Icon icon) {
            this.f47332e = IconCompat.n(icon);
            return this;
        }

        @NonNull
        public k G(@androidx.annotation.p0 CharSequence charSequence) {
            this.f47451b = n.A(charSequence);
            return this;
        }

        @NonNull
        @w0(31)
        public k H(@androidx.annotation.p0 CharSequence charSequence) {
            this.f47335h = charSequence;
            return this;
        }

        @NonNull
        public k I(@androidx.annotation.p0 CharSequence charSequence) {
            this.f47452c = n.A(charSequence);
            this.f47453d = true;
            return this;
        }

        @NonNull
        @w0(31)
        public k J(boolean z10) {
            this.f47336i = z10;
            return this;
        }

        @Override // androidx.core.app.w.y
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public void b(androidx.core.app.t tVar) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(tVar.a()).setBigContentTitle(this.f47451b);
            IconCompat iconCompat = this.f47332e;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    b.a(bigContentTitle, this.f47332e.N(tVar instanceof androidx.core.app.y ? ((androidx.core.app.y) tVar).f() : null));
                } else if (iconCompat.c() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f47332e.z());
                }
            }
            if (this.f47334g) {
                if (this.f47333f == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    a.a(bigContentTitle, this.f47333f.N(tVar instanceof androidx.core.app.y ? ((androidx.core.app.y) tVar).f() : null));
                }
            }
            if (this.f47453d) {
                bigContentTitle.setSummaryText(this.f47452c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                b.c(bigContentTitle, this.f47336i);
                b.b(bigContentTitle, this.f47335h);
            }
        }

        @Override // androidx.core.app.w.y
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        protected void g(@NonNull Bundle bundle) {
            super.g(bundle);
            bundle.remove(w.L);
            bundle.remove(w.T);
            bundle.remove(w.U);
            bundle.remove(w.W);
        }

        @Override // androidx.core.app.w.y
        @NonNull
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        protected String t() {
            return f47331j;
        }

        @Override // androidx.core.app.w.y
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        protected void y(@NonNull Bundle bundle) {
            super.y(bundle);
            if (bundle.containsKey(w.L)) {
                this.f47333f = A(bundle.getParcelable(w.L));
                this.f47334g = true;
            }
            this.f47332e = F(bundle);
            this.f47336i = bundle.getBoolean(w.W);
        }

        public k(@androidx.annotation.p0 n nVar) {
            z(nVar);
        }
    }

    public static class l extends y {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f47337f = "androidx.core.app.NotificationCompat$BigTextStyle";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private CharSequence f47338e;

        public l() {
        }

        @NonNull
        public l A(@androidx.annotation.p0 CharSequence charSequence) {
            this.f47338e = n.A(charSequence);
            return this;
        }

        @NonNull
        public l B(@androidx.annotation.p0 CharSequence charSequence) {
            this.f47451b = n.A(charSequence);
            return this;
        }

        @NonNull
        public l C(@androidx.annotation.p0 CharSequence charSequence) {
            this.f47452c = n.A(charSequence);
            this.f47453d = true;
            return this;
        }

        @Override // androidx.core.app.w.y
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public void a(@NonNull Bundle bundle) {
            super.a(bundle);
        }

        @Override // androidx.core.app.w.y
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public void b(androidx.core.app.t tVar) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(tVar.a()).setBigContentTitle(this.f47451b).bigText(this.f47338e);
            if (this.f47453d) {
                bigTextStyleBigText.setSummaryText(this.f47452c);
            }
        }

        @Override // androidx.core.app.w.y
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        protected void g(@NonNull Bundle bundle) {
            super.g(bundle);
            bundle.remove(w.I);
        }

        @Override // androidx.core.app.w.y
        @NonNull
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        protected String t() {
            return f47337f;
        }

        @Override // androidx.core.app.w.y
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        protected void y(@NonNull Bundle bundle) {
            super.y(bundle);
            this.f47338e = bundle.getCharSequence(w.I);
        }

        public l(@androidx.annotation.p0 n nVar) {
            z(nVar);
        }
    }

    public static final class m {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f47339h = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f47340i = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private PendingIntent f47341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private PendingIntent f47342b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private IconCompat f47343c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f47344d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.annotation.q
        private int f47345e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f47346f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f47347g;

        @w0(29)
        private static class a {
            private a() {
            }

            @w0(29)
            @androidx.annotation.p0
            static m a(@androidx.annotation.p0 Notification.BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
                    return null;
                }
                c cVarI = new c(bubbleMetadata.getIntent(), IconCompat.n(bubbleMetadata.getIcon())).b(bubbleMetadata.getAutoExpandBubble()).c(bubbleMetadata.getDeleteIntent()).i(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    cVarI.d(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    cVarI.e(bubbleMetadata.getDesiredHeightResId());
                }
                return cVarI.a();
            }

            @w0(29)
            @androidx.annotation.p0
            static Notification.BubbleMetadata b(@androidx.annotation.p0 m mVar) {
                if (mVar == null || mVar.g() == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(mVar.f().M()).setIntent(mVar.g()).setDeleteIntent(mVar.c()).setAutoExpandBubble(mVar.b()).setSuppressNotification(mVar.i());
                if (mVar.d() != 0) {
                    suppressNotification.setDesiredHeight(mVar.d());
                }
                if (mVar.e() != 0) {
                    suppressNotification.setDesiredHeightResId(mVar.e());
                }
                return suppressNotification.build();
            }
        }

        @w0(30)
        private static class b {
            private b() {
            }

            @w0(30)
            @androidx.annotation.p0
            static m a(@androidx.annotation.p0 Notification.BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null) {
                    return null;
                }
                c cVar = bubbleMetadata.getShortcutId() != null ? new c(bubbleMetadata.getShortcutId()) : new c(bubbleMetadata.getIntent(), IconCompat.n(bubbleMetadata.getIcon()));
                cVar.b(bubbleMetadata.getAutoExpandBubble()).c(bubbleMetadata.getDeleteIntent()).i(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    cVar.d(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    cVar.e(bubbleMetadata.getDesiredHeightResId());
                }
                return cVar.a();
            }

            @w0(30)
            @androidx.annotation.p0
            static Notification.BubbleMetadata b(@androidx.annotation.p0 m mVar) {
                if (mVar == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder builder = mVar.h() != null ? new Notification.BubbleMetadata.Builder(mVar.h()) : new Notification.BubbleMetadata.Builder(mVar.g(), mVar.f().M());
                builder.setDeleteIntent(mVar.c()).setAutoExpandBubble(mVar.b()).setSuppressNotification(mVar.i());
                if (mVar.d() != 0) {
                    builder.setDesiredHeight(mVar.d());
                }
                if (mVar.e() != 0) {
                    builder.setDesiredHeightResId(mVar.e());
                }
                return builder.build();
            }
        }

        public static final class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private PendingIntent f47348a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private IconCompat f47349b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f47350c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @androidx.annotation.q
            private int f47351d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f47352e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private PendingIntent f47353f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private String f47354g;

            @Deprecated
            public c() {
            }

            @NonNull
            private c f(int i10, boolean z10) {
                if (z10) {
                    this.f47352e = i10 | this.f47352e;
                    return this;
                }
                this.f47352e = (~i10) & this.f47352e;
                return this;
            }

            @NonNull
            public m a() {
                String str = this.f47354g;
                if (str == null && this.f47348a == null) {
                    throw new NullPointerException("Must supply pending intent or shortcut to bubble");
                }
                if (str == null && this.f47349b == null) {
                    throw new NullPointerException("Must supply an icon or shortcut for the bubble");
                }
                m mVar = new m(this.f47348a, this.f47353f, this.f47349b, this.f47350c, this.f47351d, this.f47352e, str);
                mVar.j(this.f47352e);
                return mVar;
            }

            @NonNull
            public c b(boolean z10) {
                f(1, z10);
                return this;
            }

            @NonNull
            public c c(@androidx.annotation.p0 PendingIntent pendingIntent) {
                this.f47353f = pendingIntent;
                return this;
            }

            @NonNull
            public c d(@androidx.annotation.r(unit = 0) int i10) {
                this.f47350c = Math.max(i10, 0);
                this.f47351d = 0;
                return this;
            }

            @NonNull
            public c e(@androidx.annotation.q int i10) {
                this.f47351d = i10;
                this.f47350c = 0;
                return this;
            }

            @NonNull
            public c g(@NonNull IconCompat iconCompat) {
                if (this.f47354g != null) {
                    throw new IllegalStateException("Created as a shortcut bubble, cannot set an Icon. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                }
                if (iconCompat == null) {
                    throw new NullPointerException("Bubbles require non-null icon");
                }
                this.f47349b = iconCompat;
                return this;
            }

            @NonNull
            public c h(@NonNull PendingIntent pendingIntent) {
                if (this.f47354g != null) {
                    throw new IllegalStateException("Created as a shortcut bubble, cannot set a PendingIntent. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                }
                if (pendingIntent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                this.f47348a = pendingIntent;
                return this;
            }

            @NonNull
            public c i(boolean z10) {
                f(2, z10);
                return this;
            }

            @w0(30)
            public c(@NonNull String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new NullPointerException("Bubble requires a non-null shortcut id");
                }
                this.f47354g = str;
            }

            public c(@NonNull PendingIntent pendingIntent, @NonNull IconCompat iconCompat) {
                if (pendingIntent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                if (iconCompat != null) {
                    this.f47348a = pendingIntent;
                    this.f47349b = iconCompat;
                    return;
                }
                throw new NullPointerException("Bubbles require non-null icon");
            }
        }

        @androidx.annotation.p0
        public static m a(@androidx.annotation.p0 Notification.BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                return b.a(bubbleMetadata);
            }
            if (i10 == 29) {
                return a.a(bubbleMetadata);
            }
            return null;
        }

        @androidx.annotation.p0
        public static Notification.BubbleMetadata k(@androidx.annotation.p0 m mVar) {
            if (mVar == null) {
                return null;
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                return b.b(mVar);
            }
            if (i10 == 29) {
                return a.b(mVar);
            }
            return null;
        }

        public boolean b() {
            return (this.f47346f & 1) != 0;
        }

        @androidx.annotation.p0
        public PendingIntent c() {
            return this.f47342b;
        }

        @androidx.annotation.r(unit = 0)
        public int d() {
            return this.f47344d;
        }

        @androidx.annotation.q
        public int e() {
            return this.f47345e;
        }

        @e.a({"InvalidNullConversion"})
        @androidx.annotation.p0
        public IconCompat f() {
            return this.f47343c;
        }

        @e.a({"InvalidNullConversion"})
        @androidx.annotation.p0
        public PendingIntent g() {
            return this.f47341a;
        }

        @androidx.annotation.p0
        public String h() {
            return this.f47347g;
        }

        public boolean i() {
            return (this.f47346f & 2) != 0;
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public void j(int i10) {
            this.f47346f = i10;
        }

        private m(@androidx.annotation.p0 PendingIntent pendingIntent, @androidx.annotation.p0 PendingIntent pendingIntent2, @androidx.annotation.p0 IconCompat iconCompat, int i10, @androidx.annotation.q int i11, int i12, @androidx.annotation.p0 String str) {
            this.f47341a = pendingIntent;
            this.f47343c = iconCompat;
            this.f47344d = i10;
            this.f47345e = i11;
            this.f47342b = pendingIntent2;
            this.f47346f = i12;
            this.f47347g = str;
        }
    }

    public static class o extends y {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f47381o = "androidx.core.app.NotificationCompat$CallStyle";

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f47382p = 0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final int f47383q = 1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final int f47384r = 2;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final int f47385s = 3;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final String f47386t = "key_action_priority";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f47387e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private j0 f47388f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private PendingIntent f47389g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private PendingIntent f47390h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private PendingIntent f47391i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f47392j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Integer f47393k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Integer f47394l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private IconCompat f47395m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private CharSequence f47396n;

        @w0(20)
        static class a {
            private a() {
            }

            static Notification.Action.Builder a(Notification.Action.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            static Notification.Action.Builder b(Notification.Action.Builder builder, RemoteInput remoteInput) {
                return builder.addRemoteInput(remoteInput);
            }

            static Notification.Action c(Notification.Action.Builder builder) {
                return builder.build();
            }

            static Notification.Action.Builder d(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(i10, charSequence, pendingIntent);
            }
        }

        @w0(21)
        static class b {
            private b() {
            }

            static Notification.Builder a(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            static Notification.Builder b(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        @w0(23)
        static class c {
            private c() {
            }

            static Parcelable a(Icon icon) {
                return icon;
            }

            static Notification.Action.Builder b(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }

            static void c(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }
        }

        @w0(24)
        static class d {
            private d() {
            }

            static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
                return builder.setAllowGeneratedReplies(z10);
            }
        }

        @w0(28)
        static class e {
            private e() {
            }

            static Notification.Builder a(Notification.Builder builder, Person person) {
                return builder.addPerson(person);
            }

            static Parcelable b(Person person) {
                return person;
            }
        }

        @w0(31)
        static class f {
            private f() {
            }

            static Notification.CallStyle a(@NonNull Person person, @NonNull PendingIntent pendingIntent, @NonNull PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            static Notification.CallStyle b(@NonNull Person person, @NonNull PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            static Notification.CallStyle c(@NonNull Person person, @NonNull PendingIntent pendingIntent, @NonNull PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            static Notification.CallStyle d(Notification.CallStyle callStyle, @androidx.annotation.l int i10) {
                return callStyle.setAnswerButtonColorHint(i10);
            }

            static Notification.Action.Builder e(Notification.Action.Builder builder, boolean z10) {
                return builder.setAuthenticationRequired(z10);
            }

            static Notification.CallStyle f(Notification.CallStyle callStyle, @androidx.annotation.l int i10) {
                return callStyle.setDeclineButtonColorHint(i10);
            }

            static Notification.CallStyle g(Notification.CallStyle callStyle, boolean z10) {
                return callStyle.setIsVideo(z10);
            }

            static Notification.CallStyle h(Notification.CallStyle callStyle, @androidx.annotation.p0 Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            static Notification.CallStyle i(Notification.CallStyle callStyle, @androidx.annotation.p0 CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }
        }

        @Retention(RetentionPolicy.SOURCE)
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public @interface g {
        }

        public o() {
        }

        @NonNull
        public static o A(@NonNull j0 j0Var, @NonNull PendingIntent pendingIntent, @NonNull PendingIntent pendingIntent2) {
            Objects.requireNonNull(pendingIntent, "declineIntent is required");
            Objects.requireNonNull(pendingIntent2, "answerIntent is required");
            return new o(1, j0Var, null, pendingIntent, pendingIntent2);
        }

        @NonNull
        public static o B(@NonNull j0 j0Var, @NonNull PendingIntent pendingIntent) {
            Objects.requireNonNull(pendingIntent, "hangUpIntent is required");
            return new o(2, j0Var, pendingIntent, null, null);
        }

        @NonNull
        public static o C(@NonNull j0 j0Var, @NonNull PendingIntent pendingIntent, @NonNull PendingIntent pendingIntent2) {
            Objects.requireNonNull(pendingIntent, "hangUpIntent is required");
            Objects.requireNonNull(pendingIntent2, "answerIntent is required");
            return new o(3, j0Var, pendingIntent, null, pendingIntent2);
        }

        @androidx.annotation.p0
        private String E() {
            int i10 = this.f47387e;
            if (i10 == 1) {
                return this.f47450a.f47355a.getResources().getString(i1.a.h.f286831e);
            }
            if (i10 == 2) {
                return this.f47450a.f47355a.getResources().getString(i1.a.h.f286832f);
            }
            if (i10 != 3) {
                return null;
            }
            return this.f47450a.f47355a.getResources().getString(i1.a.h.f286833g);
        }

        private boolean F(b bVar) {
            return bVar != null && bVar.d().getBoolean(f47386t);
        }

        @NonNull
        @w0(20)
        private b G(int i10, int i11, Integer num, int i12, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(androidx.core.content.d.g(this.f47450a.f47355a, i12));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f47450a.f47355a.getResources().getString(i11));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            b bVarC = new b.a(IconCompat.x(this.f47450a.f47355a, i10), spannableStringBuilder, pendingIntent).c();
            bVarC.d().putBoolean(f47386t, true);
            return bVarC;
        }

        @w0(20)
        @androidx.annotation.p0
        private b H() {
            int i10 = i1.a.d.f286752c;
            int i11 = i1.a.d.f286750a;
            PendingIntent pendingIntent = this.f47389g;
            if (pendingIntent == null) {
                return null;
            }
            boolean z10 = this.f47392j;
            return G(z10 ? i10 : i11, z10 ? i1.a.h.f286828b : i1.a.h.f286827a, this.f47393k, i1.a.b.f286724c, pendingIntent);
        }

        @NonNull
        @w0(20)
        private b I() {
            int i10 = i1.a.d.f286754e;
            PendingIntent pendingIntent = this.f47390h;
            return pendingIntent == null ? G(i10, i1.a.h.f286830d, this.f47394l, i1.a.b.f286725d, this.f47391i) : G(i10, i1.a.h.f286829c, this.f47394l, i1.a.b.f286725d, pendingIntent);
        }

        @NonNull
        @w0(20)
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public ArrayList<b> D() {
            b bVarI = I();
            b bVarH = H();
            ArrayList<b> arrayList = new ArrayList<>(3);
            arrayList.add(bVarI);
            ArrayList<b> arrayList2 = this.f47450a.f47356b;
            int i10 = 2;
            if (arrayList2 != null) {
                for (b bVar : arrayList2) {
                    if (bVar.l()) {
                        arrayList.add(bVar);
                    } else if (!F(bVar) && i10 > 1) {
                        arrayList.add(bVar);
                        i10--;
                    }
                    if (bVarH != null && i10 == 1) {
                        arrayList.add(bVarH);
                        i10--;
                    }
                }
            }
            if (bVarH != null && i10 >= 1) {
                arrayList.add(bVarH);
            }
            return arrayList;
        }

        @NonNull
        public o J(@androidx.annotation.l int i10) {
            this.f47393k = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public o K(@androidx.annotation.l int i10) {
            this.f47394l = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        public o L(boolean z10) {
            this.f47392j = z10;
            return this;
        }

        @NonNull
        public o M(@androidx.annotation.p0 Bitmap bitmap) {
            this.f47395m = IconCompat.t(bitmap);
            return this;
        }

        @NonNull
        @w0(23)
        public o N(@androidx.annotation.p0 Icon icon) {
            this.f47395m = icon == null ? null : IconCompat.n(icon);
            return this;
        }

        @NonNull
        public o O(@androidx.annotation.p0 CharSequence charSequence) {
            this.f47396n = charSequence;
            return this;
        }

        @Override // androidx.core.app.w.y
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public void a(@NonNull Bundle bundle) {
            super.a(bundle);
            bundle.putInt(w.f47228l0, this.f47387e);
            bundle.putBoolean(w.f47230m0, this.f47392j);
            j0 j0Var = this.f47388f;
            if (j0Var != null) {
                bundle.putParcelable(w.f47232n0, e.b(j0Var.k()));
            }
            IconCompat iconCompat = this.f47395m;
            if (iconCompat != null) {
                bundle.putParcelable(w.f47236p0, c.a(iconCompat.N(this.f47450a.f47355a)));
            }
            bundle.putCharSequence(w.f47240r0, this.f47396n);
            bundle.putParcelable(w.f47242s0, this.f47389g);
            bundle.putParcelable(w.f47244t0, this.f47390h);
            bundle.putParcelable(w.f47246u0, this.f47391i);
            Integer num = this.f47393k;
            if (num != null) {
                bundle.putInt(w.f47248v0, num.intValue());
            }
            Integer num2 = this.f47394l;
            if (num2 != null) {
                bundle.putInt(w.f47250w0, num2.intValue());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.core.app.w.y
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public void b(androidx.core.app.t tVar) {
            CharSequence charSequenceE = null;
            callStyleA = null;
            Notification.CallStyle callStyleA = null;
            charSequenceE = null;
            if (Build.VERSION.SDK_INT < 31) {
                Notification.Builder builderA = tVar.a();
                j0 j0Var = this.f47388f;
                builderA.setContentTitle(j0Var != null ? j0Var.f() : null);
                Bundle bundle = this.f47450a.E;
                if (bundle != null && bundle.containsKey(w.D)) {
                    charSequenceE = this.f47450a.E.getCharSequence(w.D);
                }
                if (charSequenceE == null) {
                    charSequenceE = E();
                }
                builderA.setContentText(charSequenceE);
                j0 j0Var2 = this.f47388f;
                if (j0Var2 != null) {
                    if (j0Var2.d() != null) {
                        c.c(builderA, this.f47388f.d().N(this.f47450a.f47355a));
                    }
                    e.a(builderA, this.f47388f.k());
                }
                b.b(builderA, w.E0);
                return;
            }
            int i10 = this.f47387e;
            if (i10 != 1) {
                boolean z10 = 0 | 2;
                if (i10 == 2) {
                    callStyleA = f.b(this.f47388f.k(), this.f47391i);
                } else if (i10 == 3) {
                    callStyleA = f.c(this.f47388f.k(), this.f47391i, this.f47389g);
                } else if (Log.isLoggable(w.f47196a, 3)) {
                    String.valueOf(this.f47387e);
                }
            } else {
                callStyleA = f.a(this.f47388f.k(), this.f47390h, this.f47389g);
            }
            if (callStyleA != null) {
                callStyleA.setBuilder(tVar.a());
                Integer num = this.f47393k;
                if (num != null) {
                    f.d(callStyleA, num.intValue());
                }
                Integer num2 = this.f47394l;
                if (num2 != null) {
                    f.f(callStyleA, num2.intValue());
                }
                f.i(callStyleA, this.f47396n);
                IconCompat iconCompat = this.f47395m;
                if (iconCompat != null) {
                    f.h(callStyleA, iconCompat.N(this.f47450a.f47355a));
                }
                f.g(callStyleA, this.f47392j);
            }
        }

        @Override // androidx.core.app.w.y
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public boolean r() {
            return true;
        }

        @Override // androidx.core.app.w.y
        @NonNull
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        protected String t() {
            return f47381o;
        }

        @Override // androidx.core.app.w.y
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        protected void y(@NonNull Bundle bundle) {
            super.y(bundle);
            this.f47387e = bundle.getInt(w.f47228l0);
            this.f47392j = bundle.getBoolean(w.f47230m0);
            if (bundle.containsKey(w.f47232n0)) {
                this.f47388f = j0.a((Person) bundle.getParcelable(w.f47232n0));
            } else if (bundle.containsKey(w.f47234o0)) {
                this.f47388f = j0.b(bundle.getBundle(w.f47234o0));
            }
            if (bundle.containsKey(w.f47236p0)) {
                this.f47395m = IconCompat.n((Icon) bundle.getParcelable(w.f47236p0));
            } else if (bundle.containsKey(w.f47238q0)) {
                this.f47395m = IconCompat.l(bundle.getBundle(w.f47238q0));
            }
            this.f47396n = bundle.getCharSequence(w.f47240r0);
            this.f47389g = (PendingIntent) bundle.getParcelable(w.f47242s0);
            this.f47390h = (PendingIntent) bundle.getParcelable(w.f47244t0);
            this.f47391i = (PendingIntent) bundle.getParcelable(w.f47246u0);
            this.f47393k = bundle.containsKey(w.f47248v0) ? Integer.valueOf(bundle.getInt(w.f47248v0)) : null;
            this.f47394l = bundle.containsKey(w.f47250w0) ? Integer.valueOf(bundle.getInt(w.f47250w0)) : null;
        }

        public o(@androidx.annotation.p0 n nVar) {
            z(nVar);
        }

        private o(int i10, @NonNull j0 j0Var, @androidx.annotation.p0 PendingIntent pendingIntent, @androidx.annotation.p0 PendingIntent pendingIntent2, @androidx.annotation.p0 PendingIntent pendingIntent3) {
            if (j0Var != null && !TextUtils.isEmpty(j0Var.f())) {
                this.f47387e = i10;
                this.f47388f = j0Var;
                this.f47389g = pendingIntent3;
                this.f47390h = pendingIntent2;
                this.f47391i = pendingIntent;
                return;
            }
            throw new IllegalArgumentException("person must have a non-empty a name");
        }
    }

    public static class q extends y {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f47425e = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f47426f = 3;

        @w0(24)
        static class a {
            private a() {
            }

            static Notification.Style a() {
                return new Notification.DecoratedCustomViewStyle();
            }
        }

        private RemoteViews A(RemoteViews remoteViews, boolean z10) {
            int iMin;
            int i10 = 0;
            RemoteViews remoteViewsC = c(true, i1.a.g.f286823f, false);
            remoteViewsC.removeAllViews(i1.a.e.L);
            List<b> listC = C(this.f47450a.f47356b);
            if (!z10 || listC == null || (iMin = Math.min(listC.size(), 3)) <= 0) {
                i10 = 8;
            } else {
                for (int i11 = 0; i11 < iMin; i11++) {
                    remoteViewsC.addView(i1.a.e.L, B(listC.get(i11)));
                }
            }
            remoteViewsC.setViewVisibility(i1.a.e.L, i10);
            remoteViewsC.setViewVisibility(i1.a.e.I, i10);
            e(remoteViewsC, remoteViews);
            return remoteViewsC;
        }

        private RemoteViews B(b bVar) {
            boolean z10 = bVar.f47306k == null;
            RemoteViews remoteViews = new RemoteViews(this.f47450a.f47355a.getPackageName(), z10 ? i1.a.g.f286822e : i1.a.g.f286821d);
            IconCompat iconCompatF = bVar.f();
            if (iconCompatF != null) {
                remoteViews.setImageViewBitmap(i1.a.e.J, o(iconCompatF, i1.a.b.f286726e));
            }
            remoteViews.setTextViewText(i1.a.e.K, bVar.f47305j);
            if (!z10) {
                remoteViews.setOnClickPendingIntent(i1.a.e.H, bVar.f47306k);
            }
            remoteViews.setContentDescription(i1.a.e.H, bVar.f47305j);
            return remoteViews;
        }

        private static List<b> C(List<b> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (b bVar : list) {
                if (!bVar.l()) {
                    arrayList.add(bVar);
                }
            }
            return arrayList;
        }

        @NonNull
        @w0(24)
        public static List<CharSequence> D(@NonNull Context context, @NonNull Notification notification) {
            if (!Notification.DecoratedCustomViewStyle.class.getName().equals(notification.extras.getString(w.Y))) {
                return Collections.EMPTY_LIST;
            }
            RemoteViews remoteViews = notification.contentView;
            if (remoteViews == null && notification.bigContentView == null && notification.headsUpContentView == null) {
                return Collections.EMPTY_LIST;
            }
            RemoteViews remoteViews2 = notification.bigContentView;
            if (remoteViews2 != null) {
                remoteViews = remoteViews2;
            } else if (remoteViews == null) {
                remoteViews = notification.headsUpContentView;
            }
            String str = remoteViews.getPackage();
            try {
                Context contextCreatePackageContext = context.createPackageContext(str, 0);
                contextCreatePackageContext.setTheme(context.getPackageManager().getApplicationInfo(str, 0).theme);
                View viewApply = remoteViews.apply(contextCreatePackageContext, null);
                ArrayList arrayList = new ArrayList();
                E(viewApply, arrayList);
                return arrayList;
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        private static void E(View view, ArrayList<CharSequence> arrayList) {
            CharSequence text;
            if (view instanceof ViewGroup) {
                int i10 = 0;
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (i10 >= viewGroup.getChildCount()) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i10);
                    if ((childAt instanceof TextView) && (text = ((TextView) childAt).getText()) != null && text.length() > 0) {
                        arrayList.add(text);
                    }
                    if (childAt instanceof ViewGroup) {
                        E(childAt, arrayList);
                    }
                    i10++;
                }
            }
        }

        @Override // androidx.core.app.w.y
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public void b(androidx.core.app.t tVar) {
            tVar.a().setStyle(a.a());
        }

        @Override // androidx.core.app.w.y
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public boolean r() {
            return true;
        }

        @Override // androidx.core.app.w.y
        @NonNull
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        protected String t() {
            return f47425e;
        }

        @Override // androidx.core.app.w.y
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews v(androidx.core.app.t tVar) {
            return null;
        }

        @Override // androidx.core.app.w.y
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews w(androidx.core.app.t tVar) {
            return null;
        }

        @Override // androidx.core.app.w.y
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews x(androidx.core.app.t tVar) {
            return null;
        }
    }

    public interface r {
        @NonNull
        n a(@NonNull n nVar);
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public @interface s {
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public @interface v {
    }

    /* JADX INFO: renamed from: androidx.core.app.w$w, reason: collision with other inner class name */
    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public @interface InterfaceC0382w {
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public @interface x {
    }

    public static abstract class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        protected n f47450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        CharSequence f47451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        CharSequence f47452c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f47453d = false;

        @w0(24)
        static class a {
            private a() {
            }

            static void a(RemoteViews remoteViews, int i10, boolean z10) {
                remoteViews.setChronometerCountDown(i10, z10);
            }
        }

        private int f() {
            Resources resources = this.f47450a.f47355a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(i1.a.c.f286748u);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(i1.a.c.f286749v);
            float fH = (h(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - fH) * dimensionPixelSize) + (fH * dimensionPixelSize2));
        }

        private static float h(float f10, float f11, float f12) {
            if (f10 < f11) {
                return f11;
            }
            return f10 > f12 ? f12 : f10;
        }

        @androidx.annotation.p0
        static y i(@androidx.annotation.p0 String str) {
            if (str == null) {
                return null;
            }
            switch (str) {
                case "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle":
                    return new q();
                case "androidx.core.app.NotificationCompat$BigPictureStyle":
                    return new k();
                case "androidx.core.app.NotificationCompat$CallStyle":
                    return new o();
                case "androidx.core.app.NotificationCompat$InboxStyle":
                    return new t();
                case "androidx.core.app.NotificationCompat$BigTextStyle":
                    return new l();
                case "androidx.core.app.NotificationCompat$MessagingStyle":
                    return new u();
                default:
                    return null;
            }
        }

        @androidx.annotation.p0
        private static y j(@androidx.annotation.p0 String str) {
            if (str == null) {
                return null;
            }
            if (str.equals(Notification.BigPictureStyle.class.getName())) {
                return new k();
            }
            if (str.equals(Notification.BigTextStyle.class.getName())) {
                return new l();
            }
            if (str.equals(Notification.InboxStyle.class.getName())) {
                return new t();
            }
            if (str.equals(Notification.MessagingStyle.class.getName())) {
                return new u();
            }
            if (str.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                return new q();
            }
            return null;
        }

        @androidx.annotation.p0
        static y k(@NonNull Bundle bundle) {
            y yVarI = i(bundle.getString(w.Z));
            if (yVarI != null) {
                return yVarI;
            }
            if (bundle.containsKey(w.f47212f0) || bundle.containsKey(w.f47215g0)) {
                return new u();
            }
            if (bundle.containsKey(w.T) || bundle.containsKey(w.U)) {
                return new k();
            }
            if (bundle.containsKey(w.I)) {
                return new l();
            }
            if (bundle.containsKey(w.X)) {
                return new t();
            }
            return bundle.containsKey(w.f47228l0) ? new o() : j(bundle.getString(w.Y));
        }

        @androidx.annotation.p0
        static y l(@NonNull Bundle bundle) {
            y yVarK = k(bundle);
            if (yVarK == null) {
                return null;
            }
            try {
                yVarK.y(bundle);
                return yVarK;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        private Bitmap n(int i10, int i11, int i12) {
            return p(IconCompat.x(this.f47450a.f47355a, i10), i11, i12);
        }

        private Bitmap p(@NonNull IconCompat iconCompat, int i10, int i11) {
            Drawable drawableF = iconCompat.F(this.f47450a.f47355a);
            int intrinsicWidth = i11 == 0 ? drawableF.getIntrinsicWidth() : i11;
            if (i11 == 0) {
                i11 = drawableF.getIntrinsicHeight();
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, i11, Bitmap.Config.ARGB_8888);
            drawableF.setBounds(0, 0, intrinsicWidth, i11);
            if (i10 != 0) {
                drawableF.mutate().setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            }
            drawableF.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        }

        private Bitmap q(int i10, int i11, int i12, int i13) {
            int i14 = i1.a.d.f286763n;
            if (i13 == 0) {
                i13 = 0;
            }
            Bitmap bitmapN = n(i14, i13, i11);
            Canvas canvas = new Canvas(bitmapN);
            Drawable drawableMutate = this.f47450a.f47355a.getResources().getDrawable(i10).mutate();
            drawableMutate.setFilterBitmap(true);
            int i15 = (i11 - i12) / 2;
            int i16 = i12 + i15;
            drawableMutate.setBounds(i15, i15, i16, i16);
            drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            drawableMutate.draw(canvas);
            return bitmapN;
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        @androidx.annotation.p0
        public static y s(@NonNull Notification notification) {
            Bundle bundleN = w.n(notification);
            if (bundleN == null) {
                return null;
            }
            return l(bundleN);
        }

        private void u(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(i1.a.e.f286812v0, 8);
            remoteViews.setViewVisibility(i1.a.e.f286808t0, 8);
            remoteViews.setViewVisibility(i1.a.e.f286806s0, 8);
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public void a(@NonNull Bundle bundle) {
            if (this.f47453d) {
                bundle.putCharSequence(w.H, this.f47452c);
            }
            CharSequence charSequence = this.f47451b;
            if (charSequence != null) {
                bundle.putCharSequence(w.C, charSequence);
            }
            String strT = t();
            if (strT != null) {
                bundle.putString(w.Z, strT);
            }
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public void b(androidx.core.app.t tVar) {
        }

        /* JADX WARN: Code duplicated, block: B:34:0x012a  */
        /* JADX WARN: Code duplicated, block: B:36:0x0136  */
        /* JADX WARN: Code duplicated, block: B:38:0x0144  */
        /* JADX WARN: Code duplicated, block: B:40:0x015d  */
        /* JADX WARN: Code duplicated, block: B:43:0x0171  */
        /* JADX WARN: Code duplicated, block: B:45:0x0178  */
        /* JADX WARN: Code duplicated, block: B:47:0x01a7  */
        /* JADX WARN: Code duplicated, block: B:48:0x01b0  */
        /* JADX WARN: Code duplicated, block: B:49:0x01c4  */
        /* JADX WARN: Code duplicated, block: B:52:0x01ca  */
        /* JADX WARN: Code duplicated, block: B:53:0x01cc  */
        /* JADX WARN: Code duplicated, block: B:57:0x01d7  */
        @NonNull
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews c(boolean z10, int i10, boolean z11) {
            boolean z12;
            boolean z13;
            CharSequence charSequence;
            int i11;
            boolean z14;
            CharSequence charSequence2;
            Resources resources = this.f47450a.f47355a.getResources();
            RemoteViews remoteViews = new RemoteViews(this.f47450a.f47355a.getPackageName(), i10);
            this.f47450a.y();
            n nVar = this.f47450a;
            if (nVar.f47364j != null) {
                remoteViews.setViewVisibility(i1.a.e.T, 0);
                remoteViews.setImageViewBitmap(i1.a.e.T, o(this.f47450a.f47364j, 0));
                if (z10 && this.f47450a.U.icon != 0) {
                    int dimensionPixelSize = resources.getDimensionPixelSize(i1.a.c.f286743p);
                    int dimensionPixelSize2 = dimensionPixelSize - (resources.getDimensionPixelSize(i1.a.c.f286745r) * 2);
                    n nVar2 = this.f47450a;
                    remoteViews.setImageViewBitmap(i1.a.e.f286776d0, q(nVar2.U.icon, dimensionPixelSize, dimensionPixelSize2, nVar2.r()));
                    remoteViews.setViewVisibility(i1.a.e.f286776d0, 0);
                }
            } else if (z10 && nVar.U.icon != 0) {
                remoteViews.setViewVisibility(i1.a.e.T, 0);
                int dimensionPixelSize3 = resources.getDimensionPixelSize(i1.a.c.f286740m) - resources.getDimensionPixelSize(i1.a.c.f286737j);
                int dimensionPixelSize4 = resources.getDimensionPixelSize(i1.a.c.f286746s);
                n nVar3 = this.f47450a;
                remoteViews.setImageViewBitmap(i1.a.e.T, q(nVar3.U.icon, dimensionPixelSize3, dimensionPixelSize4, nVar3.r()));
            }
            CharSequence charSequence3 = this.f47450a.f47359e;
            if (charSequence3 != null) {
                remoteViews.setTextViewText(i1.a.e.f286812v0, charSequence3);
            }
            CharSequence charSequence4 = this.f47450a.f47360f;
            boolean z15 = true;
            if (charSequence4 != null) {
                remoteViews.setTextViewText(i1.a.e.f286806s0, charSequence4);
                z12 = true;
            } else {
                z12 = false;
            }
            n nVar4 = this.f47450a;
            CharSequence charSequence5 = nVar4.f47365k;
            if (charSequence5 == null) {
                if (nVar4.f47366l > 0) {
                    if (this.f47450a.f47366l > resources.getInteger(i1.a.f.f286817a)) {
                        remoteViews.setTextViewText(i1.a.e.V, resources.getString(i1.a.h.f286834h));
                    } else {
                        remoteViews.setTextViewText(i1.a.e.V, NumberFormat.getIntegerInstance().format(this.f47450a.f47366l));
                    }
                    remoteViews.setViewVisibility(i1.a.e.V, 0);
                } else {
                    remoteViews.setViewVisibility(i1.a.e.V, 8);
                    z13 = false;
                }
                charSequence = this.f47450a.f47372r;
                if (charSequence != null) {
                    remoteViews.setTextViewText(i1.a.e.f286806s0, charSequence);
                    charSequence2 = this.f47450a.f47360f;
                    if (charSequence2 != null) {
                        remoteViews.setTextViewText(i1.a.e.f286808t0, charSequence2);
                        remoteViews.setViewVisibility(i1.a.e.f286808t0, 0);
                        if (z11) {
                            remoteViews.setTextViewTextSize(i1.a.e.f286806s0, 0, resources.getDimensionPixelSize(i1.a.c.f286747t));
                        }
                        remoteViews.setViewPadding(i1.a.e.X, 0, 0, 0, 0);
                    } else {
                        remoteViews.setViewVisibility(i1.a.e.f286808t0, 8);
                    }
                }
                if (this.f47450a.z() != 0) {
                    z15 = z13;
                } else if (this.f47450a.f47369o) {
                    remoteViews.setViewVisibility(i1.a.e.O, 0);
                    remoteViews.setLong(i1.a.e.O, "setBase", this.f47450a.z() + (SystemClock.elapsedRealtime() - System.currentTimeMillis()));
                    remoteViews.setBoolean(i1.a.e.O, "setStarted", true);
                    z14 = this.f47450a.f47370p;
                    if (z14) {
                        a.a(remoteViews, i1.a.e.O, z14);
                    }
                } else {
                    remoteViews.setViewVisibility(i1.a.e.f286810u0, 0);
                    remoteViews.setLong(i1.a.e.f286810u0, "setTime", this.f47450a.z());
                }
                int i12 = i1.a.e.f286778e0;
                if (z15) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                remoteViews.setViewVisibility(i12, i11);
                remoteViews.setViewVisibility(i1.a.e.Y, z12 ? 0 : 8);
                return remoteViews;
            }
            remoteViews.setTextViewText(i1.a.e.V, charSequence5);
            remoteViews.setViewVisibility(i1.a.e.V, 0);
            z12 = true;
            z13 = true;
            charSequence = this.f47450a.f47372r;
            if (charSequence != null) {
                remoteViews.setTextViewText(i1.a.e.f286806s0, charSequence);
                charSequence2 = this.f47450a.f47360f;
                if (charSequence2 != null) {
                    remoteViews.setTextViewText(i1.a.e.f286808t0, charSequence2);
                    remoteViews.setViewVisibility(i1.a.e.f286808t0, 0);
                    if (z11) {
                        remoteViews.setTextViewTextSize(i1.a.e.f286806s0, 0, resources.getDimensionPixelSize(i1.a.c.f286747t));
                    }
                    remoteViews.setViewPadding(i1.a.e.X, 0, 0, 0, 0);
                } else {
                    remoteViews.setViewVisibility(i1.a.e.f286808t0, 8);
                }
            }
            if (this.f47450a.z() != 0) {
                z15 = z13;
            } else if (this.f47450a.f47369o) {
                remoteViews.setViewVisibility(i1.a.e.O, 0);
                remoteViews.setLong(i1.a.e.O, "setBase", this.f47450a.z() + (SystemClock.elapsedRealtime() - System.currentTimeMillis()));
                remoteViews.setBoolean(i1.a.e.O, "setStarted", true);
                z14 = this.f47450a.f47370p;
                if (z14) {
                    a.a(remoteViews, i1.a.e.O, z14);
                }
            } else {
                remoteViews.setViewVisibility(i1.a.e.f286810u0, 0);
                remoteViews.setLong(i1.a.e.f286810u0, "setTime", this.f47450a.z());
            }
            int i13 = i1.a.e.f286778e0;
            if (z15) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            remoteViews.setViewVisibility(i13, i11);
            remoteViews.setViewVisibility(i1.a.e.Y, z12 ? 0 : 8);
            return remoteViews;
        }

        @androidx.annotation.p0
        public Notification d() {
            n nVar = this.f47450a;
            if (nVar != null) {
                return nVar.h();
            }
            return null;
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public void e(RemoteViews remoteViews, RemoteViews remoteViews2) {
            u(remoteViews);
            remoteViews.removeAllViews(i1.a.e.f286772b0);
            remoteViews.addView(i1.a.e.f286772b0, remoteViews2.clone());
            remoteViews.setViewVisibility(i1.a.e.f286772b0, 0);
            remoteViews.setViewPadding(i1.a.e.f286774c0, 0, f(), 0, 0);
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        protected void g(@NonNull Bundle bundle) {
            bundle.remove(w.H);
            bundle.remove(w.C);
            bundle.remove(w.Z);
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public Bitmap m(int i10, int i11) {
            return n(i10, i11, 0);
        }

        Bitmap o(@NonNull IconCompat iconCompat, int i10) {
            return p(iconCompat, i10, 0);
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public boolean r() {
            return false;
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        @androidx.annotation.p0
        protected String t() {
            return null;
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews v(androidx.core.app.t tVar) {
            return null;
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews w(androidx.core.app.t tVar) {
            return null;
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews x(androidx.core.app.t tVar) {
            return null;
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        protected void y(@NonNull Bundle bundle) {
            if (bundle.containsKey(w.H)) {
                this.f47452c = bundle.getCharSequence(w.H);
                this.f47453d = true;
            }
            this.f47451b = bundle.getCharSequence(w.C);
        }

        public void z(@androidx.annotation.p0 n nVar) {
            if (this.f47450a != nVar) {
                this.f47450a = nVar;
                if (nVar != null) {
                    nVar.z0(this);
                }
            }
        }
    }

    @Deprecated
    public w() {
    }

    @androidx.annotation.p0
    public static String A(@NonNull Notification notification) {
        return f.e(notification);
    }

    public static boolean B(@NonNull Notification notification) {
        return notification.extras.getBoolean(S);
    }

    @androidx.annotation.p0
    public static String C(@NonNull Notification notification) {
        return c.i(notification);
    }

    @androidx.annotation.p0
    public static CharSequence D(@NonNull Notification notification) {
        return notification.extras.getCharSequence(E);
    }

    public static long E(@NonNull Notification notification) {
        return f.f(notification);
    }

    public static boolean F(@NonNull Notification notification) {
        return notification.extras.getBoolean(P);
    }

    public static int G(@NonNull Notification notification) {
        return notification.visibility;
    }

    public static boolean H(@NonNull Notification notification) {
        return (notification.flags & 512) != 0;
    }

    @androidx.annotation.p0
    public static Bitmap I(@NonNull Context context, @androidx.annotation.p0 Bitmap bitmap) {
        return bitmap;
    }

    @androidx.annotation.p0
    public static b a(@NonNull Notification notification, int i10) {
        return b(notification.actions[i10]);
    }

    @NonNull
    @w0(20)
    static b b(@NonNull Notification.Action action) {
        l0[] l0VarArr;
        int i10;
        RemoteInput[] remoteInputArrG = c.g(action);
        if (remoteInputArrG == null) {
            l0VarArr = null;
        } else {
            l0[] l0VarArr2 = new l0[remoteInputArrG.length];
            for (int i11 = 0; i11 < remoteInputArrG.length; i11++) {
                RemoteInput remoteInput = remoteInputArrG[i11];
                l0VarArr2[i11] = new l0(c.h(remoteInput), c.f(remoteInput), c.b(remoteInput), c.a(remoteInput), h.c(remoteInput), c.d(remoteInput), null);
            }
            l0VarArr = l0VarArr2;
        }
        int i12 = Build.VERSION.SDK_INT;
        boolean z10 = c.c(action).getBoolean("android.support.allowGeneratedReplies") || e.a(action);
        boolean z11 = c.c(action).getBoolean("android.support.action.showsUserInterface", true);
        int iA = g.a(action);
        boolean zE = h.e(action);
        boolean zA = i12 >= 31 ? i.a(action) : false;
        if (d.a(action) != null || (i10 = action.icon) == 0) {
            return new b(d.a(action) != null ? IconCompat.o(d.a(action)) : null, action.title, action.actionIntent, c.c(action), l0VarArr, (l0[]) null, z10, iA, z11, zE, zA);
        }
        return new b(i10, action.title, action.actionIntent, c.c(action), l0VarArr, (l0[]) null, z10, iA, z11, zE, zA);
    }

    public static int c(@NonNull Notification notification) {
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null) {
            return actionArr.length;
        }
        return 0;
    }

    public static boolean d(@NonNull Notification notification) {
        return h.a(notification);
    }

    public static boolean e(@NonNull Notification notification) {
        return (notification.flags & 16) != 0;
    }

    public static int f(@NonNull Notification notification) {
        return f.a(notification);
    }

    @androidx.annotation.p0
    public static m g(@NonNull Notification notification) {
        return m.a(h.b(notification));
    }

    @androidx.annotation.p0
    public static String h(@NonNull Notification notification) {
        return notification.category;
    }

    @androidx.annotation.p0
    public static String i(@NonNull Notification notification) {
        return f.b(notification);
    }

    public static int j(@NonNull Notification notification) {
        return notification.color;
    }

    @androidx.annotation.p0
    public static CharSequence k(@NonNull Notification notification) {
        return notification.extras.getCharSequence(G);
    }

    @androidx.annotation.p0
    public static CharSequence l(@NonNull Notification notification) {
        return notification.extras.getCharSequence(D);
    }

    @androidx.annotation.p0
    public static CharSequence m(@NonNull Notification notification) {
        return notification.extras.getCharSequence(B);
    }

    @v0(expression = "notification.extras")
    @androidx.annotation.p0
    @Deprecated
    public static Bundle n(@NonNull Notification notification) {
        return notification.extras;
    }

    @androidx.annotation.p0
    public static String o(@NonNull Notification notification) {
        return c.e(notification);
    }

    public static int p(@NonNull Notification notification) {
        return f.c(notification);
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    static boolean q(@NonNull Notification notification) {
        return (notification.flags & 128) != 0;
    }

    @NonNull
    @w0(21)
    public static List<b> r(@NonNull Notification notification) {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle2 != null && (bundle = bundle2.getBundle("invisible_actions")) != null) {
            for (int i10 = 0; i10 < bundle.size(); i10++) {
                arrayList.add(androidx.core.app.a0.g(bundle.getBundle(Integer.toString(i10))));
            }
        }
        return arrayList;
    }

    public static boolean s(@NonNull Notification notification) {
        return (notification.flags & 256) != 0;
    }

    @androidx.annotation.p0
    public static androidx.core.content.c0 t(@NonNull Notification notification) {
        LocusId locusIdD = h.d(notification);
        if (locusIdD == null) {
            return null;
        }
        return androidx.core.content.c0.d(locusIdD);
    }

    @NonNull
    static Notification[] u(@NonNull Bundle bundle, @NonNull String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Notification[]) || parcelableArray == null) {
            return (Notification[]) parcelableArray;
        }
        Notification[] notificationArr = new Notification[parcelableArray.length];
        for (int i10 = 0; i10 < parcelableArray.length; i10++) {
            notificationArr[i10] = (Notification) parcelableArray[i10];
        }
        bundle.putParcelableArray(str, notificationArr);
        return notificationArr;
    }

    public static boolean v(@NonNull Notification notification) {
        return (notification.flags & 2) != 0;
    }

    public static boolean w(@NonNull Notification notification) {
        return (notification.flags & 8) != 0;
    }

    @NonNull
    public static List<j0> x(@NonNull Notification notification) {
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayList = notification.extras.getParcelableArrayList(f47200b0);
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                arrayList.add(j0.a((Person) it.next()));
            }
        }
        return arrayList;
    }

    @androidx.annotation.p0
    public static Notification y(@NonNull Notification notification) {
        return notification.publicVersion;
    }

    @androidx.annotation.p0
    public static CharSequence z(@NonNull Notification notification) {
        return f.d(notification);
    }

    public static final class p implements r {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        static final String f47397d = "android.car.EXTENSIONS";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f47398e = "large_icon";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f47399f = "car_conversation";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f47400g = "app_color";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        static final String f47401h = "invisible_actions";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f47402i = "author";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f47403j = "text";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f47404k = "messages";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f47405l = "remote_input";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f47406m = "on_reply";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f47407n = "on_read";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f47408o = "participants";

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final String f47409p = "timestamp";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Bitmap f47410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c f47411b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f47412c;

        @w0(20)
        static class a {
            private a() {
            }

            static RemoteInput.Builder a(RemoteInput.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            static RemoteInput b(RemoteInput.Builder builder) {
                return builder.build();
            }

            static Parcelable c(RemoteInput remoteInput) {
                return remoteInput;
            }

            static RemoteInput.Builder d(String str) {
                return new RemoteInput.Builder(str);
            }

            static boolean e(RemoteInput remoteInput) {
                return remoteInput.getAllowFreeFormInput();
            }

            static CharSequence[] f(RemoteInput remoteInput) {
                return remoteInput.getChoices();
            }

            static Bundle g(RemoteInput remoteInput) {
                return remoteInput.getExtras();
            }

            static CharSequence h(RemoteInput remoteInput) {
                return remoteInput.getLabel();
            }

            static String i(RemoteInput remoteInput) {
                return remoteInput.getResultKey();
            }

            static RemoteInput.Builder j(RemoteInput.Builder builder, boolean z10) {
                return builder.setAllowFreeFormInput(z10);
            }

            static RemoteInput.Builder k(RemoteInput.Builder builder, CharSequence[] charSequenceArr) {
                return builder.setChoices(charSequenceArr);
            }

            static RemoteInput.Builder l(RemoteInput.Builder builder, CharSequence charSequence) {
                return builder.setLabel(charSequence);
            }
        }

        @w0(29)
        static class b {
            private b() {
            }

            static int a(RemoteInput remoteInput) {
                return remoteInput.getEditChoicesBeforeSending();
            }
        }

        @Deprecated
        public static class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String[] f47413a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final l0 f47414b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final PendingIntent f47415c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final PendingIntent f47416d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final String[] f47417e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private final long f47418f;

            public static class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final List<String> f47419a = new ArrayList();

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final String f47420b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private l0 f47421c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private PendingIntent f47422d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private PendingIntent f47423e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                private long f47424f;

                public a(@NonNull String str) {
                    this.f47420b = str;
                }

                @NonNull
                public a a(@androidx.annotation.p0 String str) {
                    if (str != null) {
                        this.f47419a.add(str);
                    }
                    return this;
                }

                @NonNull
                public c b() {
                    List<String> list = this.f47419a;
                    return new c((String[]) list.toArray(new String[list.size()]), this.f47421c, this.f47423e, this.f47422d, new String[]{this.f47420b}, this.f47424f);
                }

                @NonNull
                public a c(long j10) {
                    this.f47424f = j10;
                    return this;
                }

                @NonNull
                public a d(@androidx.annotation.p0 PendingIntent pendingIntent) {
                    this.f47422d = pendingIntent;
                    return this;
                }

                @NonNull
                public a e(@androidx.annotation.p0 PendingIntent pendingIntent, @androidx.annotation.p0 l0 l0Var) {
                    this.f47421c = l0Var;
                    this.f47423e = pendingIntent;
                    return this;
                }
            }

            c(@androidx.annotation.p0 String[] strArr, @androidx.annotation.p0 l0 l0Var, @androidx.annotation.p0 PendingIntent pendingIntent, @androidx.annotation.p0 PendingIntent pendingIntent2, @androidx.annotation.p0 String[] strArr2, long j10) {
                this.f47413a = strArr;
                this.f47414b = l0Var;
                this.f47416d = pendingIntent2;
                this.f47415c = pendingIntent;
                this.f47417e = strArr2;
                this.f47418f = j10;
            }

            public long a() {
                return this.f47418f;
            }

            @androidx.annotation.p0
            public String[] b() {
                return this.f47413a;
            }

            @androidx.annotation.p0
            public String c() {
                String[] strArr = this.f47417e;
                if (strArr.length > 0) {
                    return strArr[0];
                }
                return null;
            }

            @androidx.annotation.p0
            public String[] d() {
                return this.f47417e;
            }

            @androidx.annotation.p0
            public PendingIntent e() {
                return this.f47416d;
            }

            @androidx.annotation.p0
            public l0 f() {
                return this.f47414b;
            }

            @androidx.annotation.p0
            public PendingIntent g() {
                return this.f47415c;
            }
        }

        public p() {
            this.f47412c = 0;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0021  */
        @w0(21)
        private static Bundle b(@NonNull c cVar) {
            String str;
            Bundle bundle = new Bundle();
            if (cVar.d() != null) {
                int i10 = 3 >> 1;
                if (cVar.d().length > 1) {
                    str = cVar.d()[0];
                } else {
                    str = null;
                }
            } else {
                str = null;
            }
            int length = cVar.b().length;
            Parcelable[] parcelableArr = new Parcelable[length];
            for (int i11 = 0; i11 < length; i11++) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("text", cVar.b()[i11]);
                bundle2.putString(f47402i, str);
                parcelableArr[i11] = bundle2;
            }
            bundle.putParcelableArray("messages", parcelableArr);
            l0 l0VarF = cVar.f();
            if (l0VarF != null) {
                RemoteInput.Builder builderD = a.d(l0VarF.o());
                a.l(builderD, l0VarF.n());
                a.k(builderD, l0VarF.h());
                a.j(builderD, l0VarF.f());
                a.a(builderD, l0VarF.m());
                bundle.putParcelable(f47405l, a.c(a.b(builderD)));
            }
            bundle.putParcelable(f47406m, cVar.g());
            bundle.putParcelable(f47407n, cVar.e());
            bundle.putStringArray(f47408o, cVar.d());
            bundle.putLong("timestamp", cVar.a());
            return bundle;
        }

        @w0(21)
        private static c f(@androidx.annotation.p0 Bundle bundle) {
            String[] strArr;
            if (bundle == null) {
                return null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("messages");
            if (parcelableArray != null) {
                int length = parcelableArray.length;
                String[] strArr2 = new String[length];
                for (int i10 = 0; i10 < length; i10++) {
                    Parcelable parcelable = parcelableArray[i10];
                    if (parcelable instanceof Bundle) {
                        String string = ((Bundle) parcelable).getString("text");
                        strArr2[i10] = string;
                        if (string != null) {
                        }
                    }
                    return null;
                }
                strArr = strArr2;
            } else {
                strArr = null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(f47407n);
            PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable(f47406m);
            RemoteInput remoteInput = (RemoteInput) bundle.getParcelable(f47405l);
            String[] stringArray = bundle.getStringArray(f47408o);
            if (stringArray == null || stringArray.length != 1) {
                return null;
            }
            return new c(strArr, remoteInput != null ? new l0(a.i(remoteInput), a.h(remoteInput), a.f(remoteInput), a.e(remoteInput), b.a(remoteInput), a.g(remoteInput), null) : null, pendingIntent2, pendingIntent, stringArray, bundle.getLong("timestamp"));
        }

        @Override // androidx.core.app.w.r
        @NonNull
        public n a(@NonNull n nVar) {
            Bundle bundle = new Bundle();
            Bitmap bitmap = this.f47410a;
            if (bitmap != null) {
                bundle.putParcelable(f47398e, bitmap);
            }
            int i10 = this.f47412c;
            if (i10 != 0) {
                bundle.putInt(f47400g, i10);
            }
            c cVar = this.f47411b;
            if (cVar != null) {
                bundle.putBundle(f47399f, b(cVar));
            }
            nVar.t().putBundle(f47397d, bundle);
            return nVar;
        }

        @androidx.annotation.l
        public int c() {
            return this.f47412c;
        }

        @androidx.annotation.p0
        public Bitmap d() {
            return this.f47410a;
        }

        @androidx.annotation.p0
        @Deprecated
        public c e() {
            return this.f47411b;
        }

        @NonNull
        public p g(@androidx.annotation.l int i10) {
            this.f47412c = i10;
            return this;
        }

        @NonNull
        public p h(@androidx.annotation.p0 Bitmap bitmap) {
            this.f47410a = bitmap;
            return this;
        }

        @NonNull
        @Deprecated
        public p i(@androidx.annotation.p0 c cVar) {
            this.f47411b = cVar;
            return this;
        }

        public p(@NonNull Notification notification) {
            this.f47412c = 0;
            Bundle bundle = w.n(notification) == null ? null : w.n(notification).getBundle(f47397d);
            if (bundle != null) {
                this.f47410a = (Bitmap) bundle.getParcelable(f47398e);
                this.f47412c = bundle.getInt(f47400g, 0);
                this.f47411b = f(bundle.getBundle(f47399f));
            }
        }
    }

    public static class t extends y {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f47427f = "androidx.core.app.NotificationCompat$InboxStyle";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private ArrayList<CharSequence> f47428e = new ArrayList<>();

        public t() {
        }

        @NonNull
        public t A(@androidx.annotation.p0 CharSequence charSequence) {
            if (charSequence != null) {
                this.f47428e.add(n.A(charSequence));
            }
            return this;
        }

        @NonNull
        public t B(@androidx.annotation.p0 CharSequence charSequence) {
            this.f47451b = n.A(charSequence);
            return this;
        }

        @NonNull
        public t C(@androidx.annotation.p0 CharSequence charSequence) {
            this.f47452c = n.A(charSequence);
            this.f47453d = true;
            return this;
        }

        @Override // androidx.core.app.w.y
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public void b(androidx.core.app.t tVar) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(tVar.a()).setBigContentTitle(this.f47451b);
            if (this.f47453d) {
                bigContentTitle.setSummaryText(this.f47452c);
            }
            Iterator<CharSequence> it = this.f47428e.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine(it.next());
            }
        }

        @Override // androidx.core.app.w.y
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        protected void g(@NonNull Bundle bundle) {
            super.g(bundle);
            bundle.remove(w.X);
        }

        @Override // androidx.core.app.w.y
        @NonNull
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        protected String t() {
            return f47427f;
        }

        @Override // androidx.core.app.w.y
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        protected void y(@NonNull Bundle bundle) {
            super.y(bundle);
            this.f47428e.clear();
            if (bundle.containsKey(w.X)) {
                Collections.addAll(this.f47428e, bundle.getCharSequenceArray(w.X));
            }
        }

        public t(@androidx.annotation.p0 n nVar) {
            z(nVar);
        }
    }

    public static final class z implements r {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f47454f = "TvExtender";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        static final String f47455g = "android.tv.EXTENSIONS";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        private static final String f47456h = "flags";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final String f47457i = "content_intent";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final String f47458j = "delete_intent";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        static final String f47459k = "channel_id";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        static final String f47460l = "suppressShowOverApps";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int f47461m = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f47462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f47463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private PendingIntent f47464c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private PendingIntent f47465d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f47466e;

        public z() {
            this.f47462a = 1;
        }

        @Override // androidx.core.app.w.r
        @NonNull
        public n a(@NonNull n nVar) {
            Bundle bundle = new Bundle();
            bundle.putInt(f47456h, this.f47462a);
            bundle.putString(f47459k, this.f47463b);
            bundle.putBoolean(f47460l, this.f47466e);
            PendingIntent pendingIntent = this.f47464c;
            if (pendingIntent != null) {
                bundle.putParcelable(f47457i, pendingIntent);
            }
            PendingIntent pendingIntent2 = this.f47465d;
            if (pendingIntent2 != null) {
                bundle.putParcelable(f47458j, pendingIntent2);
            }
            nVar.t().putBundle(f47455g, bundle);
            return nVar;
        }

        @androidx.annotation.p0
        public String b() {
            return this.f47463b;
        }

        @androidx.annotation.p0
        public PendingIntent c() {
            return this.f47464c;
        }

        @androidx.annotation.p0
        public PendingIntent d() {
            return this.f47465d;
        }

        public boolean e() {
            return (this.f47462a & 1) != 0;
        }

        public boolean f() {
            return this.f47466e;
        }

        @NonNull
        public z g(@androidx.annotation.p0 String str) {
            this.f47463b = str;
            return this;
        }

        @NonNull
        public z h(@androidx.annotation.p0 PendingIntent pendingIntent) {
            this.f47464c = pendingIntent;
            return this;
        }

        @NonNull
        public z i(@androidx.annotation.p0 PendingIntent pendingIntent) {
            this.f47465d = pendingIntent;
            return this;
        }

        @NonNull
        public z j(boolean z10) {
            this.f47466e = z10;
            return this;
        }

        public z(@NonNull Notification notification) {
            Bundle bundle = notification.extras;
            Bundle bundle2 = bundle == null ? null : bundle.getBundle(f47455g);
            if (bundle2 != null) {
                this.f47462a = bundle2.getInt(f47456h);
                this.f47463b = bundle2.getString(f47459k);
                this.f47466e = bundle2.getBoolean(f47460l);
                this.f47464c = (PendingIntent) bundle2.getParcelable(f47457i);
                this.f47465d = (PendingIntent) bundle2.getParcelable(f47458j);
            }
        }
    }

    public static class u extends y {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f47429j = "androidx.core.app.NotificationCompat$MessagingStyle";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f47430k = 25;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List<d> f47431e = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List<d> f47432f = new ArrayList();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private j0 f47433g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @androidx.annotation.p0
        private CharSequence f47434h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @androidx.annotation.p0
        private Boolean f47435i;

        @w0(24)
        static class a {
            private a() {
            }

            static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            static Notification.MessagingStyle b(CharSequence charSequence) {
                return new Notification.MessagingStyle(charSequence);
            }

            static Notification.MessagingStyle c(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        @w0(26)
        static class b {
            private b() {
            }

            static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addHistoricMessage(message);
            }
        }

        @w0(28)
        static class c {
            private c() {
            }

            static Notification.MessagingStyle a(Person person) {
                return new Notification.MessagingStyle(person);
            }

            static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z10) {
                return messagingStyle.setGroupConversation(z10);
            }
        }

        u() {
        }

        @androidx.annotation.p0
        public static u E(@NonNull Notification notification) {
            y yVarS = y.s(notification);
            if (yVarS instanceof u) {
                return (u) yVarS;
            }
            return null;
        }

        @androidx.annotation.p0
        private d F() {
            for (int size = this.f47431e.size() - 1; size >= 0; size--) {
                d dVar = this.f47431e.get(size);
                if (dVar.g() != null && !TextUtils.isEmpty(dVar.g().f())) {
                    return dVar;
                }
            }
            if (this.f47431e.isEmpty()) {
                return null;
            }
            List<d> list = this.f47431e;
            return list.get(list.size() - 1);
        }

        private boolean L() {
            for (int size = this.f47431e.size() - 1; size >= 0; size--) {
                d dVar = this.f47431e.get(size);
                if (dVar.g() != null && dVar.g().f() == null) {
                    return true;
                }
            }
            return false;
        }

        @NonNull
        private TextAppearanceSpan N(int i10) {
            return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i10), null);
        }

        private CharSequence O(@NonNull d dVar) {
            androidx.core.text.a aVarC = androidx.core.text.a.c();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            CharSequence charSequenceF = dVar.g() == null ? "" : dVar.g().f();
            int iR = -16777216;
            if (TextUtils.isEmpty(charSequenceF)) {
                charSequenceF = this.f47433g.f();
                if (this.f47450a.r() != 0) {
                    iR = this.f47450a.r();
                }
            }
            CharSequence charSequenceM = aVarC.m(charSequenceF);
            spannableStringBuilder.append(charSequenceM);
            spannableStringBuilder.setSpan(N(iR), spannableStringBuilder.length() - charSequenceM.length(), spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) "  ").append(aVarC.m(dVar.i() != null ? dVar.i() : ""));
            return spannableStringBuilder;
        }

        @NonNull
        public u A(@androidx.annotation.p0 d dVar) {
            if (dVar != null) {
                this.f47432f.add(dVar);
                if (this.f47432f.size() > 25) {
                    this.f47432f.remove(0);
                }
            }
            return this;
        }

        @NonNull
        public u B(@androidx.annotation.p0 d dVar) {
            if (dVar != null) {
                this.f47431e.add(dVar);
                if (this.f47431e.size() > 25) {
                    this.f47431e.remove(0);
                }
            }
            return this;
        }

        @NonNull
        public u C(@androidx.annotation.p0 CharSequence charSequence, long j10, @androidx.annotation.p0 j0 j0Var) {
            B(new d(charSequence, j10, j0Var));
            return this;
        }

        @NonNull
        @Deprecated
        public u D(@androidx.annotation.p0 CharSequence charSequence, long j10, @androidx.annotation.p0 CharSequence charSequence2) {
            this.f47431e.add(new d(charSequence, j10, new j0.c().f(charSequence2).a()));
            if (this.f47431e.size() > 25) {
                this.f47431e.remove(0);
            }
            return this;
        }

        @androidx.annotation.p0
        public CharSequence G() {
            return this.f47434h;
        }

        @NonNull
        public List<d> H() {
            return this.f47432f;
        }

        @NonNull
        public List<d> I() {
            return this.f47431e;
        }

        @NonNull
        public j0 J() {
            return this.f47433g;
        }

        @androidx.annotation.p0
        @Deprecated
        public CharSequence K() {
            return this.f47433g.f();
        }

        public boolean M() {
            n nVar = this.f47450a;
            if (nVar != null && nVar.f47355a.getApplicationInfo().targetSdkVersion < 28 && this.f47435i == null) {
                return this.f47434h != null;
            }
            Boolean bool = this.f47435i;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        @NonNull
        public u P(@androidx.annotation.p0 CharSequence charSequence) {
            this.f47434h = charSequence;
            return this;
        }

        @NonNull
        public u Q(boolean z10) {
            this.f47435i = Boolean.valueOf(z10);
            return this;
        }

        @Override // androidx.core.app.w.y
        public void a(@NonNull Bundle bundle) {
            super.a(bundle);
            bundle.putCharSequence(w.f47212f0, this.f47433g.f());
            bundle.putBundle(w.f47215g0, this.f47433g.m());
            bundle.putCharSequence(w.f47252x0, this.f47434h);
            if (this.f47434h != null && this.f47435i.booleanValue()) {
                bundle.putCharSequence(w.f47218h0, this.f47434h);
            }
            if (!this.f47431e.isEmpty()) {
                bundle.putParcelableArray(w.f47221i0, d.a(this.f47431e));
            }
            if (!this.f47432f.isEmpty()) {
                bundle.putParcelableArray(w.f47224j0, d.a(this.f47432f));
            }
            Boolean bool = this.f47435i;
            if (bool != null) {
                bundle.putBoolean(w.f47226k0, bool.booleanValue());
            }
        }

        @Override // androidx.core.app.w.y
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public void b(androidx.core.app.t tVar) {
            Q(M());
            Notification.MessagingStyle messagingStyleA = c.a(this.f47433g.k());
            Iterator<d> it = this.f47431e.iterator();
            while (it.hasNext()) {
                a.a(messagingStyleA, it.next().l());
            }
            Iterator<d> it2 = this.f47432f.iterator();
            while (it2.hasNext()) {
                b.a(messagingStyleA, it2.next().l());
            }
            this.f47435i.booleanValue();
            a.c(messagingStyleA, this.f47434h);
            c.b(messagingStyleA, this.f47435i.booleanValue());
            messagingStyleA.setBuilder(tVar.a());
        }

        @Override // androidx.core.app.w.y
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        protected void g(@NonNull Bundle bundle) {
            super.g(bundle);
            bundle.remove(w.f47215g0);
            bundle.remove(w.f47212f0);
            bundle.remove(w.f47218h0);
            bundle.remove(w.f47252x0);
            bundle.remove(w.f47221i0);
            bundle.remove(w.f47224j0);
            bundle.remove(w.f47226k0);
        }

        @Override // androidx.core.app.w.y
        @NonNull
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        protected String t() {
            return f47429j;
        }

        @Override // androidx.core.app.w.y
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        protected void y(@NonNull Bundle bundle) {
            super.y(bundle);
            this.f47431e.clear();
            if (bundle.containsKey(w.f47215g0)) {
                this.f47433g = j0.b(bundle.getBundle(w.f47215g0));
            } else {
                this.f47433g = new j0.c().f(bundle.getString(w.f47212f0)).a();
            }
            CharSequence charSequence = bundle.getCharSequence(w.f47218h0);
            this.f47434h = charSequence;
            if (charSequence == null) {
                this.f47434h = bundle.getCharSequence(w.f47252x0);
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(w.f47221i0);
            if (parcelableArray != null) {
                this.f47431e.addAll(d.f(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray(w.f47224j0);
            if (parcelableArray2 != null) {
                this.f47432f.addAll(d.f(parcelableArray2));
            }
            if (bundle.containsKey(w.f47226k0)) {
                this.f47435i = Boolean.valueOf(bundle.getBoolean(w.f47226k0));
            }
        }

        @Deprecated
        public u(@NonNull CharSequence charSequence) {
            this.f47433g = new j0.c().f(charSequence).a();
        }

        public static final class d {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            static final String f47436g = "text";

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            static final String f47437h = "time";

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            static final String f47438i = "sender";

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            static final String f47439j = "type";

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            static final String f47440k = "uri";

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            static final String f47441l = "extras";

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            static final String f47442m = "person";

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            static final String f47443n = "sender_person";

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final CharSequence f47444a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final long f47445b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @androidx.annotation.p0
            private final j0 f47446c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private Bundle f47447d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            @androidx.annotation.p0
            private String f47448e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            @androidx.annotation.p0
            private Uri f47449f;

            @w0(24)
            static class a {
                private a() {
                }

                static Notification.MessagingStyle.Message a(CharSequence charSequence, long j10, CharSequence charSequence2) {
                    return new Notification.MessagingStyle.Message(charSequence, j10, charSequence2);
                }

                static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String str, Uri uri) {
                    return message.setData(str, uri);
                }
            }

            @w0(28)
            static class b {
                private b() {
                }

                static Parcelable a(Person person) {
                    return person;
                }

                static Notification.MessagingStyle.Message b(CharSequence charSequence, long j10, Person person) {
                    return new Notification.MessagingStyle.Message(charSequence, j10, person);
                }
            }

            public d(@androidx.annotation.p0 CharSequence charSequence, long j10, @androidx.annotation.p0 j0 j0Var) {
                this.f47447d = new Bundle();
                this.f47444a = charSequence;
                this.f47445b = j10;
                this.f47446c = j0Var;
            }

            @NonNull
            static Bundle[] a(@NonNull List<d> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    bundleArr[i10] = list.get(i10).m();
                }
                return bundleArr;
            }

            @androidx.annotation.p0
            static d e(@NonNull Bundle bundle) {
                j0 j0VarA;
                try {
                    if (bundle.containsKey("text") && bundle.containsKey(f47437h)) {
                        if (bundle.containsKey(f47442m)) {
                            j0VarA = j0.b(bundle.getBundle(f47442m));
                        } else if (bundle.containsKey(f47443n)) {
                            j0VarA = j0.a((Person) bundle.getParcelable(f47443n));
                        } else {
                            j0VarA = bundle.containsKey(f47438i) ? new j0.c().f(bundle.getCharSequence(f47438i)).a() : null;
                        }
                        d dVar = new d(bundle.getCharSequence("text"), bundle.getLong(f47437h), j0VarA);
                        if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                            dVar.k(bundle.getString("type"), (Uri) bundle.getParcelable("uri"));
                        }
                        if (bundle.containsKey("extras")) {
                            dVar.d().putAll(bundle.getBundle("extras"));
                        }
                        return dVar;
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            @NonNull
            static List<d> f(@NonNull Parcelable[] parcelableArr) {
                d dVarE;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (Parcelable parcelable : parcelableArr) {
                    if ((parcelable instanceof Bundle) && (dVarE = e((Bundle) parcelable)) != null) {
                        arrayList.add(dVarE);
                    }
                }
                return arrayList;
            }

            @NonNull
            private Bundle m() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f47444a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong(f47437h, this.f47445b);
                j0 j0Var = this.f47446c;
                if (j0Var != null) {
                    bundle.putCharSequence(f47438i, j0Var.f());
                    bundle.putParcelable(f47443n, b.a(this.f47446c.k()));
                }
                String str = this.f47448e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f47449f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f47447d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            @androidx.annotation.p0
            public String b() {
                return this.f47448e;
            }

            @androidx.annotation.p0
            public Uri c() {
                return this.f47449f;
            }

            @NonNull
            public Bundle d() {
                return this.f47447d;
            }

            @androidx.annotation.p0
            public j0 g() {
                return this.f47446c;
            }

            @androidx.annotation.p0
            @Deprecated
            public CharSequence h() {
                j0 j0Var = this.f47446c;
                if (j0Var == null) {
                    return null;
                }
                return j0Var.f();
            }

            @androidx.annotation.p0
            public CharSequence i() {
                return this.f47444a;
            }

            public long j() {
                return this.f47445b;
            }

            @NonNull
            public d k(@androidx.annotation.p0 String str, @androidx.annotation.p0 Uri uri) {
                this.f47448e = str;
                this.f47449f = uri;
                return this;
            }

            @NonNull
            @w0(24)
            @b1({b1.a.LIBRARY_GROUP_PREFIX})
            Notification.MessagingStyle.Message l() {
                j0 j0VarG = g();
                Notification.MessagingStyle.Message messageB = b.b(i(), j(), j0VarG == null ? null : j0VarG.k());
                if (b() != null) {
                    a.b(messageB, b(), c());
                }
                return messageB;
            }

            @Deprecated
            public d(@androidx.annotation.p0 CharSequence charSequence, long j10, @androidx.annotation.p0 CharSequence charSequence2) {
                this(charSequence, j10, new j0.c().f(charSequence2).a());
            }
        }

        public u(@NonNull j0 j0Var) {
            if (!TextUtils.isEmpty(j0Var.f())) {
                this.f47433g = j0Var;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }
    }

    public static final class a0 implements r {
        private static final String A = "displayIntent";
        private static final String B = "pages";
        private static final String C = "background";
        private static final String D = "contentIcon";
        private static final String E = "contentIconGravity";
        private static final String F = "contentActionIndex";
        private static final String G = "customSizePreset";
        private static final String H = "customContentHeight";
        private static final String I = "gravity";
        private static final String J = "hintScreenTimeout";
        private static final String K = "dismissalId";
        private static final String L = "bridgeTag";
        private static final int M = 1;
        private static final int N = 2;
        private static final int O = 4;
        private static final int P = 8;
        private static final int Q = 16;
        private static final int R = 32;
        private static final int S = 64;
        private static final int T = 1;
        private static final int U = 8388613;
        private static final int V = 80;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f47257o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @Deprecated
        public static final int f47258p = 0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @Deprecated
        public static final int f47259q = 1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @Deprecated
        public static final int f47260r = 2;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @Deprecated
        public static final int f47261s = 3;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @Deprecated
        public static final int f47262t = 4;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @Deprecated
        public static final int f47263u = 5;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @Deprecated
        public static final int f47264v = 0;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @Deprecated
        public static final int f47265w = -1;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static final String f47266x = "android.wearable.EXTENSIONS";

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final String f47267y = "actions";

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final String f47268z = "flags";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ArrayList<b> f47269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f47270b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private PendingIntent f47271c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ArrayList<Notification> f47272d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Bitmap f47273e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f47274f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f47275g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f47276h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f47277i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f47278j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f47279k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f47280l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private String f47281m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f47282n;

        @w0(20)
        static class a {
            private a() {
            }

            static Notification.Action.Builder a(Notification.Action.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            static Notification.Action.Builder b(Notification.Action.Builder builder, RemoteInput remoteInput) {
                return builder.addRemoteInput(remoteInput);
            }

            static Notification.Action c(Notification.Action.Builder builder) {
                return builder.build();
            }

            static Notification.Action.Builder d(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(i10, charSequence, pendingIntent);
            }

            public static b e(ArrayList<Parcelable> arrayList, int i10) {
                return w.b((Notification.Action) arrayList.get(i10));
            }
        }

        @w0(23)
        static class b {
            private b() {
            }

            static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }
        }

        @w0(24)
        static class c {
            private c() {
            }

            static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
                return builder.setAllowGeneratedReplies(z10);
            }
        }

        @w0(31)
        static class d {
            private d() {
            }

            static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
                return builder.setAuthenticationRequired(z10);
            }
        }

        public a0() {
            this.f47269a = new ArrayList<>();
            this.f47270b = 1;
            this.f47272d = new ArrayList<>();
            this.f47275g = 8388613;
            this.f47276h = -1;
            this.f47277i = 0;
            this.f47279k = 80;
        }

        private void N(int i10, boolean z10) {
            if (z10) {
                this.f47270b = i10 | this.f47270b;
            } else {
                this.f47270b = (~i10) & this.f47270b;
            }
        }

        @w0(20)
        private static Notification.Action i(b bVar) {
            int i10 = Build.VERSION.SDK_INT;
            IconCompat iconCompatF = bVar.f();
            Notification.Action.Builder builderA = b.a(iconCompatF == null ? null : iconCompatF.M(), bVar.j(), bVar.a());
            Bundle bundle = bVar.d() != null ? new Bundle(bVar.d()) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", bVar.b());
            c.a(builderA, bVar.b());
            if (i10 >= 31) {
                d.a(builderA, bVar.k());
            }
            a.a(builderA, bundle);
            l0[] l0VarArrG = bVar.g();
            if (l0VarArrG != null) {
                for (RemoteInput remoteInput : l0.d(l0VarArrG)) {
                    a.b(builderA, remoteInput);
                }
            }
            return a.c(builderA);
        }

        @Deprecated
        public boolean A() {
            return (this.f47270b & 4) != 0;
        }

        @NonNull
        @Deprecated
        public List<Notification> B() {
            return this.f47272d;
        }

        public boolean C() {
            return (this.f47270b & 8) != 0;
        }

        @NonNull
        @Deprecated
        public a0 D(@androidx.annotation.p0 Bitmap bitmap) {
            this.f47273e = bitmap;
            return this;
        }

        @NonNull
        public a0 E(@androidx.annotation.p0 String str) {
            this.f47282n = str;
            return this;
        }

        @NonNull
        public a0 F(int i10) {
            this.f47276h = i10;
            return this;
        }

        @NonNull
        @Deprecated
        public a0 G(int i10) {
            this.f47274f = i10;
            return this;
        }

        @NonNull
        @Deprecated
        public a0 H(int i10) {
            this.f47275g = i10;
            return this;
        }

        @NonNull
        public a0 I(boolean z10) {
            N(1, z10);
            return this;
        }

        @NonNull
        @Deprecated
        public a0 J(int i10) {
            this.f47278j = i10;
            return this;
        }

        @NonNull
        @Deprecated
        public a0 K(int i10) {
            this.f47277i = i10;
            return this;
        }

        @NonNull
        public a0 L(@androidx.annotation.p0 String str) {
            this.f47281m = str;
            return this;
        }

        @NonNull
        @Deprecated
        public a0 M(@androidx.annotation.p0 PendingIntent pendingIntent) {
            this.f47271c = pendingIntent;
            return this;
        }

        @NonNull
        @Deprecated
        public a0 O(int i10) {
            this.f47279k = i10;
            return this;
        }

        @NonNull
        @Deprecated
        public a0 P(boolean z10) {
            N(32, z10);
            return this;
        }

        @NonNull
        @Deprecated
        public a0 Q(boolean z10) {
            N(16, z10);
            return this;
        }

        @NonNull
        public a0 R(boolean z10) {
            N(64, z10);
            return this;
        }

        @NonNull
        @Deprecated
        public a0 S(boolean z10) {
            N(2, z10);
            return this;
        }

        @NonNull
        @Deprecated
        public a0 T(int i10) {
            this.f47280l = i10;
            return this;
        }

        @NonNull
        @Deprecated
        public a0 U(boolean z10) {
            N(4, z10);
            return this;
        }

        @NonNull
        public a0 V(boolean z10) {
            N(8, z10);
            return this;
        }

        @Override // androidx.core.app.w.r
        @NonNull
        public n a(@NonNull n nVar) {
            Bundle bundle = new Bundle();
            if (!this.f47269a.isEmpty()) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f47269a.size());
                Iterator<b> it = this.f47269a.iterator();
                while (it.hasNext()) {
                    arrayList.add(i(it.next()));
                }
                bundle.putParcelableArrayList(f47267y, arrayList);
            }
            int i10 = this.f47270b;
            if (i10 != 1) {
                bundle.putInt(f47268z, i10);
            }
            PendingIntent pendingIntent = this.f47271c;
            if (pendingIntent != null) {
                bundle.putParcelable(A, pendingIntent);
            }
            if (!this.f47272d.isEmpty()) {
                ArrayList<Notification> arrayList2 = this.f47272d;
                bundle.putParcelableArray(B, (Parcelable[]) arrayList2.toArray(new Notification[arrayList2.size()]));
            }
            Bitmap bitmap = this.f47273e;
            if (bitmap != null) {
                bundle.putParcelable(C, bitmap);
            }
            int i11 = this.f47274f;
            if (i11 != 0) {
                bundle.putInt(D, i11);
            }
            int i12 = this.f47275g;
            if (i12 != 8388613) {
                bundle.putInt(E, i12);
            }
            int i13 = this.f47276h;
            if (i13 != -1) {
                bundle.putInt(F, i13);
            }
            int i14 = this.f47277i;
            if (i14 != 0) {
                bundle.putInt(G, i14);
            }
            int i15 = this.f47278j;
            if (i15 != 0) {
                bundle.putInt(H, i15);
            }
            int i16 = this.f47279k;
            if (i16 != 80) {
                bundle.putInt(I, i16);
            }
            int i17 = this.f47280l;
            if (i17 != 0) {
                bundle.putInt(J, i17);
            }
            String str = this.f47281m;
            if (str != null) {
                bundle.putString(K, str);
            }
            String str2 = this.f47282n;
            if (str2 != null) {
                bundle.putString(L, str2);
            }
            nVar.t().putBundle(f47266x, bundle);
            return nVar;
        }

        @NonNull
        public a0 b(@NonNull b bVar) {
            this.f47269a.add(bVar);
            return this;
        }

        @NonNull
        public a0 c(@NonNull List<b> list) {
            this.f47269a.addAll(list);
            return this;
        }

        @NonNull
        @Deprecated
        public a0 d(@NonNull Notification notification) {
            this.f47272d.add(notification);
            return this;
        }

        @NonNull
        @Deprecated
        public a0 e(@NonNull List<Notification> list) {
            this.f47272d.addAll(list);
            return this;
        }

        @NonNull
        public a0 f() {
            this.f47269a.clear();
            return this;
        }

        @NonNull
        @Deprecated
        public a0 g() {
            this.f47272d.clear();
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a0 clone() {
            a0 a0Var = new a0();
            a0Var.f47269a = new ArrayList<>(this.f47269a);
            a0Var.f47270b = this.f47270b;
            a0Var.f47271c = this.f47271c;
            a0Var.f47272d = new ArrayList<>(this.f47272d);
            a0Var.f47273e = this.f47273e;
            a0Var.f47274f = this.f47274f;
            a0Var.f47275g = this.f47275g;
            a0Var.f47276h = this.f47276h;
            a0Var.f47277i = this.f47277i;
            a0Var.f47278j = this.f47278j;
            a0Var.f47279k = this.f47279k;
            a0Var.f47280l = this.f47280l;
            a0Var.f47281m = this.f47281m;
            a0Var.f47282n = this.f47282n;
            return a0Var;
        }

        @NonNull
        public List<b> j() {
            return this.f47269a;
        }

        @androidx.annotation.p0
        @Deprecated
        public Bitmap k() {
            return this.f47273e;
        }

        @androidx.annotation.p0
        public String l() {
            return this.f47282n;
        }

        public int m() {
            return this.f47276h;
        }

        @Deprecated
        public int n() {
            return this.f47274f;
        }

        @Deprecated
        public int o() {
            return this.f47275g;
        }

        public boolean p() {
            return (this.f47270b & 1) != 0;
        }

        @Deprecated
        public int q() {
            return this.f47278j;
        }

        @Deprecated
        public int r() {
            return this.f47277i;
        }

        @androidx.annotation.p0
        public String s() {
            return this.f47281m;
        }

        @androidx.annotation.p0
        @Deprecated
        public PendingIntent t() {
            return this.f47271c;
        }

        @Deprecated
        public int u() {
            return this.f47279k;
        }

        @Deprecated
        public boolean v() {
            return (this.f47270b & 32) != 0;
        }

        @Deprecated
        public boolean w() {
            return (this.f47270b & 16) != 0;
        }

        public boolean x() {
            return (this.f47270b & 64) != 0;
        }

        @Deprecated
        public boolean y() {
            return (this.f47270b & 2) != 0;
        }

        @Deprecated
        public int z() {
            return this.f47280l;
        }

        public a0(@NonNull Notification notification) {
            this.f47269a = new ArrayList<>();
            this.f47270b = 1;
            this.f47272d = new ArrayList<>();
            this.f47275g = 8388613;
            this.f47276h = -1;
            this.f47277i = 0;
            this.f47279k = 80;
            Bundle bundleN = w.n(notification);
            Bundle bundle = bundleN != null ? bundleN.getBundle(f47266x) : null;
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(f47267y);
                if (parcelableArrayList != null) {
                    int size = parcelableArrayList.size();
                    b[] bVarArr = new b[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        bVarArr[i10] = a.e(parcelableArrayList, i10);
                    }
                    Collections.addAll(this.f47269a, bVarArr);
                }
                this.f47270b = bundle.getInt(f47268z, 1);
                this.f47271c = (PendingIntent) bundle.getParcelable(A);
                Notification[] notificationArrU = w.u(bundle, B);
                if (notificationArrU != null) {
                    Collections.addAll(this.f47272d, notificationArrU);
                }
                this.f47273e = (Bitmap) bundle.getParcelable(C);
                this.f47274f = bundle.getInt(D);
                this.f47275g = bundle.getInt(E, 8388613);
                this.f47276h = bundle.getInt(F, -1);
                this.f47277i = bundle.getInt(G, 0);
                this.f47278j = bundle.getInt(H);
                this.f47279k = bundle.getInt(I, 80);
                this.f47280l = bundle.getInt(J);
                this.f47281m = bundle.getString(K);
                this.f47282n = bundle.getString(L);
            }
        }
    }

    public static class n {
        private static final int Y = 5120;
        boolean A;
        boolean B;
        boolean C;
        String D;
        Bundle E;
        int F;
        int G;
        Notification H;
        RemoteViews I;
        RemoteViews J;
        RemoteViews K;
        String L;
        int M;
        String N;
        androidx.core.content.c0 O;
        long P;
        int Q;
        int R;
        boolean S;
        m T;
        Notification U;
        boolean V;
        Object W;

        @Deprecated
        public ArrayList<String> X;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public Context f47355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public ArrayList<b> f47356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public ArrayList<j0> f47357c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ArrayList<b> f47358d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        CharSequence f47359e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        CharSequence f47360f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        PendingIntent f47361g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        PendingIntent f47362h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        RemoteViews f47363i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        IconCompat f47364j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        CharSequence f47365k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f47366l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f47367m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f47368n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f47369o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f47370p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        y f47371q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        CharSequence f47372r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        CharSequence f47373s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        CharSequence[] f47374t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f47375u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f47376v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        boolean f47377w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        String f47378x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        boolean f47379y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        String f47380z;

        @w0(21)
        static class a {
            private a() {
            }

            static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i10) {
                return builder.setContentType(i10);
            }

            static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i10) {
                return builder.setLegacyStreamType(i10);
            }

            static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i10) {
                return builder.setUsage(i10);
            }
        }

        @w0(23)
        static class b {
            private b() {
            }

            static Icon a(Notification notification) {
                return notification.getLargeIcon();
            }

            static Icon b(Notification notification) {
                return notification.getSmallIcon();
            }
        }

        @w0(24)
        static class c {
            private c() {
            }

            static RemoteViews a(Notification.Builder builder) {
                return builder.createHeadsUpContentView();
            }

            static RemoteViews b(Notification.Builder builder) {
                return builder.createContentView();
            }

            static RemoteViews c(Notification.Builder builder) {
                return builder.createHeadsUpContentView();
            }

            static Notification.Builder d(Context context, Notification notification) {
                return Notification.Builder.recoverBuilder(context, notification);
            }
        }

        public n(@NonNull Context context, @NonNull Notification notification) {
            this(context, w.i(notification));
            Bundle bundle = notification.extras;
            y yVarS = y.s(notification);
            O(w.m(notification)).N(w.l(notification)).L(w.k(notification)).A0(w.D(notification)).o0(w.z(notification)).z0(yVarS).Y(w.o(notification)).a0(w.H(notification)).f0(w.t(notification)).H0(notification.when).r0(w.B(notification)).E0(w.F(notification)).C(w.e(notification)).j0(w.w(notification)).i0(w.v(notification)).e0(w.s(notification)).b0(notification.largeIcon).D(w.f(notification)).F(w.h(notification)).E(w.g(notification)).h0(notification.number).B0(notification.tickerText).M(notification.contentIntent).T(notification.deleteIntent).X(notification.fullScreenIntent, w.q(notification)).y0(notification.sound, notification.audioStreamType).F0(notification.vibrate).d0(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).S(notification.defaults).k0(notification.priority).I(w.j(notification)).G0(w.G(notification)).m0(w.y(notification)).w0(w.C(notification)).D0(w.E(notification)).p0(w.A(notification)).l0(bundle.getInt(w.N), bundle.getInt(w.M), bundle.getBoolean(w.O)).B(w.d(notification)).u0(notification.icon, notification.iconLevel).c(u(notification, yVarS));
            this.W = b.b(notification);
            Icon iconA = b.a(notification);
            if (iconA != null) {
                this.f47364j = IconCompat.n(iconA);
            }
            Notification.Action[] actionArr = notification.actions;
            if (actionArr != null && actionArr.length != 0) {
                for (Notification.Action action : actionArr) {
                    b(b.a.f(action).c());
                }
            }
            List<b> listR = w.r(notification);
            if (!listR.isEmpty()) {
                Iterator<b> it = listR.iterator();
                while (it.hasNext()) {
                    e(it.next());
                }
            }
            String[] stringArray = notification.extras.getStringArray(w.f47197a0);
            if (stringArray != null && stringArray.length != 0) {
                for (String str : stringArray) {
                    g(str);
                }
            }
            ArrayList parcelableArrayList = notification.extras.getParcelableArrayList(w.f47200b0);
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                Iterator it2 = parcelableArrayList.iterator();
                while (it2.hasNext()) {
                    f(j0.a((Person) it2.next()));
                }
            }
            if (bundle.containsKey(w.Q)) {
                H(bundle.getBoolean(w.Q));
            }
            if (bundle.containsKey(w.R)) {
                J(bundle.getBoolean(w.R));
            }
        }

        @androidx.annotation.p0
        protected static CharSequence A(@androidx.annotation.p0 CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > Y) ? charSequence.subSequence(0, Y) : charSequence;
        }

        private boolean I0() {
            y yVar = this.f47371q;
            return yVar == null || !yVar.r();
        }

        private void V(int i10, boolean z10) {
            if (z10) {
                Notification notification = this.U;
                notification.flags = i10 | notification.flags;
            } else {
                Notification notification2 = this.U;
                notification2.flags = (~i10) & notification2.flags;
            }
        }

        @androidx.annotation.p0
        private static Bundle u(@NonNull Notification notification, @androidx.annotation.p0 y yVar) {
            if (notification.extras == null) {
                return null;
            }
            Bundle bundle = new Bundle(notification.extras);
            bundle.remove(w.B);
            bundle.remove(w.D);
            bundle.remove(w.G);
            bundle.remove(w.E);
            bundle.remove(w.f47202c);
            bundle.remove(w.f47205d);
            bundle.remove(w.S);
            bundle.remove(w.M);
            bundle.remove(w.N);
            bundle.remove(w.O);
            bundle.remove(w.Q);
            bundle.remove(w.R);
            bundle.remove(w.f47200b0);
            bundle.remove(w.f47197a0);
            bundle.remove(androidx.core.app.z.f47479d);
            bundle.remove(androidx.core.app.z.f47477b);
            bundle.remove(androidx.core.app.z.f47478c);
            bundle.remove(androidx.core.app.z.f47476a);
            bundle.remove(androidx.core.app.z.f47480e);
            Bundle bundle2 = bundle.getBundle("android.car.EXTENSIONS");
            if (bundle2 != null) {
                Bundle bundle3 = new Bundle(bundle2);
                bundle3.remove("invisible_actions");
                bundle.putBundle("android.car.EXTENSIONS", bundle3);
            }
            if (yVar != null) {
                yVar.g(bundle);
            }
            return bundle;
        }

        @NonNull
        public n A0(@androidx.annotation.p0 CharSequence charSequence) {
            this.f47372r = A(charSequence);
            return this;
        }

        @NonNull
        public n B(boolean z10) {
            this.S = z10;
            return this;
        }

        @NonNull
        public n B0(@androidx.annotation.p0 CharSequence charSequence) {
            this.U.tickerText = A(charSequence);
            return this;
        }

        @NonNull
        public n C(boolean z10) {
            V(16, z10);
            return this;
        }

        @NonNull
        @Deprecated
        public n C0(@androidx.annotation.p0 CharSequence charSequence, @androidx.annotation.p0 RemoteViews remoteViews) {
            this.U.tickerText = A(charSequence);
            this.f47363i = remoteViews;
            return this;
        }

        @NonNull
        public n D(int i10) {
            this.M = i10;
            return this;
        }

        @NonNull
        public n D0(long j10) {
            this.P = j10;
            return this;
        }

        @NonNull
        public n E(@androidx.annotation.p0 m mVar) {
            this.T = mVar;
            return this;
        }

        @NonNull
        public n E0(boolean z10) {
            this.f47369o = z10;
            return this;
        }

        @NonNull
        public n F(@androidx.annotation.p0 String str) {
            this.D = str;
            return this;
        }

        @NonNull
        public n F0(@androidx.annotation.p0 long[] jArr) {
            this.U.vibrate = jArr;
            return this;
        }

        @NonNull
        public n G(@NonNull String str) {
            this.L = str;
            return this;
        }

        @NonNull
        public n G0(int i10) {
            this.G = i10;
            return this;
        }

        @NonNull
        @w0(24)
        public n H(boolean z10) {
            this.f47370p = z10;
            t().putBoolean(w.Q, z10);
            return this;
        }

        @NonNull
        public n H0(long j10) {
            this.U.when = j10;
            return this;
        }

        @NonNull
        public n I(@androidx.annotation.l int i10) {
            this.F = i10;
            return this;
        }

        @NonNull
        public n J(boolean z10) {
            this.B = z10;
            this.C = true;
            return this;
        }

        @NonNull
        public n K(@androidx.annotation.p0 RemoteViews remoteViews) {
            this.U.contentView = remoteViews;
            return this;
        }

        @NonNull
        public n L(@androidx.annotation.p0 CharSequence charSequence) {
            this.f47365k = A(charSequence);
            return this;
        }

        @NonNull
        public n M(@androidx.annotation.p0 PendingIntent pendingIntent) {
            this.f47361g = pendingIntent;
            return this;
        }

        @NonNull
        public n N(@androidx.annotation.p0 CharSequence charSequence) {
            this.f47360f = A(charSequence);
            return this;
        }

        @NonNull
        public n O(@androidx.annotation.p0 CharSequence charSequence) {
            this.f47359e = A(charSequence);
            return this;
        }

        @NonNull
        public n P(@androidx.annotation.p0 RemoteViews remoteViews) {
            this.J = remoteViews;
            return this;
        }

        @NonNull
        public n Q(@androidx.annotation.p0 RemoteViews remoteViews) {
            this.I = remoteViews;
            return this;
        }

        @NonNull
        public n R(@androidx.annotation.p0 RemoteViews remoteViews) {
            this.K = remoteViews;
            return this;
        }

        @NonNull
        public n S(int i10) {
            Notification notification = this.U;
            notification.defaults = i10;
            if ((i10 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        @NonNull
        public n T(@androidx.annotation.p0 PendingIntent pendingIntent) {
            this.U.deleteIntent = pendingIntent;
            return this;
        }

        @NonNull
        public n U(@androidx.annotation.p0 Bundle bundle) {
            this.E = bundle;
            return this;
        }

        @NonNull
        public n W(int i10) {
            this.R = i10;
            return this;
        }

        @NonNull
        public n X(@androidx.annotation.p0 PendingIntent pendingIntent, boolean z10) {
            this.f47362h = pendingIntent;
            V(128, z10);
            return this;
        }

        @NonNull
        public n Y(@androidx.annotation.p0 String str) {
            this.f47378x = str;
            return this;
        }

        @NonNull
        public n Z(int i10) {
            this.Q = i10;
            return this;
        }

        @NonNull
        public n a(int i10, @androidx.annotation.p0 CharSequence charSequence, @androidx.annotation.p0 PendingIntent pendingIntent) {
            this.f47356b.add(new b(i10, charSequence, pendingIntent));
            return this;
        }

        @NonNull
        public n a0(boolean z10) {
            this.f47379y = z10;
            return this;
        }

        @NonNull
        public n b(@androidx.annotation.p0 b bVar) {
            if (bVar != null) {
                this.f47356b.add(bVar);
            }
            return this;
        }

        @NonNull
        public n b0(@androidx.annotation.p0 Bitmap bitmap) {
            this.f47364j = bitmap == null ? null : IconCompat.t(w.I(this.f47355a, bitmap));
            return this;
        }

        @NonNull
        public n c(@androidx.annotation.p0 Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.E;
                if (bundle2 == null) {
                    this.E = new Bundle(bundle);
                    return this;
                }
                bundle2.putAll(bundle);
            }
            return this;
        }

        @NonNull
        @w0(23)
        public n c0(@androidx.annotation.p0 Icon icon) {
            this.f47364j = icon == null ? null : IconCompat.n(icon);
            return this;
        }

        @NonNull
        @w0(21)
        public n d(int i10, @androidx.annotation.p0 CharSequence charSequence, @androidx.annotation.p0 PendingIntent pendingIntent) {
            this.f47358d.add(new b(i10, charSequence, pendingIntent));
            return this;
        }

        @NonNull
        public n d0(@androidx.annotation.l int i10, int i11, int i12) {
            Notification notification = this.U;
            notification.ledARGB = i10;
            notification.ledOnMS = i11;
            notification.ledOffMS = i12;
            notification.flags = ((i11 == 0 || i12 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        @NonNull
        @w0(21)
        public n e(@androidx.annotation.p0 b bVar) {
            if (bVar != null) {
                this.f47358d.add(bVar);
            }
            return this;
        }

        @NonNull
        public n e0(boolean z10) {
            this.A = z10;
            return this;
        }

        @NonNull
        public n f(@androidx.annotation.p0 j0 j0Var) {
            if (j0Var != null) {
                this.f47357c.add(j0Var);
            }
            return this;
        }

        @NonNull
        public n f0(@androidx.annotation.p0 androidx.core.content.c0 c0Var) {
            this.O = c0Var;
            return this;
        }

        @NonNull
        @Deprecated
        public n g(@androidx.annotation.p0 String str) {
            if (str != null && !str.isEmpty()) {
                this.X.add(str);
            }
            return this;
        }

        @NonNull
        @Deprecated
        public n g0() {
            this.V = true;
            return this;
        }

        @NonNull
        public Notification h() {
            return new androidx.core.app.y(this).c();
        }

        @NonNull
        public n h0(int i10) {
            this.f47366l = i10;
            return this;
        }

        @NonNull
        public n i() {
            this.f47356b.clear();
            return this;
        }

        @NonNull
        public n i0(boolean z10) {
            V(2, z10);
            return this;
        }

        @NonNull
        public n j() {
            this.f47358d.clear();
            Bundle bundle = this.E.getBundle("android.car.EXTENSIONS");
            if (bundle != null) {
                Bundle bundle2 = new Bundle(bundle);
                bundle2.remove("invisible_actions");
                this.E.putBundle("android.car.EXTENSIONS", bundle2);
            }
            return this;
        }

        @NonNull
        public n j0(boolean z10) {
            V(8, z10);
            return this;
        }

        @NonNull
        public n k() {
            this.f47357c.clear();
            this.X.clear();
            return this;
        }

        @NonNull
        public n k0(int i10) {
            this.f47367m = i10;
            return this;
        }

        @e.a({"BuilderSetStyle"})
        @androidx.annotation.p0
        public RemoteViews l() {
            RemoteViews remoteViewsV;
            if (this.J != null && I0()) {
                return this.J;
            }
            androidx.core.app.y yVar = new androidx.core.app.y(this);
            y yVar2 = this.f47371q;
            return (yVar2 == null || (remoteViewsV = yVar2.v(yVar)) == null) ? c.a(c.d(this.f47355a, yVar.c())) : remoteViewsV;
        }

        @NonNull
        public n l0(int i10, int i11, boolean z10) {
            this.f47375u = i10;
            this.f47376v = i11;
            this.f47377w = z10;
            return this;
        }

        @e.a({"BuilderSetStyle"})
        @androidx.annotation.p0
        public RemoteViews m() {
            RemoteViews remoteViewsW;
            if (this.I != null && I0()) {
                return this.I;
            }
            androidx.core.app.y yVar = new androidx.core.app.y(this);
            y yVar2 = this.f47371q;
            return (yVar2 == null || (remoteViewsW = yVar2.w(yVar)) == null) ? c.b(c.d(this.f47355a, yVar.c())) : remoteViewsW;
        }

        @NonNull
        public n m0(@androidx.annotation.p0 Notification notification) {
            this.H = notification;
            return this;
        }

        @e.a({"BuilderSetStyle"})
        @androidx.annotation.p0
        public RemoteViews n() {
            RemoteViews remoteViewsX;
            if (this.K != null && I0()) {
                return this.K;
            }
            androidx.core.app.y yVar = new androidx.core.app.y(this);
            y yVar2 = this.f47371q;
            return (yVar2 == null || (remoteViewsX = yVar2.x(yVar)) == null) ? c.c(c.d(this.f47355a, yVar.c())) : remoteViewsX;
        }

        @NonNull
        public n n0(@androidx.annotation.p0 CharSequence[] charSequenceArr) {
            this.f47374t = charSequenceArr;
            return this;
        }

        @NonNull
        public n o(@NonNull r rVar) {
            rVar.a(this);
            return this;
        }

        @NonNull
        public n o0(@androidx.annotation.p0 CharSequence charSequence) {
            this.f47373s = A(charSequence);
            return this;
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews p() {
            return this.J;
        }

        @NonNull
        public n p0(@androidx.annotation.p0 String str) {
            this.N = str;
            return this;
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        @androidx.annotation.p0
        public m q() {
            return this.T;
        }

        @NonNull
        public n q0(@androidx.annotation.p0 androidx.core.content.pm.e eVar) {
            if (eVar != null) {
                this.N = eVar.k();
                if (this.O == null) {
                    if (eVar.o() != null) {
                        this.O = eVar.o();
                    } else if (eVar.k() != null) {
                        this.O = new androidx.core.content.c0(eVar.k());
                    }
                }
                if (this.f47359e == null) {
                    O(eVar.w());
                }
            }
            return this;
        }

        @androidx.annotation.l
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public int r() {
            return this.F;
        }

        @NonNull
        public n r0(boolean z10) {
            this.f47368n = z10;
            return this;
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews s() {
            return this.I;
        }

        @NonNull
        public n s0(boolean z10) {
            this.V = z10;
            return this;
        }

        @NonNull
        public Bundle t() {
            if (this.E == null) {
                this.E = new Bundle();
            }
            return this.E;
        }

        @NonNull
        public n t0(int i10) {
            this.U.icon = i10;
            return this;
        }

        @NonNull
        public n u0(int i10, int i11) {
            Notification notification = this.U;
            notification.icon = i10;
            notification.iconLevel = i11;
            return this;
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public int v() {
            return this.R;
        }

        @NonNull
        @w0(23)
        public n v0(@NonNull IconCompat iconCompat) {
            this.W = iconCompat.N(this.f47355a);
            return this;
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews w() {
            return this.K;
        }

        @NonNull
        public n w0(@androidx.annotation.p0 String str) {
            this.f47380z = str;
            return this;
        }

        @NonNull
        @Deprecated
        public Notification x() {
            return h();
        }

        @NonNull
        public n x0(@androidx.annotation.p0 Uri uri) {
            Notification notification = this.U;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder builderE = a.e(a.c(a.b(), 4), 5);
            this.U.audioAttributes = a.a(builderE);
            return this;
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public int y() {
            return this.f47367m;
        }

        @NonNull
        public n y0(@androidx.annotation.p0 Uri uri, int i10) {
            Notification notification = this.U;
            notification.sound = uri;
            notification.audioStreamType = i10;
            AudioAttributes.Builder builderD = a.d(a.c(a.b(), 4), i10);
            this.U.audioAttributes = a.a(builderD);
            return this;
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public long z() {
            if (this.f47368n) {
                return this.U.when;
            }
            return 0L;
        }

        @NonNull
        public n z0(@androidx.annotation.p0 y yVar) {
            if (this.f47371q != yVar) {
                this.f47371q = yVar;
                if (yVar != null) {
                    yVar.z(this);
                }
            }
            return this;
        }

        public n(@NonNull Context context, @NonNull String str) {
            this.f47356b = new ArrayList<>();
            this.f47357c = new ArrayList<>();
            this.f47358d = new ArrayList<>();
            this.f47368n = true;
            this.A = false;
            this.F = 0;
            this.G = 0;
            this.M = 0;
            this.Q = 0;
            this.R = 0;
            Notification notification = new Notification();
            this.U = notification;
            this.f47355a = context;
            this.L = str;
            notification.when = System.currentTimeMillis();
            this.U.audioStreamType = -1;
            this.f47367m = 0;
            this.X = new ArrayList<>();
            this.S = true;
        }

        @Deprecated
        public n(@NonNull Context context) {
            this(context, (String) null);
        }
    }
}
