package androidx.work.impl.model;

import android.database.Cursor;
import androidx.lifecycle.w0;
import androidx.room.b2;
import androidx.room.f2;
import androidx.work.l0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b2 f76949a;

    class a implements Callable<List<v.c>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w3.g f76950a;

        a(final w3.g val$_internalQuery) {
            this.f76950a = val$_internalQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<v.c> call() throws Exception {
            l0.c cVarF;
            androidx.work.h hVarM;
            androidx.work.a aVarC;
            int i10;
            int i11;
            int i12;
            int i13;
            long j10;
            int i14;
            int i15;
            int i16;
            int i17;
            androidx.work.w wVarD;
            int i18;
            boolean z10;
            int i19;
            boolean z11;
            int i20;
            boolean z12;
            int i21;
            boolean z13;
            long j11;
            int i22;
            Set<androidx.work.e.c> setB;
            Cursor cursorF = androidx.room.util.b.f(i.this.f76949a, this.f76950a, true, null);
            try {
                int iD = androidx.room.util.a.d(cursorF, "id");
                int iD2 = androidx.room.util.a.d(cursorF, "state");
                int iD3 = androidx.room.util.a.d(cursorF, "output");
                int iD4 = androidx.room.util.a.d(cursorF, "initial_delay");
                int iD5 = androidx.room.util.a.d(cursorF, "interval_duration");
                int iD6 = androidx.room.util.a.d(cursorF, "flex_duration");
                int iD7 = androidx.room.util.a.d(cursorF, "run_attempt_count");
                int iD8 = androidx.room.util.a.d(cursorF, "backoff_policy");
                int iD9 = androidx.room.util.a.d(cursorF, "backoff_delay_duration");
                int iD10 = androidx.room.util.a.d(cursorF, "last_enqueue_time");
                int iD11 = androidx.room.util.a.d(cursorF, "period_count");
                int iD12 = androidx.room.util.a.d(cursorF, "generation");
                int iD13 = androidx.room.util.a.d(cursorF, "next_schedule_time_override");
                int iD14 = androidx.room.util.a.d(cursorF, androidx.media3.exoplayer.offline.u.Z);
                int iD15 = androidx.room.util.a.d(cursorF, "required_network_type");
                int iD16 = androidx.room.util.a.d(cursorF, "requires_charging");
                int iD17 = androidx.room.util.a.d(cursorF, "requires_device_idle");
                int iD18 = androidx.room.util.a.d(cursorF, "requires_battery_not_low");
                int iD19 = androidx.room.util.a.d(cursorF, "requires_storage_not_low");
                int iD20 = androidx.room.util.a.d(cursorF, "trigger_content_update_delay");
                int iD21 = androidx.room.util.a.d(cursorF, "trigger_max_content_delay");
                int iD22 = androidx.room.util.a.d(cursorF, "content_uri_triggers");
                HashMap map = new HashMap();
                int i23 = iD13;
                HashMap map2 = new HashMap();
                while (cursorF.moveToNext()) {
                    int i24 = iD12;
                    String string = cursorF.getString(iD);
                    if (((ArrayList) map.get(string)) == null) {
                        map.put(string, new ArrayList());
                    }
                    String string2 = cursorF.getString(iD);
                    if (((ArrayList) map2.get(string2)) == null) {
                        map2.put(string2, new ArrayList());
                    }
                    iD12 = i24;
                    iD11 = iD11;
                }
                int i25 = iD11;
                int i26 = iD12;
                int i27 = -1;
                cursorF.moveToPosition(-1);
                i.this.e(map);
                i.this.d(map2);
                ArrayList arrayList = new ArrayList(cursorF.getCount());
                while (cursorF.moveToNext()) {
                    String string3 = (iD == i27 || cursorF.isNull(iD)) ? null : cursorF.getString(iD);
                    if (iD2 == i27) {
                        cVarF = null;
                    } else {
                        int i28 = cursorF.getInt(iD2);
                        d0 d0Var = d0.f76918a;
                        cVarF = d0.f(i28);
                    }
                    if (iD3 == i27) {
                        hVarM = null;
                    } else {
                        hVarM = androidx.work.h.m(cursorF.isNull(iD3) ? null : cursorF.getBlob(iD3));
                    }
                    long j12 = iD4 == i27 ? 0L : cursorF.getLong(iD4);
                    long j13 = iD5 == i27 ? 0L : cursorF.getLong(iD5);
                    long j14 = iD6 == i27 ? 0L : cursorF.getLong(iD6);
                    int i29 = iD7 == i27 ? 0 : cursorF.getInt(iD7);
                    if (iD8 == i27) {
                        aVarC = null;
                    } else {
                        int i30 = cursorF.getInt(iD8);
                        d0 d0Var2 = d0.f76918a;
                        aVarC = d0.c(i30);
                    }
                    long j15 = iD9 == i27 ? 0L : cursorF.getLong(iD9);
                    long j16 = iD10 == i27 ? 0L : cursorF.getLong(iD10);
                    int i31 = i25;
                    if (i31 == i27) {
                        i10 = i26;
                        i11 = 0;
                    } else {
                        i10 = i26;
                        i11 = cursorF.getInt(i31);
                    }
                    if (i10 == i27) {
                        i12 = i23;
                        i13 = 0;
                    } else {
                        int i32 = cursorF.getInt(i10);
                        i12 = i23;
                        i13 = i32;
                    }
                    if (i12 == i27) {
                        i14 = iD14;
                        j10 = 0;
                    } else {
                        j10 = cursorF.getLong(i12);
                        i14 = iD14;
                    }
                    if (i14 == i27) {
                        i15 = iD15;
                        i16 = 0;
                    } else {
                        int i33 = cursorF.getInt(i14);
                        i15 = iD15;
                        i16 = i33;
                    }
                    if (i15 == i27) {
                        i17 = iD16;
                        wVarD = null;
                    } else {
                        int i34 = cursorF.getInt(i15);
                        d0 d0Var3 = d0.f76918a;
                        i17 = iD16;
                        wVarD = d0.d(i34);
                    }
                    if (i17 == i27) {
                        i18 = iD17;
                        z10 = false;
                    } else {
                        boolean z14 = cursorF.getInt(i17) != 0;
                        i18 = iD17;
                        z10 = z14;
                    }
                    if (i18 == i27) {
                        i19 = iD18;
                        z11 = false;
                    } else {
                        boolean z15 = cursorF.getInt(i18) != 0;
                        i19 = iD18;
                        z11 = z15;
                    }
                    if (i19 == i27) {
                        i20 = iD19;
                        z12 = false;
                    } else {
                        boolean z16 = cursorF.getInt(i19) != 0;
                        i20 = iD19;
                        z12 = z16;
                    }
                    if (i20 == i27) {
                        i21 = iD20;
                        z13 = false;
                    } else {
                        boolean z17 = cursorF.getInt(i20) != 0;
                        i21 = iD20;
                        z13 = z17;
                    }
                    if (i21 == i27) {
                        i22 = iD21;
                        j11 = 0;
                    } else {
                        j11 = cursorF.getLong(i21);
                        i22 = iD21;
                    }
                    int i35 = iD22;
                    int i36 = i22;
                    long j17 = i22 != i27 ? cursorF.getLong(i22) : 0L;
                    if (i35 == i27) {
                        setB = null;
                    } else {
                        byte[] blob = cursorF.isNull(i35) ? null : cursorF.getBlob(i35);
                        d0 d0Var4 = d0.f76918a;
                        setB = d0.b(blob);
                    }
                    androidx.work.e eVar = new androidx.work.e(wVarD, z10, z11, z12, z13, j11, j17, setB);
                    ArrayList arrayList2 = (ArrayList) map.get(cursorF.getString(iD));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    HashMap map3 = map;
                    ArrayList arrayList3 = (ArrayList) map2.get(cursorF.getString(iD));
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList.add(new v.c(string3, cVarF, hVarM, j12, j13, j14, eVar, i29, aVarC, j15, j16, i11, i13, j10, i16, arrayList2, arrayList3));
                    iD22 = i35;
                    iD2 = iD2;
                    i26 = i10;
                    i23 = i12;
                    iD14 = i14;
                    iD15 = i15;
                    iD16 = i17;
                    iD17 = i18;
                    iD18 = i19;
                    iD19 = i20;
                    iD20 = i21;
                    iD21 = i36;
                    i25 = i31;
                    map = map3;
                    i27 = -1;
                }
                return arrayList;
            } finally {
                cursorF.close();
            }
        }
    }

    class b implements Callable<List<v.c>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w3.g f76952a;

        b(final w3.g val$_internalQuery) {
            this.f76952a = val$_internalQuery;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<v.c> call() throws Exception {
            l0.c cVarF;
            androidx.work.h hVarM;
            androidx.work.a aVarC;
            int i10;
            int i11;
            int i12;
            int i13;
            long j10;
            int i14;
            int i15;
            int i16;
            int i17;
            androidx.work.w wVarD;
            int i18;
            boolean z10;
            int i19;
            boolean z11;
            int i20;
            boolean z12;
            int i21;
            boolean z13;
            long j11;
            int i22;
            Set<androidx.work.e.c> setB;
            Cursor cursorF = androidx.room.util.b.f(i.this.f76949a, this.f76952a, true, null);
            try {
                int iD = androidx.room.util.a.d(cursorF, "id");
                int iD2 = androidx.room.util.a.d(cursorF, "state");
                int iD3 = androidx.room.util.a.d(cursorF, "output");
                int iD4 = androidx.room.util.a.d(cursorF, "initial_delay");
                int iD5 = androidx.room.util.a.d(cursorF, "interval_duration");
                int iD6 = androidx.room.util.a.d(cursorF, "flex_duration");
                int iD7 = androidx.room.util.a.d(cursorF, "run_attempt_count");
                int iD8 = androidx.room.util.a.d(cursorF, "backoff_policy");
                int iD9 = androidx.room.util.a.d(cursorF, "backoff_delay_duration");
                int iD10 = androidx.room.util.a.d(cursorF, "last_enqueue_time");
                int iD11 = androidx.room.util.a.d(cursorF, "period_count");
                int iD12 = androidx.room.util.a.d(cursorF, "generation");
                int iD13 = androidx.room.util.a.d(cursorF, "next_schedule_time_override");
                int iD14 = androidx.room.util.a.d(cursorF, androidx.media3.exoplayer.offline.u.Z);
                int iD15 = androidx.room.util.a.d(cursorF, "required_network_type");
                int iD16 = androidx.room.util.a.d(cursorF, "requires_charging");
                int iD17 = androidx.room.util.a.d(cursorF, "requires_device_idle");
                int iD18 = androidx.room.util.a.d(cursorF, "requires_battery_not_low");
                int iD19 = androidx.room.util.a.d(cursorF, "requires_storage_not_low");
                int iD20 = androidx.room.util.a.d(cursorF, "trigger_content_update_delay");
                int iD21 = androidx.room.util.a.d(cursorF, "trigger_max_content_delay");
                int iD22 = androidx.room.util.a.d(cursorF, "content_uri_triggers");
                HashMap map = new HashMap();
                int i23 = iD13;
                HashMap map2 = new HashMap();
                while (cursorF.moveToNext()) {
                    int i24 = iD12;
                    String string = cursorF.getString(iD);
                    if (((ArrayList) map.get(string)) == null) {
                        map.put(string, new ArrayList());
                    }
                    String string2 = cursorF.getString(iD);
                    if (((ArrayList) map2.get(string2)) == null) {
                        map2.put(string2, new ArrayList());
                    }
                    iD12 = i24;
                    iD11 = iD11;
                }
                int i25 = iD11;
                int i26 = iD12;
                int i27 = -1;
                cursorF.moveToPosition(-1);
                i.this.e(map);
                i.this.d(map2);
                ArrayList arrayList = new ArrayList(cursorF.getCount());
                while (cursorF.moveToNext()) {
                    String string3 = (iD == i27 || cursorF.isNull(iD)) ? null : cursorF.getString(iD);
                    if (iD2 == i27) {
                        cVarF = null;
                    } else {
                        int i28 = cursorF.getInt(iD2);
                        d0 d0Var = d0.f76918a;
                        cVarF = d0.f(i28);
                    }
                    if (iD3 == i27) {
                        hVarM = null;
                    } else {
                        hVarM = androidx.work.h.m(cursorF.isNull(iD3) ? null : cursorF.getBlob(iD3));
                    }
                    long j12 = iD4 == i27 ? 0L : cursorF.getLong(iD4);
                    long j13 = iD5 == i27 ? 0L : cursorF.getLong(iD5);
                    long j14 = iD6 == i27 ? 0L : cursorF.getLong(iD6);
                    int i29 = iD7 == i27 ? 0 : cursorF.getInt(iD7);
                    if (iD8 == i27) {
                        aVarC = null;
                    } else {
                        int i30 = cursorF.getInt(iD8);
                        d0 d0Var2 = d0.f76918a;
                        aVarC = d0.c(i30);
                    }
                    long j15 = iD9 == i27 ? 0L : cursorF.getLong(iD9);
                    long j16 = iD10 == i27 ? 0L : cursorF.getLong(iD10);
                    int i31 = i25;
                    if (i31 == i27) {
                        i10 = i26;
                        i11 = 0;
                    } else {
                        i10 = i26;
                        i11 = cursorF.getInt(i31);
                    }
                    if (i10 == i27) {
                        i12 = i23;
                        i13 = 0;
                    } else {
                        int i32 = cursorF.getInt(i10);
                        i12 = i23;
                        i13 = i32;
                    }
                    if (i12 == i27) {
                        i14 = iD14;
                        j10 = 0;
                    } else {
                        j10 = cursorF.getLong(i12);
                        i14 = iD14;
                    }
                    if (i14 == i27) {
                        i15 = iD15;
                        i16 = 0;
                    } else {
                        int i33 = cursorF.getInt(i14);
                        i15 = iD15;
                        i16 = i33;
                    }
                    if (i15 == i27) {
                        i17 = iD16;
                        wVarD = null;
                    } else {
                        int i34 = cursorF.getInt(i15);
                        d0 d0Var3 = d0.f76918a;
                        i17 = iD16;
                        wVarD = d0.d(i34);
                    }
                    if (i17 == i27) {
                        i18 = iD17;
                        z10 = false;
                    } else {
                        boolean z14 = cursorF.getInt(i17) != 0;
                        i18 = iD17;
                        z10 = z14;
                    }
                    if (i18 == i27) {
                        i19 = iD18;
                        z11 = false;
                    } else {
                        boolean z15 = cursorF.getInt(i18) != 0;
                        i19 = iD18;
                        z11 = z15;
                    }
                    if (i19 == i27) {
                        i20 = iD19;
                        z12 = false;
                    } else {
                        boolean z16 = cursorF.getInt(i19) != 0;
                        i20 = iD19;
                        z12 = z16;
                    }
                    if (i20 == i27) {
                        i21 = iD20;
                        z13 = false;
                    } else {
                        boolean z17 = cursorF.getInt(i20) != 0;
                        i21 = iD20;
                        z13 = z17;
                    }
                    if (i21 == i27) {
                        i22 = iD21;
                        j11 = 0;
                    } else {
                        j11 = cursorF.getLong(i21);
                        i22 = iD21;
                    }
                    int i35 = iD22;
                    int i36 = i22;
                    long j17 = i22 != i27 ? cursorF.getLong(i22) : 0L;
                    if (i35 == i27) {
                        setB = null;
                    } else {
                        byte[] blob = cursorF.isNull(i35) ? null : cursorF.getBlob(i35);
                        d0 d0Var4 = d0.f76918a;
                        setB = d0.b(blob);
                    }
                    androidx.work.e eVar = new androidx.work.e(wVarD, z10, z11, z12, z13, j11, j17, setB);
                    ArrayList arrayList2 = (ArrayList) map.get(cursorF.getString(iD));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    HashMap map3 = map;
                    ArrayList arrayList3 = (ArrayList) map2.get(cursorF.getString(iD));
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList.add(new v.c(string3, cVarF, hVarM, j12, j13, j14, eVar, i29, aVarC, j15, j16, i11, i13, j10, i16, arrayList2, arrayList3));
                    iD22 = i35;
                    iD2 = iD2;
                    i26 = i10;
                    i23 = i12;
                    iD14 = i14;
                    iD15 = i15;
                    iD16 = i17;
                    iD17 = i18;
                    iD18 = i19;
                    iD19 = i20;
                    iD20 = i21;
                    iD21 = i36;
                    i25 = i31;
                    map = map3;
                    i27 = -1;
                }
                return arrayList;
            } finally {
                cursorF.close();
            }
        }
    }

    public i(b2 __db) {
        this.f76949a = __db;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final HashMap<String, ArrayList<androidx.work.h>> _map) {
        int i10;
        Set<String> setKeySet = _map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (_map.size() > 999) {
            HashMap<String, ArrayList<androidx.work.h>> map = new HashMap<>(999);
            Iterator<String> it = setKeySet.iterator();
            loop0: while (true) {
                i10 = 0;
                do {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    String next = it.next();
                    map.put(next, _map.get(next));
                    i10++;
                } while (i10 != 999);
                d(map);
                map = new HashMap<>(999);
            }
            if (i10 > 0) {
                d(map);
                return;
            }
            return;
        }
        StringBuilder sbD = androidx.room.util.f.d();
        sbD.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        androidx.room.util.f.a(sbD, size);
        sbD.append(")");
        f2 f2VarD = f2.d(sbD.toString(), size);
        int i11 = 1;
        for (String str : setKeySet) {
            if (str == null) {
                f2VarD.J7(i11);
            } else {
                f2VarD.H5(i11, str);
            }
            i11++;
        }
        Cursor cursorF = androidx.room.util.b.f(this.f76949a, f2VarD, false, null);
        try {
            int iD = androidx.room.util.a.d(cursorF, "work_spec_id");
            if (iD == -1) {
                cursorF.close();
                return;
            }
            while (cursorF.moveToNext()) {
                ArrayList<androidx.work.h> arrayList = _map.get(cursorF.getString(iD));
                if (arrayList != null) {
                    arrayList.add(androidx.work.h.m(cursorF.isNull(0) ? null : cursorF.getBlob(0)));
                }
            }
            cursorF.close();
        } catch (Throwable th2) {
            cursorF.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final HashMap<String, ArrayList<String>> _map) {
        int i10;
        Set<String> setKeySet = _map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (_map.size() > 999) {
            HashMap<String, ArrayList<String>> map = new HashMap<>(999);
            Iterator<String> it = setKeySet.iterator();
            loop0: while (true) {
                i10 = 0;
                do {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    String next = it.next();
                    map.put(next, _map.get(next));
                    i10++;
                } while (i10 != 999);
                e(map);
                map = new HashMap<>(999);
            }
            if (i10 > 0) {
                e(map);
                return;
            }
            return;
        }
        StringBuilder sbD = androidx.room.util.f.d();
        sbD.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        androidx.room.util.f.a(sbD, size);
        sbD.append(")");
        f2 f2VarD = f2.d(sbD.toString(), size);
        int i11 = 1;
        boolean z10 = !false;
        for (String str : setKeySet) {
            if (str == null) {
                f2VarD.J7(i11);
            } else {
                f2VarD.H5(i11, str);
            }
            i11++;
        }
        Cursor cursorF = androidx.room.util.b.f(this.f76949a, f2VarD, false, null);
        try {
            int iD = androidx.room.util.a.d(cursorF, "work_spec_id");
            if (iD == -1) {
                return;
            }
            while (cursorF.moveToNext()) {
                ArrayList<String> arrayList = _map.get(cursorF.getString(iD));
                if (arrayList != null) {
                    arrayList.add(cursorF.isNull(0) ? null : cursorF.getString(0));
                }
            }
        } finally {
            cursorF.close();
        }
    }

    public static List<Class<?>> i() {
        return Collections.EMPTY_LIST;
    }

    @Override // androidx.work.impl.model.g
    public List<v.c> a(final w3.g query) {
        l0.c cVarF;
        androidx.work.h hVarM;
        androidx.work.a aVarC;
        int i10;
        int i11;
        int i12;
        int i13;
        androidx.work.w wVarD;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Set<androidx.work.e.c> setB;
        this.f76949a.assertNotSuspendingTransaction();
        Cursor cursorF = androidx.room.util.b.f(this.f76949a, query, true, null);
        try {
            int iD = androidx.room.util.a.d(cursorF, "id");
            int iD2 = androidx.room.util.a.d(cursorF, "state");
            int iD3 = androidx.room.util.a.d(cursorF, "output");
            int iD4 = androidx.room.util.a.d(cursorF, "initial_delay");
            int iD5 = androidx.room.util.a.d(cursorF, "interval_duration");
            int iD6 = androidx.room.util.a.d(cursorF, "flex_duration");
            int iD7 = androidx.room.util.a.d(cursorF, "run_attempt_count");
            int iD8 = androidx.room.util.a.d(cursorF, "backoff_policy");
            int iD9 = androidx.room.util.a.d(cursorF, "backoff_delay_duration");
            int iD10 = androidx.room.util.a.d(cursorF, "last_enqueue_time");
            int iD11 = androidx.room.util.a.d(cursorF, "period_count");
            int iD12 = androidx.room.util.a.d(cursorF, "generation");
            int iD13 = androidx.room.util.a.d(cursorF, "next_schedule_time_override");
            int iD14 = androidx.room.util.a.d(cursorF, androidx.media3.exoplayer.offline.u.Z);
            int iD15 = androidx.room.util.a.d(cursorF, "required_network_type");
            int iD16 = androidx.room.util.a.d(cursorF, "requires_charging");
            int iD17 = androidx.room.util.a.d(cursorF, "requires_device_idle");
            int iD18 = androidx.room.util.a.d(cursorF, "requires_battery_not_low");
            int iD19 = androidx.room.util.a.d(cursorF, "requires_storage_not_low");
            int iD20 = androidx.room.util.a.d(cursorF, "trigger_content_update_delay");
            int iD21 = androidx.room.util.a.d(cursorF, "trigger_max_content_delay");
            int iD22 = androidx.room.util.a.d(cursorF, "content_uri_triggers");
            HashMap<String, ArrayList<String>> map = new HashMap<>();
            int i14 = iD13;
            HashMap<String, ArrayList<androidx.work.h>> map2 = new HashMap<>();
            while (cursorF.moveToNext()) {
                int i15 = iD12;
                String string = cursorF.getString(iD);
                if (map.get(string) == null) {
                    map.put(string, new ArrayList<>());
                }
                String string2 = cursorF.getString(iD);
                if (map2.get(string2) == null) {
                    map2.put(string2, new ArrayList<>());
                }
                iD12 = i15;
                iD11 = iD11;
            }
            int i16 = iD11;
            int i17 = iD12;
            int i18 = -1;
            cursorF.moveToPosition(-1);
            e(map);
            d(map2);
            ArrayList arrayList = new ArrayList(cursorF.getCount());
            while (cursorF.moveToNext()) {
                String string3 = (iD == i18 || cursorF.isNull(iD)) ? null : cursorF.getString(iD);
                if (iD2 == i18) {
                    cVarF = null;
                } else {
                    int i19 = cursorF.getInt(iD2);
                    d0 d0Var = d0.f76918a;
                    cVarF = d0.f(i19);
                }
                if (iD3 == i18) {
                    hVarM = null;
                } else {
                    hVarM = androidx.work.h.m(cursorF.isNull(iD3) ? null : cursorF.getBlob(iD3));
                }
                long j10 = iD4 == i18 ? 0L : cursorF.getLong(iD4);
                long j11 = iD5 == i18 ? 0L : cursorF.getLong(iD5);
                long j12 = iD6 == i18 ? 0L : cursorF.getLong(iD6);
                int i20 = iD7 == i18 ? 0 : cursorF.getInt(iD7);
                if (iD8 == i18) {
                    aVarC = null;
                } else {
                    int i21 = cursorF.getInt(iD8);
                    d0 d0Var2 = d0.f76918a;
                    aVarC = d0.c(i21);
                }
                long j13 = iD9 == i18 ? 0L : cursorF.getLong(iD9);
                long j14 = iD10 == i18 ? 0L : cursorF.getLong(iD10);
                int i22 = i16;
                if (i22 == i18) {
                    i10 = i17;
                    i11 = 0;
                } else {
                    i10 = i17;
                    i11 = cursorF.getInt(i22);
                }
                if (i10 == i18) {
                    i12 = i14;
                    i13 = 0;
                } else {
                    int i23 = cursorF.getInt(i10);
                    i12 = i14;
                    i13 = i23;
                }
                long j15 = i12 == i18 ? 0L : cursorF.getLong(i12);
                int i24 = i12;
                int i25 = iD14;
                int i26 = i25 == i18 ? 0 : cursorF.getInt(i25);
                iD14 = i25;
                int i27 = iD15;
                if (i27 == i18) {
                    wVarD = null;
                } else {
                    int i28 = cursorF.getInt(i27);
                    d0 d0Var3 = d0.f76918a;
                    wVarD = d0.d(i28);
                }
                iD15 = i27;
                int i29 = iD16;
                if (i29 == i18) {
                    z10 = false;
                } else {
                    z10 = cursorF.getInt(i29) != 0;
                }
                iD16 = i29;
                int i30 = iD17;
                if (i30 == i18) {
                    z11 = false;
                } else {
                    z11 = cursorF.getInt(i30) != 0;
                }
                iD17 = i30;
                int i31 = iD18;
                if (i31 == i18) {
                    z12 = false;
                } else {
                    z12 = cursorF.getInt(i31) != 0;
                }
                iD18 = i31;
                int i32 = iD19;
                if (i32 == i18) {
                    z13 = false;
                } else {
                    z13 = cursorF.getInt(i32) != 0;
                }
                iD19 = i32;
                int i33 = iD20;
                long j16 = i33 == i18 ? 0L : cursorF.getLong(i33);
                iD20 = i33;
                int i34 = iD21;
                long j17 = i34 != i18 ? cursorF.getLong(i34) : 0L;
                iD21 = i34;
                int i35 = iD22;
                long j18 = j17;
                if (i35 == i18) {
                    setB = null;
                } else {
                    byte[] blob = cursorF.isNull(i35) ? null : cursorF.getBlob(i35);
                    d0 d0Var4 = d0.f76918a;
                    setB = d0.b(blob);
                }
                androidx.work.e eVar = new androidx.work.e(wVarD, z10, z11, z12, z13, j16, j18, setB);
                ArrayList<String> arrayList2 = map.get(cursorF.getString(iD));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                }
                HashMap<String, ArrayList<String>> map3 = map;
                ArrayList<androidx.work.h> arrayList3 = map2.get(cursorF.getString(iD));
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList<>();
                }
                arrayList.add(new v.c(string3, cVarF, hVarM, j10, j11, j12, eVar, i20, aVarC, j13, j14, i11, i13, j15, i26, arrayList2, arrayList3));
                iD22 = i35;
                iD2 = iD2;
                map = map3;
                i18 = -1;
                i17 = i10;
                i14 = i24;
                i16 = i22;
            }
            return arrayList;
        } finally {
            cursorF.close();
        }
    }

    @Override // androidx.work.impl.model.g
    public kotlinx.coroutines.flow.i<List<v.c>> b(final w3.g query) {
        return androidx.room.j.a(this.f76949a, false, new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, new b(query));
    }

    @Override // androidx.work.impl.model.g
    public w0<List<v.c>> c(final w3.g query) {
        return this.f76949a.getInvalidationTracker().f(new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, false, new a(query));
    }
}
