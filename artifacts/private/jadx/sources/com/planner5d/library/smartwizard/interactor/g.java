package com.planner5d.library.smartwizard.interactor;

import android.app.Application;
import com.devtodev.core.data.metrics.MetricConsts;
import com.planner5d.library.database.model.RoomStyle;
import com.planner5d.library.model.manager.o1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements ce.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f229953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final o1 f229954b;

    @ij.a
    public g(@NotNull Application application, @NotNull o1 languageManager) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(languageManager, "languageManager");
        this.f229953a = application;
        this.f229954b = languageManager;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // ce.c
    @Nullable
    public Object a(@NotNull RoomStyle roomStyle, @NotNull kotlin.coroutines.d<? super String> dVar) {
        String strA = this.f229954b.a(this.f229953a);
        int iHashCode = strA.hashCode();
        if (iHashCode != 3121) {
            if (iHashCode != 3201) {
                if (iHashCode == 3241) {
                    if (strA.equals("en")) {
                        return roomStyle.z();
                    }
                } else if (iHashCode != 3246) {
                    if (iHashCode != 3276) {
                        if (iHashCode == 3371) {
                            if (strA.equals(MetricConsts.Install)) {
                                return roomStyle.C();
                            }
                        } else if (iHashCode == 3398) {
                            if (strA.equals("jp")) {
                                return roomStyle.D();
                            }
                        } else if (iHashCode != 3588) {
                            if (iHashCode != 3651) {
                                switch (iHashCode) {
                                    case -325339409:
                                        if (strA.equals("zh_hans")) {
                                            return roomStyle.G();
                                        }
                                        break;
                                    case -325339408:
                                        if (strA.equals("zh_hant")) {
                                            return roomStyle.H();
                                        }
                                        break;
                                }
                            } else if (strA.equals("ru")) {
                                return roomStyle.F();
                            }
                        } else if (strA.equals("pt")) {
                            return roomStyle.E();
                        }
                    } else if (strA.equals("fr")) {
                        return roomStyle.B();
                    }
                } else if (strA.equals("es")) {
                    return roomStyle.A();
                }
            } else if (strA.equals("de")) {
                return roomStyle.y();
            }
        } else if (strA.equals("ar")) {
            return roomStyle.x();
        }
        return roomStyle.z();
    }
}
