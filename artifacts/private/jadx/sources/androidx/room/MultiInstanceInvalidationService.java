package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@z
public final class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f74612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<Integer, String> f74613b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final RemoteCallbackList<e0> f74614c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final f0.b f74615d = new a();

    public static final class a extends f0.b {
        a() {
        }

        @Override // androidx.room.f0
        public void Nb(int i10, @NotNull String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            RemoteCallbackList<e0> remoteCallbackListA = MultiInstanceInvalidationService.this.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (remoteCallbackListA) {
                try {
                    String str = multiInstanceInvalidationService.b().get(Integer.valueOf(i10));
                    if (str == null) {
                        return;
                    }
                    int iBeginBroadcast = multiInstanceInvalidationService.a().beginBroadcast();
                    for (int i11 = 0; i11 < iBeginBroadcast; i11++) {
                        try {
                            Object broadcastCookie = multiInstanceInvalidationService.a().getBroadcastCookie(i11);
                            Intrinsics.checkNotNull(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                            Integer num = (Integer) broadcastCookie;
                            int iIntValue = num.intValue();
                            String str2 = multiInstanceInvalidationService.b().get(num);
                            if (i10 != iIntValue && Intrinsics.areEqual(str, str2)) {
                                try {
                                    ((e0) multiInstanceInvalidationService.a().getBroadcastItem(i11)).p2(tables);
                                } catch (RemoteException unused) {
                                }
                            }
                        } catch (Throwable th2) {
                            multiInstanceInvalidationService.a().finishBroadcast();
                            throw th2;
                        }
                    }
                    multiInstanceInvalidationService.a().finishBroadcast();
                    Unit unit = Unit.f312394a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // androidx.room.f0
        public int Xc(@NotNull e0 callback, @Nullable String str) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            int i10 = 0;
            if (str == null) {
                return 0;
            }
            RemoteCallbackList<e0> remoteCallbackListA = MultiInstanceInvalidationService.this.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (remoteCallbackListA) {
                try {
                    multiInstanceInvalidationService.d(multiInstanceInvalidationService.c() + 1);
                    int iC = multiInstanceInvalidationService.c();
                    if (multiInstanceInvalidationService.a().register(callback, Integer.valueOf(iC))) {
                        multiInstanceInvalidationService.b().put(Integer.valueOf(iC), str);
                        i10 = iC;
                    } else {
                        multiInstanceInvalidationService.d(multiInstanceInvalidationService.c() - 1);
                        multiInstanceInvalidationService.c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return i10;
        }

        @Override // androidx.room.f0
        public void lf(@NotNull e0 callback, int i10) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            RemoteCallbackList<e0> remoteCallbackListA = MultiInstanceInvalidationService.this.a();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (remoteCallbackListA) {
                try {
                    multiInstanceInvalidationService.a().unregister(callback);
                    multiInstanceInvalidationService.b().remove(Integer.valueOf(i10));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static final class b extends RemoteCallbackList<e0> {
        b() {
        }

        @Override // android.os.RemoteCallbackList
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(@NotNull e0 callback, @NotNull Object cookie) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(cookie, "cookie");
            MultiInstanceInvalidationService.this.b().remove((Integer) cookie);
        }
    }

    @NotNull
    public final RemoteCallbackList<e0> a() {
        return this.f74614c;
    }

    @NotNull
    public final Map<Integer, String> b() {
        return this.f74613b;
    }

    public final int c() {
        return this.f74612a;
    }

    public final void d(int i10) {
        this.f74612a = i10;
    }

    @Override // android.app.Service
    @NotNull
    public IBinder onBind(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return this.f74615d;
    }
}
