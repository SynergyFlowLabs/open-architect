package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.devtodev.analytics.internal.storage.sqlite.EventEntry;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class e extends be {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f109897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Set f109898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f109899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Long f109900g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f109901h;

    e(qe qeVar) {
        super(qeVar);
    }

    private final hf n(Integer num) {
        if (this.f109899f.containsKey(num)) {
            return (hf) this.f109899f.get(num);
        }
        hf hfVar = new hf(this, this.f109897d, null);
        this.f109899f.put(num, hfVar);
        return hfVar;
    }

    private final boolean o(int i10, int i11) {
        hf hfVar = (hf) this.f109899f.get(Integer.valueOf(i10));
        if (hfVar == null) {
            return false;
        }
        return hfVar.c().get(i11);
    }

    @Override // com.google.android.gms.measurement.internal.be
    protected final boolean l() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x025f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0271  */
    /* JADX WARN: Code duplicated, block: B:107:0x027c  */
    /* JADX WARN: Code duplicated, block: B:111:0x02a8 A[Catch: all -> 0x02c3, SQLiteException -> 0x02c5, LOOP:11: B:111:0x02a8->B:522:?, LOOP_START, TryCatch #26 {all -> 0x02c3, blocks: (B:109:0x02a2, B:111:0x02a8, B:113:0x02b9, B:119:0x02c7, B:122:0x02dc, B:131:0x02eb), top: B:468:0x0298 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x02b9 A[Catch: all -> 0x02c3, SQLiteException -> 0x02c5, TryCatch #26 {all -> 0x02c3, blocks: (B:109:0x02a2, B:111:0x02a8, B:113:0x02b9, B:119:0x02c7, B:122:0x02dc, B:131:0x02eb), top: B:468:0x0298 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x02dc A[Catch: all -> 0x02c3, SQLiteException -> 0x02c5, TRY_ENTER, TRY_LEAVE, TryCatch #26 {all -> 0x02c3, blocks: (B:109:0x02a2, B:111:0x02a8, B:113:0x02b9, B:119:0x02c7, B:122:0x02dc, B:131:0x02eb), top: B:468:0x0298 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0318  */
    /* JADX WARN: Code duplicated, block: B:140:0x0326  */
    /* JADX WARN: Code duplicated, block: B:142:0x033d  */
    /* JADX WARN: Code duplicated, block: B:166:0x041c  */
    /* JADX WARN: Code duplicated, block: B:168:0x0420  */
    /* JADX WARN: Code duplicated, block: B:172:0x042d  */
    /* JADX WARN: Code duplicated, block: B:174:0x044d  */
    /* JADX WARN: Code duplicated, block: B:180:0x0464  */
    /* JADX WARN: Code duplicated, block: B:184:0x0480  */
    /* JADX WARN: Code duplicated, block: B:185:0x0489  */
    /* JADX WARN: Code duplicated, block: B:189:0x0499  */
    /* JADX WARN: Code duplicated, block: B:195:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:201:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:204:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:206:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:208:0x051d  */
    /* JADX WARN: Code duplicated, block: B:209:0x0521  */
    /* JADX WARN: Code duplicated, block: B:214:0x053b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:239:0x05de  */
    /* JADX WARN: Code duplicated, block: B:242:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:248:0x0628  */
    /* JADX WARN: Code duplicated, block: B:254:0x0669  */
    /* JADX WARN: Code duplicated, block: B:261:0x0691  */
    /* JADX WARN: Code duplicated, block: B:267:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:278:0x06d7 A[LOOP:3: B:255:0x066b->B:278:0x06d7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:279:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:296:0x0715  */
    /* JADX WARN: Code duplicated, block: B:300:0x071f  */
    /* JADX WARN: Code duplicated, block: B:302:0x0723  */
    /* JADX WARN: Code duplicated, block: B:306:0x0739  */
    /* JADX WARN: Code duplicated, block: B:312:0x076a  */
    /* JADX WARN: Code duplicated, block: B:314:0x0799 A[LOOP:5: B:310:0x0764->B:314:0x0799, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:318:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:322:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:325:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:328:0x07e3  */
    /* JADX WARN: Code duplicated, block: B:330:0x07f7  */
    /* JADX WARN: Code duplicated, block: B:334:0x0830 A[Catch: all -> 0x0861, SQLiteException -> 0x0871, LOOP:7: B:334:0x0830->B:356:0x089a, LOOP_START, PHI: r4 r8
      0x0830: PHI (r4v40 java.util.Iterator) = (r4v32 java.util.Iterator), (r4v44 java.util.Iterator) binds: [B:333:0x082e, B:356:0x089a] A[DONT_GENERATE, DONT_INLINE]
      0x0830: PHI (r8v49 java.lang.String) = (r8v46 java.lang.String), (r8v51 java.lang.String) binds: [B:333:0x082e, B:356:0x089a] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0861, blocks: (B:332:0x082a, B:334:0x0830, B:335:0x0835, B:337:0x0846, B:340:0x0858, B:346:0x086b, B:353:0x088f, B:369:0x08b8, B:350:0x0876, B:352:0x0888, B:360:0x08a5), top: B:435:0x082a }] */
    /* JADX WARN: Code duplicated, block: B:339:0x0856  */
    /* JADX WARN: Code duplicated, block: B:345:0x0867  */
    /* JADX WARN: Code duplicated, block: B:356:0x089a A[LOOP:7: B:334:0x0830->B:356:0x089a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:359:0x08a1  */
    /* JADX WARN: Code duplicated, block: B:361:0x08a7 A[PHI: r0 r13 r36
      0x08a7: PHI (r0v127 java.util.Map) = (r0v129 java.util.Map), (r0v135 java.util.Map) binds: [B:370:0x08cb, B:360:0x08a5] A[DONT_GENERATE, DONT_INLINE]
      0x08a7: PHI (r13v4 android.database.Cursor) = (r13v5 android.database.Cursor), (r13v6 android.database.Cursor) binds: [B:370:0x08cb, B:360:0x08a5] A[DONT_GENERATE, DONT_INLINE]
      0x08a7: PHI (r36v5 java.util.Iterator) = (r36v6 java.util.Iterator), (r36v10 java.util.Iterator) binds: [B:370:0x08cb, B:360:0x08a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:376:0x08d8  */
    /* JADX WARN: Code duplicated, block: B:380:0x08ea  */
    /* JADX WARN: Code duplicated, block: B:384:0x090d  */
    /* JADX WARN: Code duplicated, block: B:387:0x091e  */
    /* JADX WARN: Code duplicated, block: B:389:0x0939  */
    /* JADX WARN: Code duplicated, block: B:391:0x0947  */
    /* JADX WARN: Code duplicated, block: B:393:0x0952  */
    /* JADX WARN: Code duplicated, block: B:395:0x0981  */
    /* JADX WARN: Code duplicated, block: B:398:0x098f  */
    /* JADX WARN: Code duplicated, block: B:407:0x09dc  */
    /* JADX WARN: Code duplicated, block: B:408:0x09e5  */
    /* JADX WARN: Code duplicated, block: B:412:0x09fa A[PHI: r16 r37 r40
      0x09fa: PHI (r16v10 java.lang.String) = (r16v11 java.lang.String), (r2v26 java.lang.String) binds: [B:411:0x09f8, B:409:0x09e6] A[DONT_GENERATE, DONT_INLINE]
      0x09fa: PHI (r37v3 java.util.Map) = (r37v4 java.util.Map), (r37v6 java.util.Map) binds: [B:411:0x09f8, B:409:0x09e6] A[DONT_GENERATE, DONT_INLINE]
      0x09fa: PHI (r40v4 androidx.collection.a) = (r40v5 androidx.collection.a), (r3v32 androidx.collection.a) binds: [B:411:0x09f8, B:409:0x09e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:417:0x0a23  */
    /* JADX WARN: Code duplicated, block: B:430:0x0aad  */
    /* JADX WARN: Code duplicated, block: B:489:0x0601 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:490:0x061a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:492:0x05ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:493:0x05ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:495:0x06d2 A[EDGE_INSN: B:495:0x06d2->B:277:0x06d2 BREAK  A[LOOP:3: B:255:0x066b->B:278:0x06d7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:497:0x0759 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:498:0x074b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:502:0x07ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:503:0x07a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:507:0x0895 A[EDGE_INSN: B:507:0x0895->B:355:0x0895 BREAK  A[LOOP:7: B:334:0x0830->B:356:0x089a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:508:0x08fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:510:0x09ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:511:0x09f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:512:0x09c8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:516:0x0a7d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:518:0x0a1d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:524:0x05a1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:531:0x0470 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:533:0x045e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:536:0x04be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:0x04ac A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:550:0x0343 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x017c  */
    /* JADX WARN: Code duplicated, block: B:563:0x021e A[EDGE_INSN: B:563:0x021e->B:83:0x021e BREAK  A[LOOP:20: B:70:0x01d0->B:84:0x0224], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x01b1 A[Catch: all -> 0x01bf, SQLiteException -> 0x01c2, TRY_LEAVE, TryCatch #24 {all -> 0x01bf, blocks: (B:59:0x01ab, B:61:0x01b1, B:69:0x01cb, B:70:0x01d0, B:71:0x01da, B:72:0x01ea, B:81:0x0218, B:74:0x01f9, B:78:0x020b, B:80:0x0211, B:98:0x0248), top: B:465:0x01ab }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01cb A[Catch: all -> 0x01bf, SQLiteException -> 0x01c2, TRY_ENTER, TryCatch #24 {all -> 0x01bf, blocks: (B:59:0x01ab, B:61:0x01b1, B:69:0x01cb, B:70:0x01d0, B:71:0x01da, B:72:0x01ea, B:81:0x0218, B:74:0x01f9, B:78:0x020b, B:80:0x0211, B:98:0x0248), top: B:465:0x01ab }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0224 A[LOOP:20: B:70:0x01d0->B:84:0x0224, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v44, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @androidx.annotation.m1
    final List m(String str, List list, List list2, Long l10, Long l11, boolean z10) throws Throwable {
        int i10;
        int i11;
        boolean z11;
        Map map;
        Cursor cursor;
        boolean z12;
        String str2;
        Cursor cursorQuery;
        Map map2;
        HashSet hashSet;
        HashSet<Integer> hashSet2;
        Map map3;
        com.google.android.gms.internal.measurement.p7 p7Var;
        BitSet bitSet;
        BitSet bitSet2;
        androidx.collection.a aVar;
        com.google.android.gms.internal.measurement.p7 p7Var2;
        List list3;
        int i12;
        boolean z13;
        Iterator it;
        com.google.android.gms.internal.measurement.r7 r7Var;
        Long lValueOf;
        String str3;
        Map aVar2;
        SQLiteDatabase sQLiteDatabaseU0;
        ?? r10;
        Cursor cursorRawQuery;
        androidx.collection.a aVar3;
        Iterator it2;
        Integer num;
        com.google.android.gms.internal.measurement.p7 p7Var3;
        List list4;
        Map map4;
        HashSet hashSet3;
        Iterator it3;
        Integer numValueOf;
        List arrayList;
        String str4;
        String str5;
        String str6;
        ArrayList arrayList2;
        t tVarF0;
        String str7;
        ContentValues contentValues;
        androidx.collection.a aVar4;
        Iterator it4;
        String strG;
        Map map5;
        Iterator it5;
        Iterator it6;
        boolean zK;
        Map map6;
        com.google.android.gms.internal.measurement.r4 r4Var;
        h7 h7Var;
        Integer numValueOf2;
        d dVar;
        Integer numValueOf3;
        t tVarF1;
        String str8;
        androidx.collection.a aVar5;
        Cursor cursor2;
        String str9;
        Cursor cursorQuery2;
        Integer numValueOf4;
        List list5;
        List arrayList3;
        jf jfVar;
        androidx.collection.a aVar6;
        Iterator it7;
        com.google.android.gms.internal.measurement.y6 y6Var;
        com.google.android.gms.internal.measurement.y6 y6VarA;
        qe qeVar;
        b0 b0VarZ;
        long j10;
        String strH;
        Map map7;
        b0 b0Var;
        Iterator it8;
        Integer num2;
        int iIntValue;
        Iterator it9;
        boolean zK2;
        Map map8;
        Iterator it10;
        long j11;
        b bVar;
        t tVarF2;
        String str10;
        androidx.collection.a aVar7;
        String str11;
        Cursor cursor3;
        Cursor cursorQuery3;
        Cursor cursor4;
        Integer numValueOf5;
        List list6;
        List arrayList4;
        androidx.collection.a aVar8;
        int i13;
        ?? r11;
        Cursor cursorQuery4;
        List arrayList5;
        com.google.android.gms.common.internal.w.l(str);
        com.google.android.gms.common.internal.w.r(list);
        com.google.android.gms.common.internal.w.r(list2);
        this.f109897d = str;
        this.f109898e = new HashSet();
        this.f109899f = new androidx.collection.a();
        this.f109900g = l10;
        this.f109901h = l11;
        Iterator it11 = list.iterator();
        while (true) {
            i10 = 0;
            i11 = 1;
            if (!it11.hasNext()) {
                z11 = false;
                break;
            }
            if ("_s".equals(((com.google.android.gms.internal.measurement.y6) it11.next()).H())) {
                z11 = true;
                break;
            }
        }
        com.google.android.gms.internal.measurement.jf.a();
        h7 h7Var2 = this.f110184a;
        k kVarW = h7Var2.w();
        String str12 = this.f109897d;
        y4 y4Var = z4.G0;
        boolean zH = kVarW.H(str12, y4Var);
        com.google.android.gms.internal.measurement.jf.a();
        boolean zH2 = h7Var2.w().H(this.f109897d, z4.F0);
        Object obj = y4Var;
        if (z11) {
            t tVarF3 = this.f110700b.F0();
            String str13 = this.f109897d;
            tVarF3.j();
            tVarF3.h();
            com.google.android.gms.common.internal.w.l(str13);
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("current_session_count", (Integer) 0);
            try {
                SQLiteDatabase sQLiteDatabaseU1 = tVarF3.u0();
                sQLiteDatabaseU1.update(EventEntry.tableName, contentValues2, "app_id = ?", new String[]{str13});
                obj = sQLiteDatabaseU1;
            } catch (SQLiteException e10) {
                tVarF3.f110184a.a().o().c("Error resetting session-scoped event counts. appId", w5.x(str13), e10);
                obj = "Error resetting session-scoped event counts. appId";
            }
        }
        Map map9 = Collections.EMPTY_MAP;
        String str14 = "data";
        String str15 = "audience_id";
        if (zH2 && zH) {
            t tVarF4 = this.f110700b.F0();
            String str16 = this.f109897d;
            com.google.android.gms.common.internal.w.l(str16);
            androidx.collection.a aVar9 = new androidx.collection.a();
            try {
                try {
                    cursorQuery4 = tVarF4.u0().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str16}, null, null, null);
                    try {
                        if (cursorQuery4.moveToFirst()) {
                            while (true) {
                                try {
                                    com.google.android.gms.internal.measurement.j4 j4Var = (com.google.android.gms.internal.measurement.j4) ((com.google.android.gms.internal.measurement.i4) ve.W(com.google.android.gms.internal.measurement.j4.Q(), cursorQuery4.getBlob(i11))).r();
                                    if (j4Var.K()) {
                                        Integer numValueOf6 = Integer.valueOf(cursorQuery4.getInt(i10));
                                        List list7 = (List) aVar9.get(numValueOf6);
                                        if (list7 == null) {
                                            arrayList5 = new ArrayList();
                                            aVar9.put(numValueOf6, arrayList5);
                                        } else {
                                            arrayList5 = list7;
                                        }
                                        arrayList5.add(j4Var);
                                    }
                                } catch (IOException e11) {
                                    tVarF4.f110184a.a().o().c("Failed to merge filter. appId", w5.x(str16), e11);
                                }
                                if (!cursorQuery4.moveToNext()) {
                                    break;
                                }
                                i10 = 0;
                                i11 = 1;
                            }
                            cursorQuery4.close();
                            map = aVar9;
                        } else {
                            cursorQuery4.close();
                            map = map9;
                        }
                    } catch (SQLiteException e12) {
                        e = e12;
                        tVarF4.f110184a.a().o().c("Database error querying filters. appId", w5.x(str16), e);
                        map9 = Collections.EMPTY_MAP;
                        if (cursorQuery4 != null) {
                        }
                        map = map9;
                        t tVarF5 = this.f110700b.F0();
                        String str17 = this.f109897d;
                        tVarF5.j();
                        tVarF5.h();
                        com.google.android.gms.common.internal.w.l(str17);
                        cursorQuery = tVarF5.u0().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str17}, null, null, null);
                        try {
                            try {
                                if (cursorQuery.moveToFirst()) {
                                    aVar8 = new androidx.collection.a();
                                    while (true) {
                                        i13 = cursorQuery.getInt(0);
                                        try {
                                            aVar8.put(Integer.valueOf(i13), (com.google.android.gms.internal.measurement.p7) ((com.google.android.gms.internal.measurement.o7) ve.W(com.google.android.gms.internal.measurement.p7.M(), cursorQuery.getBlob(1))).r());
                                            z12 = z11;
                                            str2 = str14;
                                        } catch (IOException e13) {
                                            z12 = z11;
                                            str2 = str14;
                                            try {
                                                tVarF5.f110184a.a().o().d("Failed to merge filter results. appId, audienceId, error", w5.x(str17), Integer.valueOf(i13), e13);
                                            } catch (SQLiteException e14) {
                                                e = e14;
                                                str15 = str15;
                                                tVarF5.f110184a.a().o().c("Database error querying filter results. appId", w5.x(str17), e);
                                                Map map10 = Collections.EMPTY_MAP;
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                map2 = map10;
                                                if (!map2.isEmpty()) {
                                                    hashSet = new HashSet(map2.keySet());
                                                    if (z12) {
                                                        String str18 = this.f109897d;
                                                        t tVarF6 = this.f110700b.F0();
                                                        str3 = this.f109897d;
                                                        tVarF6.j();
                                                        tVarF6.h();
                                                        com.google.android.gms.common.internal.w.l(str3);
                                                        aVar2 = new androidx.collection.a();
                                                        sQLiteDatabaseU0 = tVarF6.u0();
                                                        try {
                                                            try {
                                                                cursorRawQuery = sQLiteDatabaseU0.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str3, str3});
                                                                try {
                                                                    if (cursorRawQuery.moveToFirst()) {
                                                                        do {
                                                                            numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                            arrayList = (List) aVar2.get(numValueOf);
                                                                            if (arrayList == null) {
                                                                                arrayList = new ArrayList();
                                                                                aVar2.put(numValueOf, arrayList);
                                                                            }
                                                                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                        } while (cursorRawQuery.moveToNext());
                                                                    } else {
                                                                        aVar2 = Collections.EMPTY_MAP;
                                                                    }
                                                                } catch (SQLiteException e15) {
                                                                    e = e15;
                                                                    tVarF6.f110184a.a().o().c("Database error querying scoped filters. appId", w5.x(str3), e);
                                                                    aVar2 = Collections.EMPTY_MAP;
                                                                    if (cursorRawQuery != null) {
                                                                    }
                                                                    com.google.android.gms.common.internal.w.l(str18);
                                                                    com.google.android.gms.common.internal.w.r(map2);
                                                                    aVar3 = new androidx.collection.a();
                                                                    if (!map2.isEmpty()) {
                                                                        it2 = map2.keySet().iterator();
                                                                        while (it2.hasNext()) {
                                                                            num = (Integer) it2.next();
                                                                            num.intValue();
                                                                            p7Var3 = (com.google.android.gms.internal.measurement.p7) map2.get(num);
                                                                            list4 = (List) aVar2.get(num);
                                                                            if (list4 != null) {
                                                                            }
                                                                            map4 = aVar2;
                                                                            hashSet3 = hashSet;
                                                                            it3 = it2;
                                                                            aVar3.put(num, p7Var3);
                                                                            aVar2 = map4;
                                                                            hashSet = hashSet3;
                                                                            it2 = it3;
                                                                        }
                                                                    }
                                                                    hashSet2 = hashSet;
                                                                    map3 = aVar3;
                                                                    for (Integer num3 : hashSet2) {
                                                                        num3.intValue();
                                                                        p7Var = (com.google.android.gms.internal.measurement.p7) map3.get(num3);
                                                                        bitSet = new BitSet();
                                                                        bitSet2 = new BitSet();
                                                                        aVar = new androidx.collection.a();
                                                                        if (p7Var != null) {
                                                                            for (com.google.android.gms.internal.measurement.w6 w6Var : p7Var.I()) {
                                                                                if (w6Var.E()) {
                                                                                    Map map11 = map3;
                                                                                    Integer numValueOf7 = Integer.valueOf(w6Var.F());
                                                                                    if (w6Var.G()) {
                                                                                        lValueOf = Long.valueOf(w6Var.H());
                                                                                    } else {
                                                                                        lValueOf = null;
                                                                                    }
                                                                                    aVar.put(numValueOf7, lValueOf);
                                                                                    map3 = map11;
                                                                                }
                                                                            }
                                                                        }
                                                                        Map map12 = map3;
                                                                        androidx.collection.a aVar10 = new androidx.collection.a();
                                                                        if (p7Var != null) {
                                                                            it = p7Var.K().iterator();
                                                                            while (it.hasNext()) {
                                                                                r7Var = (com.google.android.gms.internal.measurement.r7) it.next();
                                                                                if (!r7Var.E()) {
                                                                                }
                                                                            }
                                                                        }
                                                                        p7Var2 = p7Var;
                                                                        if (p7Var2 != null) {
                                                                            i12 = 0;
                                                                            while (i12 < p7Var2.F() * 64) {
                                                                                if (ve.P(p7Var2.E(), i12)) {
                                                                                    z13 = zH;
                                                                                    this.f110184a.a().w().c("Filter already evaluated. audience ID, filter ID", num3, Integer.valueOf(i12));
                                                                                    bitSet2.set(i12);
                                                                                    if (ve.P(p7Var2.G(), i12)) {
                                                                                        bitSet.set(i12);
                                                                                    }
                                                                                    i12++;
                                                                                    zH = z13;
                                                                                } else {
                                                                                    z13 = zH;
                                                                                }
                                                                                aVar.remove(Integer.valueOf(i12));
                                                                                i12++;
                                                                                zH = z13;
                                                                            }
                                                                        }
                                                                        boolean z14 = zH;
                                                                        com.google.android.gms.internal.measurement.p7 p7Var4 = (com.google.android.gms.internal.measurement.p7) map2.get(num3);
                                                                        if (!zH2) {
                                                                        }
                                                                        this.f109899f.put(num3, new hf(this, this.f109897d, p7Var4, bitSet, bitSet2, aVar, aVar10, null));
                                                                        str2 = str2;
                                                                        map = map;
                                                                        str15 = str15;
                                                                        map2 = map2;
                                                                        zH = z14;
                                                                        map3 = map12;
                                                                    }
                                                                    str4 = str2;
                                                                    str5 = str15;
                                                                    str6 = "Skipping failed audience ID";
                                                                    if (!list.isEmpty()) {
                                                                        jfVar = new jf(this, null);
                                                                        aVar6 = new androidx.collection.a();
                                                                        it7 = list.iterator();
                                                                        while (it7.hasNext()) {
                                                                            y6Var = (com.google.android.gms.internal.measurement.y6) it7.next();
                                                                            y6VarA = jfVar.a(this.f109897d, y6Var);
                                                                            if (y6VarA != null) {
                                                                                qeVar = this.f110700b;
                                                                                b0VarZ = qeVar.F0().Z(this.f109897d, y6Var, y6VarA.H());
                                                                                qeVar.F0().w0(b0VarZ);
                                                                                if (z10) {
                                                                                    continue;
                                                                                } else {
                                                                                    j10 = b0VarZ.f109766c;
                                                                                    strH = y6VarA.H();
                                                                                    map7 = (Map) aVar6.get(strH);
                                                                                    if (map7 == null) {
                                                                                        tVarF2 = qeVar.F0();
                                                                                        str10 = this.f109897d;
                                                                                        tVarF2.j();
                                                                                        tVarF2.h();
                                                                                        com.google.android.gms.common.internal.w.l(str10);
                                                                                        com.google.android.gms.common.internal.w.l(strH);
                                                                                        aVar7 = new androidx.collection.a();
                                                                                        try {
                                                                                            try {
                                                                                                str11 = str10;
                                                                                                try {
                                                                                                    cursorQuery3 = tVarF2.u0().query("event_filters", new String[]{str5, str4}, "app_id=? AND event_name=?", new String[]{str10, strH}, null, null, null);
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (cursorQuery3.moveToFirst()) {
                                                                                                                b0Var = b0VarZ;
                                                                                                                while (true) {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            com.google.android.gms.internal.measurement.j4 j4Var2 = (com.google.android.gms.internal.measurement.j4) ((com.google.android.gms.internal.measurement.i4) ve.W(com.google.android.gms.internal.measurement.j4.Q(), cursorQuery3.getBlob(1))).r();
                                                                                                                            numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                                                                            list6 = (List) aVar7.get(numValueOf5);
                                                                                                                            if (list6 == null) {
                                                                                                                                cursor4 = cursorQuery3;
                                                                                                                                try {
                                                                                                                                    arrayList4 = new ArrayList();
                                                                                                                                    aVar7.put(numValueOf5, arrayList4);
                                                                                                                                } catch (SQLiteException e16) {
                                                                                                                                    e = e16;
                                                                                                                                    cursor3 = cursor4;
                                                                                                                                    try {
                                                                                                                                        tVarF2.f110184a.a().o().c("Database error querying filters. appId", w5.x(str11), e);
                                                                                                                                        map7 = Collections.EMPTY_MAP;
                                                                                                                                        if (cursor3 != null) {
                                                                                                                                            cursor3.close();
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th2) {
                                                                                                                                        th = th2;
                                                                                                                                        if (cursor3 != null) {
                                                                                                                                            cursor3.close();
                                                                                                                                        }
                                                                                                                                        throw th;
                                                                                                                                    }
                                                                                                                                } catch (Throwable th3) {
                                                                                                                                    th = th3;
                                                                                                                                    cursor3 = cursor4;
                                                                                                                                    if (cursor3 != null) {
                                                                                                                                        cursor3.close();
                                                                                                                                    }
                                                                                                                                    throw th;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                cursor4 = cursorQuery3;
                                                                                                                                arrayList4 = list6;
                                                                                                                            }
                                                                                                                            arrayList4.add(j4Var2);
                                                                                                                        } catch (IOException e17) {
                                                                                                                            cursor4 = cursorQuery3;
                                                                                                                            tVarF2.f110184a.a().o().c("Failed to merge filter. appId", w5.x(str11), e17);
                                                                                                                        }
                                                                                                                        if (!cursor4.moveToNext()) {
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        cursorQuery3 = cursor4;
                                                                                                                    } catch (SQLiteException e18) {
                                                                                                                        e = e18;
                                                                                                                        cursor4 = cursorQuery3;
                                                                                                                    }
                                                                                                                }
                                                                                                                cursor4.close();
                                                                                                                map7 = aVar7;
                                                                                                            } else {
                                                                                                                b0Var = b0VarZ;
                                                                                                                map7 = Collections.EMPTY_MAP;
                                                                                                                cursorQuery3.close();
                                                                                                            }
                                                                                                        } catch (Throwable th4) {
                                                                                                            th = th4;
                                                                                                            cursor4 = cursorQuery3;
                                                                                                        }
                                                                                                    } catch (SQLiteException e19) {
                                                                                                        e = e19;
                                                                                                        cursor4 = cursorQuery3;
                                                                                                        b0Var = b0VarZ;
                                                                                                    }
                                                                                                } catch (SQLiteException e20) {
                                                                                                    e = e20;
                                                                                                    b0Var = b0VarZ;
                                                                                                    cursor3 = null;
                                                                                                    tVarF2.f110184a.a().o().c("Database error querying filters. appId", w5.x(str11), e);
                                                                                                    map7 = Collections.EMPTY_MAP;
                                                                                                    if (cursor3 != null) {
                                                                                                        cursor3.close();
                                                                                                    }
                                                                                                    aVar6.put(strH, map7);
                                                                                                    it8 = map7.keySet().iterator();
                                                                                                    while (it8.hasNext()) {
                                                                                                        num2 = (Integer) it8.next();
                                                                                                        iIntValue = num2.intValue();
                                                                                                        if (this.f109898e.contains(num2)) {
                                                                                                            this.f110184a.a().w().b("Skipping failed audience ID", num2);
                                                                                                        } else {
                                                                                                            it9 = ((List) map7.get(num2)).iterator();
                                                                                                            zK2 = true;
                                                                                                            while (true) {
                                                                                                                if (!it9.hasNext()) {
                                                                                                                    map8 = map7;
                                                                                                                    it10 = it8;
                                                                                                                    j11 = j10;
                                                                                                                    break;
                                                                                                                }
                                                                                                                com.google.android.gms.internal.measurement.j4 j4Var3 = (com.google.android.gms.internal.measurement.j4) it9.next();
                                                                                                                map8 = map7;
                                                                                                                it10 = it8;
                                                                                                                bVar = new b(this, this.f109897d, iIntValue, j4Var3);
                                                                                                                j11 = j10;
                                                                                                                zK2 = bVar.k(this.f109900g, this.f109901h, y6VarA, j11, b0Var, o(iIntValue, j4Var3.F()));
                                                                                                                if (!zK2) {
                                                                                                                    this.f109898e.add(num2);
                                                                                                                    break;
                                                                                                                }
                                                                                                                n(num2).a(bVar);
                                                                                                                j10 = j11;
                                                                                                                map7 = map8;
                                                                                                                it8 = it10;
                                                                                                            }
                                                                                                            if (!zK2) {
                                                                                                                this.f109898e.add(num2);
                                                                                                            }
                                                                                                            j10 = j11;
                                                                                                            map7 = map8;
                                                                                                            it8 = it10;
                                                                                                        }
                                                                                                    }
                                                                                                    it7 = it7;
                                                                                                    jfVar = jfVar;
                                                                                                }
                                                                                            } catch (Throwable th5) {
                                                                                                th = th5;
                                                                                                cursor3 = null;
                                                                                            }
                                                                                        } catch (SQLiteException e21) {
                                                                                            e = e21;
                                                                                            str11 = str10;
                                                                                        }
                                                                                        aVar6.put(strH, map7);
                                                                                    } else {
                                                                                        b0Var = b0VarZ;
                                                                                    }
                                                                                    it8 = map7.keySet().iterator();
                                                                                    while (it8.hasNext()) {
                                                                                        num2 = (Integer) it8.next();
                                                                                        iIntValue = num2.intValue();
                                                                                        if (this.f109898e.contains(num2)) {
                                                                                            this.f110184a.a().w().b("Skipping failed audience ID", num2);
                                                                                        } else {
                                                                                            it9 = ((List) map7.get(num2)).iterator();
                                                                                            zK2 = true;
                                                                                            while (true) {
                                                                                                if (!it9.hasNext()) {
                                                                                                    map8 = map7;
                                                                                                    it10 = it8;
                                                                                                    j11 = j10;
                                                                                                    break;
                                                                                                }
                                                                                                com.google.android.gms.internal.measurement.j4 j4Var4 = (com.google.android.gms.internal.measurement.j4) it9.next();
                                                                                                map8 = map7;
                                                                                                it10 = it8;
                                                                                                bVar = new b(this, this.f109897d, iIntValue, j4Var4);
                                                                                                j11 = j10;
                                                                                                zK2 = bVar.k(this.f109900g, this.f109901h, y6VarA, j11, b0Var, o(iIntValue, j4Var4.F()));
                                                                                                if (!zK2) {
                                                                                                    this.f109898e.add(num2);
                                                                                                    break;
                                                                                                }
                                                                                                n(num2).a(bVar);
                                                                                                j10 = j11;
                                                                                                map7 = map8;
                                                                                                it8 = it10;
                                                                                            }
                                                                                            if (!zK2) {
                                                                                                this.f109898e.add(num2);
                                                                                            }
                                                                                            j10 = j11;
                                                                                            map7 = map8;
                                                                                            it8 = it10;
                                                                                        }
                                                                                    }
                                                                                    it7 = it7;
                                                                                    jfVar = jfVar;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (!z10) {
                                                                        return new ArrayList();
                                                                    }
                                                                    if (!list2.isEmpty()) {
                                                                        aVar4 = new androidx.collection.a();
                                                                        it4 = list2.iterator();
                                                                        while (it4.hasNext()) {
                                                                            com.google.android.gms.internal.measurement.b8 b8Var = (com.google.android.gms.internal.measurement.b8) it4.next();
                                                                            strG = b8Var.G();
                                                                            map5 = (Map) aVar4.get(strG);
                                                                            if (map5 == null) {
                                                                                tVarF1 = this.f110700b.F0();
                                                                                str8 = this.f109897d;
                                                                                tVarF1.j();
                                                                                tVarF1.h();
                                                                                com.google.android.gms.common.internal.w.l(str8);
                                                                                com.google.android.gms.common.internal.w.l(strG);
                                                                                aVar5 = new androidx.collection.a();
                                                                                try {
                                                                                    cursorQuery2 = tVarF1.u0().query("property_filters", new String[]{str5, str4}, "app_id=? AND property_name=?", new String[]{str8, strG}, null, null, null);
                                                                                    try {
                                                                                        try {
                                                                                            if (cursorQuery2.moveToFirst()) {
                                                                                                while (true) {
                                                                                                    try {
                                                                                                        com.google.android.gms.internal.measurement.r4 r4Var2 = (com.google.android.gms.internal.measurement.r4) ((com.google.android.gms.internal.measurement.q4) ve.W(com.google.android.gms.internal.measurement.r4.M(), cursorQuery2.getBlob(1))).r();
                                                                                                        numValueOf4 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                        list5 = (List) aVar5.get(numValueOf4);
                                                                                                        if (list5 == null) {
                                                                                                            it5 = it4;
                                                                                                            try {
                                                                                                                arrayList3 = new ArrayList();
                                                                                                                aVar5.put(numValueOf4, arrayList3);
                                                                                                            } catch (SQLiteException e22) {
                                                                                                                e = e22;
                                                                                                                str9 = str8;
                                                                                                                tVarF1.f110184a.a().o().c("Database error querying filters. appId", w5.x(str9), e);
                                                                                                                map5 = Collections.EMPTY_MAP;
                                                                                                                if (cursorQuery2 != null) {
                                                                                                                    cursorQuery2.close();
                                                                                                                }
                                                                                                                aVar4.put(strG, map5);
                                                                                                                for (Integer num4 : map5.keySet()) {
                                                                                                                    int iIntValue2 = num4.intValue();
                                                                                                                    if (this.f109898e.contains(num4)) {
                                                                                                                        this.f110184a.a().w().b(str6, num4);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    it6 = ((List) map5.get(num4)).iterator();
                                                                                                                    zK = true;
                                                                                                                    while (true) {
                                                                                                                        if (it6.hasNext()) {
                                                                                                                            r4Var = (com.google.android.gms.internal.measurement.r4) it6.next();
                                                                                                                            h7Var = this.f110184a;
                                                                                                                            map6 = map5;
                                                                                                                            if (Log.isLoggable(h7Var.a().z(), 2)) {
                                                                                                                                u5 u5VarW = h7Var.a().w();
                                                                                                                                if (r4Var.E()) {
                                                                                                                                    numValueOf3 = Integer.valueOf(r4Var.F());
                                                                                                                                } else {
                                                                                                                                    numValueOf3 = null;
                                                                                                                                }
                                                                                                                                u5VarW.d("Evaluating filter. audience, filter, property", num4, numValueOf3, h7Var.D().c(r4Var.G()));
                                                                                                                                h7Var.a().w().b("Filter definition", this.f110700b.K0().M(r4Var));
                                                                                                                            }
                                                                                                                            if (r4Var.E()) {
                                                                                                                            }
                                                                                                                            u5 u5VarR = h7Var.a().r();
                                                                                                                            Object objX = w5.x(this.f109897d);
                                                                                                                            if (r4Var.E()) {
                                                                                                                                numValueOf2 = Integer.valueOf(r4Var.F());
                                                                                                                            } else {
                                                                                                                                numValueOf2 = null;
                                                                                                                            }
                                                                                                                            u5VarR.c("Invalid property filter ID. appId, id", objX, String.valueOf(numValueOf2));
                                                                                                                            this.f109898e.add(num4);
                                                                                                                            map5 = map6;
                                                                                                                            aVar4 = aVar4;
                                                                                                                            str6 = str6;
                                                                                                                        } else {
                                                                                                                            map6 = map5;
                                                                                                                            str6 = str6;
                                                                                                                            aVar4 = aVar4;
                                                                                                                        }
                                                                                                                        if (!zK) {
                                                                                                                            this.f109898e.add(num4);
                                                                                                                        }
                                                                                                                        map5 = map6;
                                                                                                                        aVar4 = aVar4;
                                                                                                                        str6 = str6;
                                                                                                                        n(num4).a(dVar);
                                                                                                                        map5 = map6;
                                                                                                                        aVar4 = aVar4;
                                                                                                                        str6 = str6;
                                                                                                                    }
                                                                                                                }
                                                                                                                it4 = it5;
                                                                                                            }
                                                                                                        } else {
                                                                                                            it5 = it4;
                                                                                                            arrayList3 = list5;
                                                                                                        }
                                                                                                        arrayList3.add(r4Var2);
                                                                                                        str9 = str8;
                                                                                                    } catch (IOException e23) {
                                                                                                        it5 = it4;
                                                                                                        str9 = str8;
                                                                                                        tVarF1.f110184a.a().o().c("Failed to merge filter", w5.x(str9), e23);
                                                                                                    }
                                                                                                    try {
                                                                                                        if (!cursorQuery2.moveToNext()) {
                                                                                                            break;
                                                                                                        }
                                                                                                        it4 = it5;
                                                                                                        str8 = str9;
                                                                                                    } catch (SQLiteException e24) {
                                                                                                        e = e24;
                                                                                                        tVarF1.f110184a.a().o().c("Database error querying filters. appId", w5.x(str9), e);
                                                                                                        map5 = Collections.EMPTY_MAP;
                                                                                                        if (cursorQuery2 != null) {
                                                                                                            cursorQuery2.close();
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                cursorQuery2.close();
                                                                                                map5 = aVar5;
                                                                                            } else {
                                                                                                it5 = it4;
                                                                                                map5 = Collections.EMPTY_MAP;
                                                                                                cursorQuery2.close();
                                                                                            }
                                                                                        } catch (Throwable th6) {
                                                                                            th = th6;
                                                                                            cursor2 = cursorQuery2;
                                                                                            if (cursor2 != null) {
                                                                                                cursor2.close();
                                                                                            }
                                                                                            throw th;
                                                                                        }
                                                                                    } catch (SQLiteException e25) {
                                                                                        e = e25;
                                                                                        it5 = it4;
                                                                                    }
                                                                                } catch (SQLiteException e26) {
                                                                                    e = e26;
                                                                                    it5 = it4;
                                                                                    str9 = str8;
                                                                                    cursorQuery2 = null;
                                                                                } catch (Throwable th7) {
                                                                                    th = th7;
                                                                                    cursor2 = null;
                                                                                }
                                                                                aVar4.put(strG, map5);
                                                                            } else {
                                                                                it5 = it4;
                                                                            }
                                                                            while (r4.hasNext()) {
                                                                                int iIntValue3 = num4.intValue();
                                                                                if (this.f109898e.contains(num4)) {
                                                                                    this.f110184a.a().w().b(str6, num4);
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                it6 = ((List) map5.get(num4)).iterator();
                                                                                zK = true;
                                                                                while (true) {
                                                                                    if (it6.hasNext()) {
                                                                                        r4Var = (com.google.android.gms.internal.measurement.r4) it6.next();
                                                                                        h7Var = this.f110184a;
                                                                                        map6 = map5;
                                                                                        if (Log.isLoggable(h7Var.a().z(), 2)) {
                                                                                            u5 u5VarW2 = h7Var.a().w();
                                                                                            if (r4Var.E()) {
                                                                                                numValueOf3 = Integer.valueOf(r4Var.F());
                                                                                            } else {
                                                                                                numValueOf3 = null;
                                                                                            }
                                                                                            u5VarW2.d("Evaluating filter. audience, filter, property", num4, numValueOf3, h7Var.D().c(r4Var.G()));
                                                                                            h7Var.a().w().b("Filter definition", this.f110700b.K0().M(r4Var));
                                                                                        }
                                                                                        if (r4Var.E()) {
                                                                                        }
                                                                                        u5 u5VarR2 = h7Var.a().r();
                                                                                        Object objX2 = w5.x(this.f109897d);
                                                                                        if (r4Var.E()) {
                                                                                            numValueOf2 = Integer.valueOf(r4Var.F());
                                                                                        } else {
                                                                                            numValueOf2 = null;
                                                                                        }
                                                                                        u5VarR2.c("Invalid property filter ID. appId, id", objX2, String.valueOf(numValueOf2));
                                                                                        this.f109898e.add(num4);
                                                                                        map5 = map6;
                                                                                        aVar4 = aVar4;
                                                                                        str6 = str6;
                                                                                    } else {
                                                                                        map6 = map5;
                                                                                        str6 = str6;
                                                                                        aVar4 = aVar4;
                                                                                    }
                                                                                    if (!zK) {
                                                                                        this.f109898e.add(num4);
                                                                                    }
                                                                                    map5 = map6;
                                                                                    aVar4 = aVar4;
                                                                                    str6 = str6;
                                                                                    n(num4).a(dVar);
                                                                                    map5 = map6;
                                                                                    aVar4 = aVar4;
                                                                                    str6 = str6;
                                                                                }
                                                                            }
                                                                            it4 = it5;
                                                                        }
                                                                    }
                                                                    arrayList2 = new ArrayList();
                                                                    Set<Integer> setKeySet = this.f109899f.keySet();
                                                                    setKeySet.removeAll(this.f109898e);
                                                                    for (Integer num5 : setKeySet) {
                                                                        int iIntValue4 = num5.intValue();
                                                                        hf hfVar = (hf) this.f109899f.get(num5);
                                                                        com.google.android.gms.common.internal.w.r(hfVar);
                                                                        com.google.android.gms.internal.measurement.m6 m6VarB = hfVar.b(iIntValue4);
                                                                        arrayList2.add(m6VarB);
                                                                        tVarF0 = this.f110700b.F0();
                                                                        str7 = this.f109897d;
                                                                        com.google.android.gms.internal.measurement.p7 p7VarG = m6VarB.G();
                                                                        tVarF0.j();
                                                                        tVarF0.h();
                                                                        com.google.android.gms.common.internal.w.l(str7);
                                                                        com.google.android.gms.common.internal.w.r(p7VarG);
                                                                        byte[] bArrG = p7VarG.g();
                                                                        contentValues = new ContentValues();
                                                                        contentValues.put("app_id", str7);
                                                                        contentValues.put(str5, num5);
                                                                        contentValues.put("current_results", bArrG);
                                                                        try {
                                                                            try {
                                                                                if (tVarF0.u0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                                    tVarF0.f110184a.a().o().b("Failed to insert filter results (got -1). appId", w5.x(str7));
                                                                                }
                                                                            } catch (SQLiteException e27) {
                                                                                e = e27;
                                                                                tVarF0.f110184a.a().o().c("Error storing filter results. appId", w5.x(str7), e);
                                                                            }
                                                                        } catch (SQLiteException e28) {
                                                                            e = e28;
                                                                        }
                                                                    }
                                                                    return arrayList2;
                                                                }
                                                            } catch (Throwable th8) {
                                                                th = th8;
                                                                r10 = sQLiteDatabaseU0;
                                                                if (r10 != 0) {
                                                                    r10.close();
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (SQLiteException e29) {
                                                            e = e29;
                                                            cursorRawQuery = null;
                                                        } catch (Throwable th9) {
                                                            th = th9;
                                                            r10 = 0;
                                                            if (r10 != 0) {
                                                                r10.close();
                                                            }
                                                            throw th;
                                                        }
                                                        cursorRawQuery.close();
                                                        com.google.android.gms.common.internal.w.l(str18);
                                                        com.google.android.gms.common.internal.w.r(map2);
                                                        aVar3 = new androidx.collection.a();
                                                        if (!map2.isEmpty()) {
                                                            it2 = map2.keySet().iterator();
                                                            while (it2.hasNext()) {
                                                                num = (Integer) it2.next();
                                                                num.intValue();
                                                                p7Var3 = (com.google.android.gms.internal.measurement.p7) map2.get(num);
                                                                list4 = (List) aVar2.get(num);
                                                                if (list4 != null) {
                                                                }
                                                                map4 = aVar2;
                                                                hashSet3 = hashSet;
                                                                it3 = it2;
                                                                aVar3.put(num, p7Var3);
                                                                aVar2 = map4;
                                                                hashSet = hashSet3;
                                                                it2 = it3;
                                                            }
                                                        }
                                                        hashSet2 = hashSet;
                                                        map3 = aVar3;
                                                    } else {
                                                        hashSet2 = hashSet;
                                                        map3 = map2;
                                                    }
                                                    while (r16.hasNext()) {
                                                        num3.intValue();
                                                        p7Var = (com.google.android.gms.internal.measurement.p7) map3.get(num3);
                                                        bitSet = new BitSet();
                                                        bitSet2 = new BitSet();
                                                        aVar = new androidx.collection.a();
                                                        if (p7Var != null) {
                                                            while (r7.hasNext()) {
                                                                if (w6Var.E()) {
                                                                    Map map13 = map3;
                                                                    Integer numValueOf8 = Integer.valueOf(w6Var.F());
                                                                    if (w6Var.G()) {
                                                                        lValueOf = Long.valueOf(w6Var.H());
                                                                    } else {
                                                                        lValueOf = null;
                                                                    }
                                                                    aVar.put(numValueOf8, lValueOf);
                                                                    map3 = map13;
                                                                }
                                                            }
                                                        }
                                                        Map map14 = map3;
                                                        androidx.collection.a aVar11 = new androidx.collection.a();
                                                        if (p7Var != null) {
                                                            it = p7Var.K().iterator();
                                                            while (it.hasNext()) {
                                                                r7Var = (com.google.android.gms.internal.measurement.r7) it.next();
                                                                if (!r7Var.E()) {
                                                                }
                                                            }
                                                        }
                                                        p7Var2 = p7Var;
                                                        if (p7Var2 != null) {
                                                            i12 = 0;
                                                            while (i12 < p7Var2.F() * 64) {
                                                                if (ve.P(p7Var2.E(), i12)) {
                                                                    z13 = zH;
                                                                    this.f110184a.a().w().c("Filter already evaluated. audience ID, filter ID", num3, Integer.valueOf(i12));
                                                                    bitSet2.set(i12);
                                                                    if (ve.P(p7Var2.G(), i12)) {
                                                                        bitSet.set(i12);
                                                                    }
                                                                    i12++;
                                                                    zH = z13;
                                                                } else {
                                                                    z13 = zH;
                                                                }
                                                                aVar.remove(Integer.valueOf(i12));
                                                                i12++;
                                                                zH = z13;
                                                            }
                                                        }
                                                        boolean z15 = zH;
                                                        com.google.android.gms.internal.measurement.p7 p7Var5 = (com.google.android.gms.internal.measurement.p7) map2.get(num3);
                                                        if (!zH2) {
                                                        }
                                                        this.f109899f.put(num3, new hf(this, this.f109897d, p7Var5, bitSet, bitSet2, aVar, aVar11, null));
                                                        str2 = str2;
                                                        map = map;
                                                        str15 = str15;
                                                        map2 = map2;
                                                        zH = z15;
                                                        map3 = map14;
                                                    }
                                                }
                                                str4 = str2;
                                                str5 = str15;
                                                str6 = "Skipping failed audience ID";
                                                if (!list.isEmpty()) {
                                                    jfVar = new jf(this, null);
                                                    aVar6 = new androidx.collection.a();
                                                    it7 = list.iterator();
                                                    while (it7.hasNext()) {
                                                        y6Var = (com.google.android.gms.internal.measurement.y6) it7.next();
                                                        y6VarA = jfVar.a(this.f109897d, y6Var);
                                                        if (y6VarA != null) {
                                                            qeVar = this.f110700b;
                                                            b0VarZ = qeVar.F0().Z(this.f109897d, y6Var, y6VarA.H());
                                                            qeVar.F0().w0(b0VarZ);
                                                            if (z10) {
                                                                j10 = b0VarZ.f109766c;
                                                                strH = y6VarA.H();
                                                                map7 = (Map) aVar6.get(strH);
                                                                if (map7 == null) {
                                                                    tVarF2 = qeVar.F0();
                                                                    str10 = this.f109897d;
                                                                    tVarF2.j();
                                                                    tVarF2.h();
                                                                    com.google.android.gms.common.internal.w.l(str10);
                                                                    com.google.android.gms.common.internal.w.l(strH);
                                                                    aVar7 = new androidx.collection.a();
                                                                    str11 = str10;
                                                                    cursorQuery3 = tVarF2.u0().query("event_filters", new String[]{str5, str4}, "app_id=? AND event_name=?", new String[]{str10, strH}, null, null, null);
                                                                    if (cursorQuery3.moveToFirst()) {
                                                                        b0Var = b0VarZ;
                                                                        while (true) {
                                                                            com.google.android.gms.internal.measurement.j4 j4Var5 = (com.google.android.gms.internal.measurement.j4) ((com.google.android.gms.internal.measurement.i4) ve.W(com.google.android.gms.internal.measurement.j4.Q(), cursorQuery3.getBlob(1))).r();
                                                                            numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                            list6 = (List) aVar7.get(numValueOf5);
                                                                            if (list6 == null) {
                                                                                cursor4 = cursorQuery3;
                                                                                arrayList4 = new ArrayList();
                                                                                aVar7.put(numValueOf5, arrayList4);
                                                                            } else {
                                                                                cursor4 = cursorQuery3;
                                                                                arrayList4 = list6;
                                                                            }
                                                                            arrayList4.add(j4Var5);
                                                                            if (!cursor4.moveToNext()) {
                                                                                break;
                                                                                break;
                                                                            }
                                                                            cursorQuery3 = cursor4;
                                                                        }
                                                                        cursor4.close();
                                                                        map7 = aVar7;
                                                                    } else {
                                                                        b0Var = b0VarZ;
                                                                        map7 = Collections.EMPTY_MAP;
                                                                        cursorQuery3.close();
                                                                    }
                                                                    aVar6.put(strH, map7);
                                                                } else {
                                                                    b0Var = b0VarZ;
                                                                }
                                                                it8 = map7.keySet().iterator();
                                                                while (it8.hasNext()) {
                                                                    num2 = (Integer) it8.next();
                                                                    iIntValue = num2.intValue();
                                                                    if (this.f109898e.contains(num2)) {
                                                                        this.f110184a.a().w().b("Skipping failed audience ID", num2);
                                                                    } else {
                                                                        it9 = ((List) map7.get(num2)).iterator();
                                                                        zK2 = true;
                                                                        while (true) {
                                                                            if (!it9.hasNext()) {
                                                                                map8 = map7;
                                                                                it10 = it8;
                                                                                j11 = j10;
                                                                                break;
                                                                            }
                                                                            com.google.android.gms.internal.measurement.j4 j4Var6 = (com.google.android.gms.internal.measurement.j4) it9.next();
                                                                            map8 = map7;
                                                                            it10 = it8;
                                                                            bVar = new b(this, this.f109897d, iIntValue, j4Var6);
                                                                            j11 = j10;
                                                                            zK2 = bVar.k(this.f109900g, this.f109901h, y6VarA, j11, b0Var, o(iIntValue, j4Var6.F()));
                                                                            if (!zK2) {
                                                                                this.f109898e.add(num2);
                                                                                break;
                                                                            }
                                                                            n(num2).a(bVar);
                                                                            j10 = j11;
                                                                            map7 = map8;
                                                                            it8 = it10;
                                                                        }
                                                                        if (!zK2) {
                                                                            this.f109898e.add(num2);
                                                                        }
                                                                        j10 = j11;
                                                                        map7 = map8;
                                                                        it8 = it10;
                                                                    }
                                                                }
                                                                it7 = it7;
                                                                jfVar = jfVar;
                                                            } else {
                                                                continue;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (!z10) {
                                                    return new ArrayList();
                                                }
                                                if (!list2.isEmpty()) {
                                                    aVar4 = new androidx.collection.a();
                                                    it4 = list2.iterator();
                                                    while (it4.hasNext()) {
                                                        com.google.android.gms.internal.measurement.b8 b8Var2 = (com.google.android.gms.internal.measurement.b8) it4.next();
                                                        strG = b8Var2.G();
                                                        map5 = (Map) aVar4.get(strG);
                                                        if (map5 == null) {
                                                            tVarF1 = this.f110700b.F0();
                                                            str8 = this.f109897d;
                                                            tVarF1.j();
                                                            tVarF1.h();
                                                            com.google.android.gms.common.internal.w.l(str8);
                                                            com.google.android.gms.common.internal.w.l(strG);
                                                            aVar5 = new androidx.collection.a();
                                                            cursorQuery2 = tVarF1.u0().query("property_filters", new String[]{str5, str4}, "app_id=? AND property_name=?", new String[]{str8, strG}, null, null, null);
                                                            if (cursorQuery2.moveToFirst()) {
                                                                while (true) {
                                                                    com.google.android.gms.internal.measurement.r4 r4Var3 = (com.google.android.gms.internal.measurement.r4) ((com.google.android.gms.internal.measurement.q4) ve.W(com.google.android.gms.internal.measurement.r4.M(), cursorQuery2.getBlob(1))).r();
                                                                    numValueOf4 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                    list5 = (List) aVar5.get(numValueOf4);
                                                                    if (list5 == null) {
                                                                        it5 = it4;
                                                                        arrayList3 = new ArrayList();
                                                                        aVar5.put(numValueOf4, arrayList3);
                                                                    } else {
                                                                        it5 = it4;
                                                                        arrayList3 = list5;
                                                                    }
                                                                    arrayList3.add(r4Var3);
                                                                    str9 = str8;
                                                                    if (!cursorQuery2.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    it4 = it5;
                                                                    str8 = str9;
                                                                }
                                                                cursorQuery2.close();
                                                                map5 = aVar5;
                                                            } else {
                                                                it5 = it4;
                                                                map5 = Collections.EMPTY_MAP;
                                                                cursorQuery2.close();
                                                            }
                                                            aVar4.put(strG, map5);
                                                        } else {
                                                            it5 = it4;
                                                        }
                                                        while (r4.hasNext()) {
                                                            int iIntValue5 = num4.intValue();
                                                            if (this.f109898e.contains(num4)) {
                                                                this.f110184a.a().w().b(str6, num4);
                                                                break;
                                                                break;
                                                            }
                                                            it6 = ((List) map5.get(num4)).iterator();
                                                            zK = true;
                                                            while (true) {
                                                                if (it6.hasNext()) {
                                                                    r4Var = (com.google.android.gms.internal.measurement.r4) it6.next();
                                                                    h7Var = this.f110184a;
                                                                    map6 = map5;
                                                                    if (Log.isLoggable(h7Var.a().z(), 2)) {
                                                                        u5 u5VarW3 = h7Var.a().w();
                                                                        if (r4Var.E()) {
                                                                            numValueOf3 = Integer.valueOf(r4Var.F());
                                                                        } else {
                                                                            numValueOf3 = null;
                                                                        }
                                                                        u5VarW3.d("Evaluating filter. audience, filter, property", num4, numValueOf3, h7Var.D().c(r4Var.G()));
                                                                        h7Var.a().w().b("Filter definition", this.f110700b.K0().M(r4Var));
                                                                    }
                                                                    if (r4Var.E()) {
                                                                    }
                                                                    u5 u5VarR3 = h7Var.a().r();
                                                                    Object objX3 = w5.x(this.f109897d);
                                                                    if (r4Var.E()) {
                                                                        numValueOf2 = Integer.valueOf(r4Var.F());
                                                                    } else {
                                                                        numValueOf2 = null;
                                                                    }
                                                                    u5VarR3.c("Invalid property filter ID. appId, id", objX3, String.valueOf(numValueOf2));
                                                                    this.f109898e.add(num4);
                                                                    map5 = map6;
                                                                    aVar4 = aVar4;
                                                                    str6 = str6;
                                                                } else {
                                                                    map6 = map5;
                                                                    str6 = str6;
                                                                    aVar4 = aVar4;
                                                                }
                                                                if (!zK) {
                                                                    this.f109898e.add(num4);
                                                                }
                                                                map5 = map6;
                                                                aVar4 = aVar4;
                                                                str6 = str6;
                                                                n(num4).a(dVar);
                                                                map5 = map6;
                                                                aVar4 = aVar4;
                                                                str6 = str6;
                                                            }
                                                        }
                                                        it4 = it5;
                                                    }
                                                }
                                                arrayList2 = new ArrayList();
                                                Set<Integer> setKeySet2 = this.f109899f.keySet();
                                                setKeySet2.removeAll(this.f109898e);
                                                while (r3.hasNext()) {
                                                    int iIntValue6 = num5.intValue();
                                                    hf hfVar2 = (hf) this.f109899f.get(num5);
                                                    com.google.android.gms.common.internal.w.r(hfVar2);
                                                    com.google.android.gms.internal.measurement.m6 m6VarB2 = hfVar2.b(iIntValue6);
                                                    arrayList2.add(m6VarB2);
                                                    tVarF0 = this.f110700b.F0();
                                                    str7 = this.f109897d;
                                                    com.google.android.gms.internal.measurement.p7 p7VarG2 = m6VarB2.G();
                                                    tVarF0.j();
                                                    tVarF0.h();
                                                    com.google.android.gms.common.internal.w.l(str7);
                                                    com.google.android.gms.common.internal.w.r(p7VarG2);
                                                    byte[] bArrG2 = p7VarG2.g();
                                                    contentValues = new ContentValues();
                                                    contentValues.put("app_id", str7);
                                                    contentValues.put(str5, num5);
                                                    contentValues.put("current_results", bArrG2);
                                                    if (tVarF0.u0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                        tVarF0.f110184a.a().o().b("Failed to insert filter results (got -1). appId", w5.x(str7));
                                                    }
                                                }
                                                return arrayList2;
                                            }
                                        }
                                        try {
                                            if (!cursorQuery.moveToNext()) {
                                                break;
                                            }
                                            z11 = z12;
                                            str14 = str2;
                                            str15 = str15;
                                        } catch (SQLiteException e30) {
                                            e = e30;
                                            tVarF5.f110184a.a().o().c("Database error querying filter results. appId", w5.x(str17), e);
                                            Map map15 = Collections.EMPTY_MAP;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            map2 = map15;
                                        }
                                    }
                                    cursorQuery.close();
                                    map2 = aVar8;
                                } else {
                                    Map map16 = Collections.EMPTY_MAP;
                                    cursorQuery.close();
                                    map2 = map16;
                                    z12 = z11;
                                    str2 = "data";
                                    str15 = "audience_id";
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                cursor = cursorQuery;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e31) {
                            e = e31;
                            z12 = z11;
                            str2 = "data";
                        }
                        if (!map2.isEmpty()) {
                            hashSet = new HashSet(map2.keySet());
                            if (z12) {
                                String str19 = this.f109897d;
                                t tVarF7 = this.f110700b.F0();
                                str3 = this.f109897d;
                                tVarF7.j();
                                tVarF7.h();
                                com.google.android.gms.common.internal.w.l(str3);
                                aVar2 = new androidx.collection.a();
                                sQLiteDatabaseU0 = tVarF7.u0();
                                cursorRawQuery = sQLiteDatabaseU0.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str3, str3});
                                if (cursorRawQuery.moveToFirst()) {
                                    do {
                                        numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                        arrayList = (List) aVar2.get(numValueOf);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            aVar2.put(numValueOf, arrayList);
                                        }
                                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                    } while (cursorRawQuery.moveToNext());
                                } else {
                                    aVar2 = Collections.EMPTY_MAP;
                                }
                                cursorRawQuery.close();
                                com.google.android.gms.common.internal.w.l(str19);
                                com.google.android.gms.common.internal.w.r(map2);
                                aVar3 = new androidx.collection.a();
                                if (!map2.isEmpty()) {
                                    it2 = map2.keySet().iterator();
                                    while (it2.hasNext()) {
                                        num = (Integer) it2.next();
                                        num.intValue();
                                        p7Var3 = (com.google.android.gms.internal.measurement.p7) map2.get(num);
                                        list4 = (List) aVar2.get(num);
                                        if (list4 != null) {
                                        }
                                        map4 = aVar2;
                                        hashSet3 = hashSet;
                                        it3 = it2;
                                        aVar3.put(num, p7Var3);
                                        aVar2 = map4;
                                        hashSet = hashSet3;
                                        it2 = it3;
                                    }
                                }
                                hashSet2 = hashSet;
                                map3 = aVar3;
                            } else {
                                hashSet2 = hashSet;
                                map3 = map2;
                            }
                            while (r16.hasNext()) {
                                num3.intValue();
                                p7Var = (com.google.android.gms.internal.measurement.p7) map3.get(num3);
                                bitSet = new BitSet();
                                bitSet2 = new BitSet();
                                aVar = new androidx.collection.a();
                                if (p7Var != null) {
                                    while (r7.hasNext()) {
                                        if (w6Var.E()) {
                                            Map map17 = map3;
                                            Integer numValueOf9 = Integer.valueOf(w6Var.F());
                                            if (w6Var.G()) {
                                                lValueOf = Long.valueOf(w6Var.H());
                                            } else {
                                                lValueOf = null;
                                            }
                                            aVar.put(numValueOf9, lValueOf);
                                            map3 = map17;
                                        }
                                    }
                                }
                                Map map18 = map3;
                                androidx.collection.a aVar12 = new androidx.collection.a();
                                if (p7Var != null) {
                                    it = p7Var.K().iterator();
                                    while (it.hasNext()) {
                                        r7Var = (com.google.android.gms.internal.measurement.r7) it.next();
                                        if (!r7Var.E()) {
                                        }
                                    }
                                }
                                p7Var2 = p7Var;
                                if (p7Var2 != null) {
                                    i12 = 0;
                                    while (i12 < p7Var2.F() * 64) {
                                        if (ve.P(p7Var2.E(), i12)) {
                                            z13 = zH;
                                            this.f110184a.a().w().c("Filter already evaluated. audience ID, filter ID", num3, Integer.valueOf(i12));
                                            bitSet2.set(i12);
                                            if (ve.P(p7Var2.G(), i12)) {
                                                bitSet.set(i12);
                                            }
                                            i12++;
                                            zH = z13;
                                        } else {
                                            z13 = zH;
                                        }
                                        aVar.remove(Integer.valueOf(i12));
                                        i12++;
                                        zH = z13;
                                    }
                                }
                                boolean z16 = zH;
                                com.google.android.gms.internal.measurement.p7 p7Var6 = (com.google.android.gms.internal.measurement.p7) map2.get(num3);
                                if (!zH2) {
                                }
                                this.f109899f.put(num3, new hf(this, this.f109897d, p7Var6, bitSet, bitSet2, aVar, aVar12, null));
                                str2 = str2;
                                map = map;
                                str15 = str15;
                                map2 = map2;
                                zH = z16;
                                map3 = map18;
                            }
                        }
                        str4 = str2;
                        str5 = str15;
                        str6 = "Skipping failed audience ID";
                        if (!list.isEmpty()) {
                            jfVar = new jf(this, null);
                            aVar6 = new androidx.collection.a();
                            it7 = list.iterator();
                            while (it7.hasNext()) {
                                y6Var = (com.google.android.gms.internal.measurement.y6) it7.next();
                                y6VarA = jfVar.a(this.f109897d, y6Var);
                                if (y6VarA != null) {
                                    qeVar = this.f110700b;
                                    b0VarZ = qeVar.F0().Z(this.f109897d, y6Var, y6VarA.H());
                                    qeVar.F0().w0(b0VarZ);
                                    if (z10) {
                                        j10 = b0VarZ.f109766c;
                                        strH = y6VarA.H();
                                        map7 = (Map) aVar6.get(strH);
                                        if (map7 == null) {
                                            tVarF2 = qeVar.F0();
                                            str10 = this.f109897d;
                                            tVarF2.j();
                                            tVarF2.h();
                                            com.google.android.gms.common.internal.w.l(str10);
                                            com.google.android.gms.common.internal.w.l(strH);
                                            aVar7 = new androidx.collection.a();
                                            str11 = str10;
                                            cursorQuery3 = tVarF2.u0().query("event_filters", new String[]{str5, str4}, "app_id=? AND event_name=?", new String[]{str10, strH}, null, null, null);
                                            if (cursorQuery3.moveToFirst()) {
                                                b0Var = b0VarZ;
                                                while (true) {
                                                    com.google.android.gms.internal.measurement.j4 j4Var7 = (com.google.android.gms.internal.measurement.j4) ((com.google.android.gms.internal.measurement.i4) ve.W(com.google.android.gms.internal.measurement.j4.Q(), cursorQuery3.getBlob(1))).r();
                                                    numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                                    list6 = (List) aVar7.get(numValueOf5);
                                                    if (list6 == null) {
                                                        cursor4 = cursorQuery3;
                                                        arrayList4 = new ArrayList();
                                                        aVar7.put(numValueOf5, arrayList4);
                                                    } else {
                                                        cursor4 = cursorQuery3;
                                                        arrayList4 = list6;
                                                    }
                                                    arrayList4.add(j4Var7);
                                                    if (!cursor4.moveToNext()) {
                                                        break;
                                                        break;
                                                    }
                                                    cursorQuery3 = cursor4;
                                                }
                                                cursor4.close();
                                                map7 = aVar7;
                                            } else {
                                                b0Var = b0VarZ;
                                                map7 = Collections.EMPTY_MAP;
                                                cursorQuery3.close();
                                            }
                                            aVar6.put(strH, map7);
                                        } else {
                                            b0Var = b0VarZ;
                                        }
                                        it8 = map7.keySet().iterator();
                                        while (it8.hasNext()) {
                                            num2 = (Integer) it8.next();
                                            iIntValue = num2.intValue();
                                            if (this.f109898e.contains(num2)) {
                                                this.f110184a.a().w().b("Skipping failed audience ID", num2);
                                            } else {
                                                it9 = ((List) map7.get(num2)).iterator();
                                                zK2 = true;
                                                while (true) {
                                                    if (!it9.hasNext()) {
                                                        map8 = map7;
                                                        it10 = it8;
                                                        j11 = j10;
                                                        break;
                                                    }
                                                    com.google.android.gms.internal.measurement.j4 j4Var8 = (com.google.android.gms.internal.measurement.j4) it9.next();
                                                    map8 = map7;
                                                    it10 = it8;
                                                    bVar = new b(this, this.f109897d, iIntValue, j4Var8);
                                                    j11 = j10;
                                                    zK2 = bVar.k(this.f109900g, this.f109901h, y6VarA, j11, b0Var, o(iIntValue, j4Var8.F()));
                                                    if (!zK2) {
                                                        this.f109898e.add(num2);
                                                        break;
                                                    }
                                                    n(num2).a(bVar);
                                                    j10 = j11;
                                                    map7 = map8;
                                                    it8 = it10;
                                                }
                                                if (!zK2) {
                                                    this.f109898e.add(num2);
                                                }
                                                j10 = j11;
                                                map7 = map8;
                                                it8 = it10;
                                            }
                                        }
                                        it7 = it7;
                                        jfVar = jfVar;
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                        if (!z10) {
                            return new ArrayList();
                        }
                        if (!list2.isEmpty()) {
                            aVar4 = new androidx.collection.a();
                            it4 = list2.iterator();
                            while (it4.hasNext()) {
                                com.google.android.gms.internal.measurement.b8 b8Var3 = (com.google.android.gms.internal.measurement.b8) it4.next();
                                strG = b8Var3.G();
                                map5 = (Map) aVar4.get(strG);
                                if (map5 == null) {
                                    tVarF1 = this.f110700b.F0();
                                    str8 = this.f109897d;
                                    tVarF1.j();
                                    tVarF1.h();
                                    com.google.android.gms.common.internal.w.l(str8);
                                    com.google.android.gms.common.internal.w.l(strG);
                                    aVar5 = new androidx.collection.a();
                                    cursorQuery2 = tVarF1.u0().query("property_filters", new String[]{str5, str4}, "app_id=? AND property_name=?", new String[]{str8, strG}, null, null, null);
                                    if (cursorQuery2.moveToFirst()) {
                                        while (true) {
                                            com.google.android.gms.internal.measurement.r4 r4Var4 = (com.google.android.gms.internal.measurement.r4) ((com.google.android.gms.internal.measurement.q4) ve.W(com.google.android.gms.internal.measurement.r4.M(), cursorQuery2.getBlob(1))).r();
                                            numValueOf4 = Integer.valueOf(cursorQuery2.getInt(0));
                                            list5 = (List) aVar5.get(numValueOf4);
                                            if (list5 == null) {
                                                it5 = it4;
                                                arrayList3 = new ArrayList();
                                                aVar5.put(numValueOf4, arrayList3);
                                            } else {
                                                it5 = it4;
                                                arrayList3 = list5;
                                            }
                                            arrayList3.add(r4Var4);
                                            str9 = str8;
                                            if (!cursorQuery2.moveToNext()) {
                                                break;
                                                break;
                                            }
                                            it4 = it5;
                                            str8 = str9;
                                        }
                                        cursorQuery2.close();
                                        map5 = aVar5;
                                    } else {
                                        it5 = it4;
                                        map5 = Collections.EMPTY_MAP;
                                        cursorQuery2.close();
                                    }
                                    aVar4.put(strG, map5);
                                } else {
                                    it5 = it4;
                                }
                                while (r4.hasNext()) {
                                    int iIntValue7 = num4.intValue();
                                    if (this.f109898e.contains(num4)) {
                                        this.f110184a.a().w().b(str6, num4);
                                        break;
                                        break;
                                    }
                                    it6 = ((List) map5.get(num4)).iterator();
                                    zK = true;
                                    while (true) {
                                        if (it6.hasNext()) {
                                            r4Var = (com.google.android.gms.internal.measurement.r4) it6.next();
                                            h7Var = this.f110184a;
                                            map6 = map5;
                                            if (Log.isLoggable(h7Var.a().z(), 2)) {
                                                u5 u5VarW4 = h7Var.a().w();
                                                if (r4Var.E()) {
                                                    numValueOf3 = Integer.valueOf(r4Var.F());
                                                } else {
                                                    numValueOf3 = null;
                                                }
                                                u5VarW4.d("Evaluating filter. audience, filter, property", num4, numValueOf3, h7Var.D().c(r4Var.G()));
                                                h7Var.a().w().b("Filter definition", this.f110700b.K0().M(r4Var));
                                            }
                                            if (r4Var.E()) {
                                            }
                                            u5 u5VarR4 = h7Var.a().r();
                                            Object objX4 = w5.x(this.f109897d);
                                            if (r4Var.E()) {
                                                numValueOf2 = Integer.valueOf(r4Var.F());
                                            } else {
                                                numValueOf2 = null;
                                            }
                                            u5VarR4.c("Invalid property filter ID. appId, id", objX4, String.valueOf(numValueOf2));
                                            this.f109898e.add(num4);
                                            map5 = map6;
                                            aVar4 = aVar4;
                                            str6 = str6;
                                        } else {
                                            map6 = map5;
                                            str6 = str6;
                                            aVar4 = aVar4;
                                        }
                                        if (!zK) {
                                            this.f109898e.add(num4);
                                        }
                                        map5 = map6;
                                        aVar4 = aVar4;
                                        str6 = str6;
                                        n(num4).a(dVar);
                                        map5 = map6;
                                        aVar4 = aVar4;
                                        str6 = str6;
                                    }
                                }
                                it4 = it5;
                            }
                        }
                        arrayList2 = new ArrayList();
                        Set<Integer> setKeySet3 = this.f109899f.keySet();
                        setKeySet3.removeAll(this.f109898e);
                        while (r3.hasNext()) {
                            int iIntValue8 = num5.intValue();
                            hf hfVar3 = (hf) this.f109899f.get(num5);
                            com.google.android.gms.common.internal.w.r(hfVar3);
                            com.google.android.gms.internal.measurement.m6 m6VarB3 = hfVar3.b(iIntValue8);
                            arrayList2.add(m6VarB3);
                            tVarF0 = this.f110700b.F0();
                            str7 = this.f109897d;
                            com.google.android.gms.internal.measurement.p7 p7VarG3 = m6VarB3.G();
                            tVarF0.j();
                            tVarF0.h();
                            com.google.android.gms.common.internal.w.l(str7);
                            com.google.android.gms.common.internal.w.r(p7VarG3);
                            byte[] bArrG3 = p7VarG3.g();
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str7);
                            contentValues.put(str5, num5);
                            contentValues.put("current_results", bArrG3);
                            if (tVarF0.u0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                tVarF0.f110184a.a().o().b("Failed to insert filter results (got -1). appId", w5.x(str7));
                            }
                        }
                        return arrayList2;
                    }
                } catch (Throwable th11) {
                    th = th11;
                    r11 = obj;
                    if (r11 != 0) {
                        r11.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e32) {
                e = e32;
                cursorQuery4 = null;
            } catch (Throwable th12) {
                th = th12;
                r11 = 0;
                if (r11 != 0) {
                    r11.close();
                }
                throw th;
            }
        } else {
            map = map9;
        }
        t tVarF8 = this.f110700b.F0();
        String str110 = this.f109897d;
        tVarF8.j();
        tVarF8.h();
        com.google.android.gms.common.internal.w.l(str110);
        try {
            cursorQuery = tVarF8.u0().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str110}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                Map map19 = Collections.EMPTY_MAP;
                cursorQuery.close();
                map2 = map19;
                z12 = z11;
                str2 = "data";
                str15 = "audience_id";
            } else {
                aVar8 = new androidx.collection.a();
                while (true) {
                    i13 = cursorQuery.getInt(0);
                    aVar8.put(Integer.valueOf(i13), (com.google.android.gms.internal.measurement.p7) ((com.google.android.gms.internal.measurement.o7) ve.W(com.google.android.gms.internal.measurement.p7.M(), cursorQuery.getBlob(1))).r());
                    z12 = z11;
                    str2 = str14;
                    if (!cursorQuery.moveToNext()) {
                        break;
                        break;
                    }
                    z11 = z12;
                    str14 = str2;
                    str15 = str15;
                }
                cursorQuery.close();
                map2 = aVar8;
            }
        } catch (SQLiteException e33) {
            e = e33;
            z12 = z11;
            str2 = "data";
            str15 = "audience_id";
            cursorQuery = null;
        } catch (Throwable th13) {
            th = th13;
            cursor = null;
        }
        if (!map2.isEmpty()) {
            hashSet = new HashSet(map2.keySet());
            if (z12) {
                String str111 = this.f109897d;
                t tVarF9 = this.f110700b.F0();
                str3 = this.f109897d;
                tVarF9.j();
                tVarF9.h();
                com.google.android.gms.common.internal.w.l(str3);
                aVar2 = new androidx.collection.a();
                sQLiteDatabaseU0 = tVarF9.u0();
                cursorRawQuery = sQLiteDatabaseU0.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str3, str3});
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                        arrayList = (List) aVar2.get(numValueOf);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            aVar2.put(numValueOf, arrayList);
                        }
                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                    } while (cursorRawQuery.moveToNext());
                } else {
                    aVar2 = Collections.EMPTY_MAP;
                }
                cursorRawQuery.close();
                com.google.android.gms.common.internal.w.l(str111);
                com.google.android.gms.common.internal.w.r(map2);
                aVar3 = new androidx.collection.a();
                if (!map2.isEmpty()) {
                    it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        num = (Integer) it2.next();
                        num.intValue();
                        p7Var3 = (com.google.android.gms.internal.measurement.p7) map2.get(num);
                        list4 = (List) aVar2.get(num);
                        if (list4 != null || list4.isEmpty()) {
                            map4 = aVar2;
                            hashSet3 = hashSet;
                            it3 = it2;
                            aVar3.put(num, p7Var3);
                            aVar2 = map4;
                            hashSet = hashSet3;
                            it2 = it3;
                        } else {
                            qe qeVar2 = this.f110700b;
                            map4 = aVar2;
                            hashSet3 = hashSet;
                            List listR = qeVar2.K0().R(p7Var3.G(), list4);
                            if (listR.isEmpty()) {
                                aVar2 = map4;
                                hashSet = hashSet3;
                            } else {
                                com.google.android.gms.internal.measurement.o7 o7Var = (com.google.android.gms.internal.measurement.o7) p7Var3.q();
                                o7Var.x();
                                o7Var.w(listR);
                                List listR2 = qeVar2.K0().R(p7Var3.E(), list4);
                                o7Var.v();
                                o7Var.u(listR2);
                                ArrayList arrayList6 = new ArrayList();
                                Iterator it12 = p7Var3.I().iterator();
                                while (it12.hasNext()) {
                                    Iterator it13 = it2;
                                    com.google.android.gms.internal.measurement.w6 w6Var2 = (com.google.android.gms.internal.measurement.w6) it12.next();
                                    Iterator it14 = it12;
                                    if (!list4.contains(Integer.valueOf(w6Var2.F()))) {
                                        arrayList6.add(w6Var2);
                                    }
                                    it2 = it13;
                                    it12 = it14;
                                }
                                it3 = it2;
                                o7Var.A();
                                o7Var.z(arrayList6);
                                ArrayList arrayList7 = new ArrayList();
                                for (com.google.android.gms.internal.measurement.r7 r7Var2 : p7Var3.K()) {
                                    if (!list4.contains(Integer.valueOf(r7Var2.F()))) {
                                        arrayList7.add(r7Var2);
                                    }
                                }
                                o7Var.C();
                                o7Var.B(arrayList7);
                                aVar3.put(num, (com.google.android.gms.internal.measurement.p7) o7Var.r());
                                aVar2 = map4;
                                hashSet = hashSet3;
                                it2 = it3;
                            }
                        }
                    }
                }
                hashSet2 = hashSet;
                map3 = aVar3;
            } else {
                hashSet2 = hashSet;
                map3 = map2;
            }
            while (r16.hasNext()) {
                num3.intValue();
                p7Var = (com.google.android.gms.internal.measurement.p7) map3.get(num3);
                bitSet = new BitSet();
                bitSet2 = new BitSet();
                aVar = new androidx.collection.a();
                if (p7Var != null && p7Var.J() != 0) {
                    while (r7.hasNext()) {
                        if (w6Var.E()) {
                            Map map110 = map3;
                            Integer numValueOf10 = Integer.valueOf(w6Var.F());
                            if (w6Var.G()) {
                                lValueOf = Long.valueOf(w6Var.H());
                            } else {
                                lValueOf = null;
                            }
                            aVar.put(numValueOf10, lValueOf);
                            map3 = map110;
                        }
                    }
                }
                Map map111 = map3;
                androidx.collection.a aVar13 = new androidx.collection.a();
                if (p7Var != null && p7Var.L() != 0) {
                    it = p7Var.K().iterator();
                    while (it.hasNext()) {
                        r7Var = (com.google.android.gms.internal.measurement.r7) it.next();
                        if (!r7Var.E() && r7Var.H() > 0) {
                            aVar13.put(Integer.valueOf(r7Var.F()), Long.valueOf(r7Var.I(r7Var.H() - 1)));
                            it = it;
                            p7Var = p7Var;
                        }
                    }
                }
                p7Var2 = p7Var;
                if (p7Var2 != null) {
                    i12 = 0;
                    while (i12 < p7Var2.F() * 64) {
                        if (ve.P(p7Var2.E(), i12)) {
                            z13 = zH;
                            this.f110184a.a().w().c("Filter already evaluated. audience ID, filter ID", num3, Integer.valueOf(i12));
                            bitSet2.set(i12);
                            if (ve.P(p7Var2.G(), i12)) {
                                bitSet.set(i12);
                            }
                            i12++;
                            zH = z13;
                        } else {
                            z13 = zH;
                        }
                        aVar.remove(Integer.valueOf(i12));
                        i12++;
                        zH = z13;
                    }
                }
                boolean z17 = zH;
                com.google.android.gms.internal.measurement.p7 p7Var7 = (com.google.android.gms.internal.measurement.p7) map2.get(num3);
                if (!zH2 && z17 && (list3 = (List) map.get(num3)) != null && this.f109901h != null && this.f109900g != null) {
                    Iterator it15 = list3.iterator();
                    while (it15.hasNext()) {
                        com.google.android.gms.internal.measurement.j4 j4Var9 = (com.google.android.gms.internal.measurement.j4) it15.next();
                        int iF = j4Var9.F();
                        Iterator it16 = it15;
                        long jLongValue = this.f109901h.longValue() / 1000;
                        if (j4Var9.N()) {
                            jLongValue = this.f109900g.longValue() / 1000;
                        }
                        Integer numValueOf11 = Integer.valueOf(iF);
                        if (aVar.containsKey(numValueOf11)) {
                            aVar.put(numValueOf11, Long.valueOf(jLongValue));
                        }
                        if (aVar13.containsKey(numValueOf11)) {
                            aVar13.put(numValueOf11, Long.valueOf(jLongValue));
                        }
                        it15 = it16;
                    }
                }
                this.f109899f.put(num3, new hf(this, this.f109897d, p7Var7, bitSet, bitSet2, aVar, aVar13, null));
                str2 = str2;
                map = map;
                str15 = str15;
                map2 = map2;
                zH = z17;
                map3 = map111;
            }
        }
        str4 = str2;
        str5 = str15;
        str6 = "Skipping failed audience ID";
        if (!list.isEmpty()) {
            jfVar = new jf(this, null);
            aVar6 = new androidx.collection.a();
            it7 = list.iterator();
            while (it7.hasNext()) {
                y6Var = (com.google.android.gms.internal.measurement.y6) it7.next();
                y6VarA = jfVar.a(this.f109897d, y6Var);
                if (y6VarA != null) {
                    qeVar = this.f110700b;
                    b0VarZ = qeVar.F0().Z(this.f109897d, y6Var, y6VarA.H());
                    qeVar.F0().w0(b0VarZ);
                    if (z10) {
                        j10 = b0VarZ.f109766c;
                        strH = y6VarA.H();
                        map7 = (Map) aVar6.get(strH);
                        if (map7 == null) {
                            tVarF2 = qeVar.F0();
                            str10 = this.f109897d;
                            tVarF2.j();
                            tVarF2.h();
                            com.google.android.gms.common.internal.w.l(str10);
                            com.google.android.gms.common.internal.w.l(strH);
                            aVar7 = new androidx.collection.a();
                            str11 = str10;
                            cursorQuery3 = tVarF2.u0().query("event_filters", new String[]{str5, str4}, "app_id=? AND event_name=?", new String[]{str10, strH}, null, null, null);
                            if (cursorQuery3.moveToFirst()) {
                                b0Var = b0VarZ;
                                while (true) {
                                    com.google.android.gms.internal.measurement.j4 j4Var10 = (com.google.android.gms.internal.measurement.j4) ((com.google.android.gms.internal.measurement.i4) ve.W(com.google.android.gms.internal.measurement.j4.Q(), cursorQuery3.getBlob(1))).r();
                                    numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                    list6 = (List) aVar7.get(numValueOf5);
                                    if (list6 == null) {
                                        cursor4 = cursorQuery3;
                                        arrayList4 = new ArrayList();
                                        aVar7.put(numValueOf5, arrayList4);
                                    } else {
                                        cursor4 = cursorQuery3;
                                        arrayList4 = list6;
                                    }
                                    arrayList4.add(j4Var10);
                                    if (!cursor4.moveToNext()) {
                                        break;
                                        break;
                                    }
                                    cursorQuery3 = cursor4;
                                }
                                cursor4.close();
                                map7 = aVar7;
                            } else {
                                b0Var = b0VarZ;
                                map7 = Collections.EMPTY_MAP;
                                cursorQuery3.close();
                            }
                            aVar6.put(strH, map7);
                        } else {
                            b0Var = b0VarZ;
                        }
                        it8 = map7.keySet().iterator();
                        while (it8.hasNext()) {
                            num2 = (Integer) it8.next();
                            iIntValue = num2.intValue();
                            if (this.f109898e.contains(num2)) {
                                this.f110184a.a().w().b("Skipping failed audience ID", num2);
                            } else {
                                it9 = ((List) map7.get(num2)).iterator();
                                zK2 = true;
                                while (true) {
                                    if (!it9.hasNext()) {
                                        map8 = map7;
                                        it10 = it8;
                                        j11 = j10;
                                        break;
                                    }
                                    com.google.android.gms.internal.measurement.j4 j4Var11 = (com.google.android.gms.internal.measurement.j4) it9.next();
                                    map8 = map7;
                                    it10 = it8;
                                    bVar = new b(this, this.f109897d, iIntValue, j4Var11);
                                    j11 = j10;
                                    zK2 = bVar.k(this.f109900g, this.f109901h, y6VarA, j11, b0Var, o(iIntValue, j4Var11.F()));
                                    if (!zK2) {
                                        this.f109898e.add(num2);
                                        break;
                                    }
                                    n(num2).a(bVar);
                                    j10 = j11;
                                    map7 = map8;
                                    it8 = it10;
                                }
                                if (!zK2) {
                                    this.f109898e.add(num2);
                                }
                                j10 = j11;
                                map7 = map8;
                                it8 = it10;
                            }
                        }
                        it7 = it7;
                        jfVar = jfVar;
                    } else {
                        continue;
                    }
                }
            }
        }
        if (!z10) {
            return new ArrayList();
        }
        if (!list2.isEmpty()) {
            aVar4 = new androidx.collection.a();
            it4 = list2.iterator();
            while (it4.hasNext()) {
                com.google.android.gms.internal.measurement.b8 b8Var4 = (com.google.android.gms.internal.measurement.b8) it4.next();
                strG = b8Var4.G();
                map5 = (Map) aVar4.get(strG);
                if (map5 == null) {
                    tVarF1 = this.f110700b.F0();
                    str8 = this.f109897d;
                    tVarF1.j();
                    tVarF1.h();
                    com.google.android.gms.common.internal.w.l(str8);
                    com.google.android.gms.common.internal.w.l(strG);
                    aVar5 = new androidx.collection.a();
                    cursorQuery2 = tVarF1.u0().query("property_filters", new String[]{str5, str4}, "app_id=? AND property_name=?", new String[]{str8, strG}, null, null, null);
                    if (cursorQuery2.moveToFirst()) {
                        while (true) {
                            com.google.android.gms.internal.measurement.r4 r4Var5 = (com.google.android.gms.internal.measurement.r4) ((com.google.android.gms.internal.measurement.q4) ve.W(com.google.android.gms.internal.measurement.r4.M(), cursorQuery2.getBlob(1))).r();
                            numValueOf4 = Integer.valueOf(cursorQuery2.getInt(0));
                            list5 = (List) aVar5.get(numValueOf4);
                            if (list5 == null) {
                                it5 = it4;
                                arrayList3 = new ArrayList();
                                aVar5.put(numValueOf4, arrayList3);
                            } else {
                                it5 = it4;
                                arrayList3 = list5;
                            }
                            arrayList3.add(r4Var5);
                            str9 = str8;
                            if (!cursorQuery2.moveToNext()) {
                                break;
                                break;
                            }
                            it4 = it5;
                            str8 = str9;
                        }
                        cursorQuery2.close();
                        map5 = aVar5;
                    } else {
                        it5 = it4;
                        map5 = Collections.EMPTY_MAP;
                        cursorQuery2.close();
                    }
                    aVar4.put(strG, map5);
                } else {
                    it5 = it4;
                }
                while (r4.hasNext()) {
                    int iIntValue9 = num4.intValue();
                    if (this.f109898e.contains(num4)) {
                        this.f110184a.a().w().b(str6, num4);
                        break;
                        break;
                    }
                    it6 = ((List) map5.get(num4)).iterator();
                    zK = true;
                    while (true) {
                        if (it6.hasNext()) {
                            r4Var = (com.google.android.gms.internal.measurement.r4) it6.next();
                            h7Var = this.f110184a;
                            map6 = map5;
                            if (Log.isLoggable(h7Var.a().z(), 2)) {
                                u5 u5VarW5 = h7Var.a().w();
                                if (r4Var.E()) {
                                    numValueOf3 = Integer.valueOf(r4Var.F());
                                } else {
                                    numValueOf3 = null;
                                }
                                u5VarW5.d("Evaluating filter. audience, filter, property", num4, numValueOf3, h7Var.D().c(r4Var.G()));
                                h7Var.a().w().b("Filter definition", this.f110700b.K0().M(r4Var));
                            }
                            if (r4Var.E() || r4Var.F() > 256) {
                                u5 u5VarR5 = h7Var.a().r();
                                Object objX5 = w5.x(this.f109897d);
                                if (r4Var.E()) {
                                    numValueOf2 = Integer.valueOf(r4Var.F());
                                } else {
                                    numValueOf2 = null;
                                }
                                u5VarR5.c("Invalid property filter ID. appId, id", objX5, String.valueOf(numValueOf2));
                                this.f109898e.add(num4);
                                map5 = map6;
                                aVar4 = aVar4;
                                str6 = str6;
                            } else {
                                dVar = new d(this, this.f109897d, iIntValue9, r4Var);
                                zK = dVar.k(this.f109900g, this.f109901h, b8Var4, o(iIntValue9, r4Var.F()));
                                if (zK) {
                                    n(num4).a(dVar);
                                    map5 = map6;
                                    aVar4 = aVar4;
                                    str6 = str6;
                                } else {
                                    this.f109898e.add(num4);
                                }
                            }
                        } else {
                            map6 = map5;
                            str6 = str6;
                            aVar4 = aVar4;
                        }
                        if (!zK) {
                            this.f109898e.add(num4);
                        }
                        map5 = map6;
                        aVar4 = aVar4;
                        str6 = str6;
                    }
                }
                it4 = it5;
            }
        }
        arrayList2 = new ArrayList();
        Set<Integer> setKeySet4 = this.f109899f.keySet();
        setKeySet4.removeAll(this.f109898e);
        while (r3.hasNext()) {
            int iIntValue10 = num5.intValue();
            hf hfVar4 = (hf) this.f109899f.get(num5);
            com.google.android.gms.common.internal.w.r(hfVar4);
            com.google.android.gms.internal.measurement.m6 m6VarB4 = hfVar4.b(iIntValue10);
            arrayList2.add(m6VarB4);
            tVarF0 = this.f110700b.F0();
            str7 = this.f109897d;
            com.google.android.gms.internal.measurement.p7 p7VarG4 = m6VarB4.G();
            tVarF0.j();
            tVarF0.h();
            com.google.android.gms.common.internal.w.l(str7);
            com.google.android.gms.common.internal.w.r(p7VarG4);
            byte[] bArrG4 = p7VarG4.g();
            contentValues = new ContentValues();
            contentValues.put("app_id", str7);
            contentValues.put(str5, num5);
            contentValues.put("current_results", bArrG4);
            if (tVarF0.u0().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                tVarF0.f110184a.a().o().b("Failed to insert filter results (got -1). appId", w5.x(str7));
            }
        }
        return arrayList2;
    }
}
