package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import androidx.annotation.NonNull;
import androidx.annotation.w0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f47190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    CharSequence f47191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f47192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f47193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<u> f47194e;

    @w0(26)
    static class a {
        private a() {
        }

        static NotificationChannelGroup a(String str, CharSequence charSequence) {
            return new NotificationChannelGroup(str, charSequence);
        }

        static List<NotificationChannel> b(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getChannels();
        }

        static String c(NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }

        static String d(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        static CharSequence e(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getName();
        }
    }

    @w0(28)
    static class b {
        private b() {
        }

        static String a(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getDescription();
        }

        static boolean b(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.isBlocked();
        }

        static void c(NotificationChannelGroup notificationChannelGroup, String str) {
            notificationChannelGroup.setDescription(str);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final v f47195a;

        public c(@NonNull String str) {
            this.f47195a = new v(str);
        }

        @NonNull
        public v a() {
            return this.f47195a;
        }

        @NonNull
        public c b(@androidx.annotation.p0 String str) {
            this.f47195a.f47192c = str;
            return this;
        }

        @NonNull
        public c c(@androidx.annotation.p0 CharSequence charSequence) {
            this.f47195a.f47191b = charSequence;
            return this;
        }
    }

    v(@NonNull String str) {
        this.f47194e = Collections.EMPTY_LIST;
        this.f47190a = (String) androidx.core.util.t.l(str);
    }

    @w0(26)
    private List<u> b(List<NotificationChannel> list) {
        ArrayList arrayList = new ArrayList();
        for (NotificationChannel notificationChannel : list) {
            if (this.f47190a.equals(a.c(notificationChannel))) {
                arrayList.add(new u(notificationChannel));
            }
        }
        return arrayList;
    }

    @NonNull
    public List<u> a() {
        return this.f47194e;
    }

    @androidx.annotation.p0
    public String c() {
        return this.f47192c;
    }

    @NonNull
    public String d() {
        return this.f47190a;
    }

    @androidx.annotation.p0
    public CharSequence e() {
        return this.f47191b;
    }

    NotificationChannelGroup f() {
        NotificationChannelGroup notificationChannelGroupA = a.a(this.f47190a, this.f47191b);
        b.c(notificationChannelGroupA, this.f47192c);
        return notificationChannelGroupA;
    }

    public boolean g() {
        return this.f47193d;
    }

    @NonNull
    public c h() {
        return new c(this.f47190a).c(this.f47191b).b(this.f47192c);
    }

    @w0(28)
    v(@NonNull NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, Collections.EMPTY_LIST);
    }

    @w0(26)
    v(@NonNull NotificationChannelGroup notificationChannelGroup, @NonNull List<NotificationChannel> list) {
        this(a.d(notificationChannelGroup));
        this.f47191b = a.e(notificationChannelGroup);
        this.f47192c = b.a(notificationChannelGroup);
        this.f47193d = b.b(notificationChannelGroup);
        this.f47194e = b(a.b(notificationChannelGroup));
    }
}
