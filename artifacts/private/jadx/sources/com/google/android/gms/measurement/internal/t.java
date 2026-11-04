package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.devtodev.analytics.internal.storage.sqlite.EventEntry;
import com.google.android.gms.internal.measurement.fg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class t extends be {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String[] f110498f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String[] f110499g = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String[] f110500h = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String[] f110501i = {io.sentry.protocol.a.b.f306114f, "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;"};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String[] f110502j = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String[] f110503k = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String[] f110504l = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String[] f110505m = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String[] f110506n = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String[] f110507o = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String[] f110508p = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s f110509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final td f110510e;

    t(qe qeVar) {
        super(qeVar);
        this.f110510e = new td(this.f110184a.e());
        this.f110184a.w();
        this.f110509d = new s(this, this.f110184a.d(), "google_app_measurement.db");
    }

    @androidx.annotation.m1
    private final String M(String str, String[] strArr, String str2) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = u0().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return "";
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e10) {
                this.f110184a.a().o().c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    @androidx.annotation.m1
    private final void N(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase sQLiteDatabaseU0 = u0();
            String asString = contentValues.getAsString("app_id");
            if (asString == null) {
                this.f110184a.a().q().b("Value of the primary key is not set.", w5.x("app_id"));
                return;
            }
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append("app_id");
            sb2.append(" = ?");
            if (sQLiteDatabaseU0.update("consent_settings", contentValues, sb2.toString(), new String[]{asString}) == 0 && sQLiteDatabaseU0.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                this.f110184a.a().o().c("Failed to insert/update table (got -1). key", w5.x("consent_settings"), w5.x("app_id"));
            }
        } catch (SQLiteException e10) {
            this.f110184a.a().o().d("Error storing into table. key", w5.x("consent_settings"), w5.x("app_id"), e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0136  */
    @androidx.annotation.m1
    private final b0 O(String str, String str2, String str3) throws Throwable {
        Cursor cursorQuery;
        Boolean boolValueOf;
        com.google.android.gms.common.internal.w.l(str2);
        com.google.android.gms.common.internal.w.l(str3);
        h();
        j();
        Cursor cursor = null;
        try {
            cursorQuery = u0().query(str, (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j10 = cursorQuery.getLong(0);
                        long j11 = cursorQuery.getLong(1);
                        long j12 = cursorQuery.getLong(2);
                        long j13 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                        Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                        Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                        Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                        if (cursorQuery.isNull(7)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                        }
                        b0 b0Var = new b0(str2, str3, j10, j11, cursorQuery.isNull(8) ? 0L : cursorQuery.getLong(8), j12, j13, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                        if (cursorQuery.moveToNext()) {
                            this.f110184a.a().o().b("Got multiple records for event aggregates, expected one. appId", w5.x(str2));
                        }
                        cursorQuery.close();
                        return b0Var;
                    }
                } catch (SQLiteException e10) {
                    e = e10;
                    h7 h7Var = this.f110184a;
                    h7Var.a().o().d("Error querying events. appId", w5.x(str2), h7Var.D().a(str3), e);
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    @androidx.annotation.m1
    private final void P(String str, b0 b0Var) {
        com.google.android.gms.common.internal.w.r(b0Var);
        h();
        j();
        ContentValues contentValues = new ContentValues();
        String str2 = b0Var.f109764a;
        contentValues.put("app_id", str2);
        contentValues.put("name", b0Var.f109765b);
        contentValues.put("lifetime_count", Long.valueOf(b0Var.f109766c));
        contentValues.put("current_bundle_count", Long.valueOf(b0Var.f109767d));
        contentValues.put("last_fire_timestamp", Long.valueOf(b0Var.f109769f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(b0Var.f109770g));
        contentValues.put("last_bundled_day", b0Var.f109771h);
        contentValues.put("last_sampled_complex_event_id", b0Var.f109772i);
        contentValues.put("last_sampling_rate", b0Var.f109773j);
        contentValues.put("current_session_count", Long.valueOf(b0Var.f109768e));
        Boolean bool = b0Var.f109774k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (u0().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                this.f110184a.a().o().b("Failed to insert/update event aggregates (got -1). appId", w5.x(str2));
            }
        } catch (SQLiteException e10) {
            this.f110184a.a().o().c("Error storing event aggregates. appId", w5.x(b0Var.f109764a), e10);
        }
    }

    private final void Q(String str, String str2) {
        com.google.android.gms.common.internal.w.l(str2);
        h();
        j();
        try {
            u0().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e10) {
            this.f110184a.a().o().c("Error deleting snapshot. appId", w5.x(str2), e10);
        }
    }

    private final te R(String str, long j10, byte[] bArr, String str2, String str3, int i10, int i11, long j11, long j12, long j13) {
        if (TextUtils.isEmpty(str2)) {
            this.f110184a.a().v().a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            com.google.android.gms.internal.measurement.f7 f7Var = (com.google.android.gms.internal.measurement.f7) ve.W(com.google.android.gms.internal.measurement.i7.L(), bArr);
            cb cbVarB = cb.b(i10);
            if (cbVarB != cb.GOOGLE_SIGNAL && cbVarB != cb.GOOGLE_SIGNAL_PENDING && i11 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = f7Var.u().iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.measurement.j7 j7Var = (com.google.android.gms.internal.measurement.j7) ((com.google.android.gms.internal.measurement.k7) it.next()).q();
                    j7Var.C0(i11);
                    arrayList.add((com.google.android.gms.internal.measurement.k7) j7Var.r());
                }
                f7Var.B();
                f7Var.A(arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                for (String str4 : str3.split("\r\n")) {
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit = str4.split("=", 2);
                    if (strArrSplit.length != 2) {
                        this.f110184a.a().o().b("Invalid upload header: ", str4);
                        break;
                    }
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            se seVar = new se();
            seVar.b(j10);
            seVar.c((com.google.android.gms.internal.measurement.i7) f7Var.r());
            seVar.d(str2);
            seVar.e(map);
            seVar.f(cbVarB);
            seVar.g(j11);
            seVar.h(j12);
            seVar.i(j13);
            seVar.j(i11);
            return seVar.a();
        } catch (IOException e10) {
            this.f110184a.a().o().c("Failed to queued MeasurementBatch from upload_queue. appId", str, e10);
            return null;
        }
    }

    private final String S() {
        h7 h7Var = this.f110184a;
        long jCurrentTimeMillis = h7Var.e().currentTimeMillis();
        Locale locale = Locale.US;
        cb cbVar = cb.GOOGLE_SIGNAL;
        Integer numValueOf = Integer.valueOf(cbVar.a());
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        h7Var.w();
        Long l10 = (Long) z4.T.b(null);
        l10.longValue();
        String str = String.format(locale, "(upload_type = %d AND ABS(creation_timestamp - %d) > %d)", numValueOf, lValueOf, l10);
        Integer numValueOf2 = Integer.valueOf(cbVar.a());
        h7Var.w();
        String str2 = String.format(locale, "(upload_type != %d AND ABS(creation_timestamp - %d) > %d)", numValueOf2, lValueOf, Long.valueOf(k.q()));
        StringBuilder sb2 = new StringBuilder(str.length() + 5 + str2.length() + 1);
        sb2.append("(");
        sb2.append(str);
        sb2.append(" OR ");
        sb2.append(str2);
        sb2.append(")");
        return sb2.toString();
    }

    private static final String T(List list) {
        return list.isEmpty() ? "" : String.format(" AND (upload_type IN (%s))", TextUtils.join(", ", list));
    }

    @androidx.annotation.m1
    static final void o0(ContentValues contentValues, String str, Object obj) {
        com.google.android.gms.common.internal.w.l("value");
        com.google.android.gms.common.internal.w.r(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    @androidx.annotation.m1
    private final long p0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = u0().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j10 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j10;
            } catch (SQLiteException e10) {
                this.f110184a.a().o().c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    @androidx.annotation.m1
    private final long q0(String str, String[] strArr, long j10) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = u0().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j10 = cursorRawQuery.getLong(0);
                }
                cursorRawQuery.close();
                return j10;
            } catch (SQLiteException e10) {
                this.f110184a.a().o().c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    @androidx.annotation.m1
    public final long A() {
        return q0("select max(timestamp) from raw_events", null, 0L);
    }

    @androidx.annotation.m1
    public final boolean A0(xe xeVar) {
        com.google.android.gms.common.internal.w.r(xeVar);
        h();
        j();
        String str = xeVar.f110701a;
        String str2 = xeVar.f110703c;
        if (B0(str, str2) == null) {
            if (ze.r0(str2)) {
                if (p0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= this.f110184a.w().F(str, z4.W, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(str2)) {
                long jP0 = p0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, xeVar.f110702b});
                this.f110184a.w();
                if (jP0 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", xeVar.f110702b);
        contentValues.put("name", str2);
        contentValues.put("set_timestamp", Long.valueOf(xeVar.f110704d));
        o0(contentValues, "value", xeVar.f110705e);
        try {
            if (u0().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            this.f110184a.a().o().b("Failed to insert/update user property (got -1). appId", w5.x(str));
            return true;
        } catch (SQLiteException e10) {
            this.f110184a.a().o().c("Error storing user property. appId", w5.x(xeVar.f110701a), e10);
            return true;
        }
    }

    public final boolean B() {
        return p0("select count(1) > 0 from raw_events", null) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00bd  */
    @androidx.annotation.m1
    public final xe B0(String str, String str2) {
        Throwable th2;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursorQuery;
        com.google.android.gms.common.internal.w.l(str);
        com.google.android.gms.common.internal.w.l(str2);
        h();
        j();
        Cursor cursor = null;
        try {
            int i10 = 0 >> 0;
            cursorQuery = u0().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j10 = cursorQuery.getLong(0);
                        Object objX = x(cursorQuery, 1);
                        if (objX != null) {
                            str3 = str;
                            str4 = str2;
                            try {
                                xe xeVar = new xe(str3, cursorQuery.getString(2), str4, j10, objX);
                                if (cursorQuery.moveToNext()) {
                                    this.f110184a.a().o().b("Got multiple records for user property, expected one. appId", w5.x(str3));
                                }
                                cursorQuery.close();
                                return xeVar;
                            } catch (SQLiteException e10) {
                                e = e10;
                            }
                        }
                        sQLiteException = e;
                        h7 h7Var = this.f110184a;
                        h7Var.a().o().d("Error querying user property. appId", w5.x(str3), h7Var.D().c(str4), sQLiteException);
                    }
                } catch (SQLiteException e11) {
                    e = e11;
                    str3 = str;
                    str4 = str2;
                }
            } catch (Throwable th3) {
                th2 = th3;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th2;
            }
        } catch (SQLiteException e12) {
            str3 = str;
            str4 = str2;
            sQLiteException = e12;
            cursorQuery = null;
        } catch (Throwable th4) {
            th2 = th4;
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final boolean C(String str, String str2) {
        return p0("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    @androidx.annotation.m1
    public final List C0(String str) {
        String str2;
        com.google.android.gms.common.internal.w.l(str);
        h();
        j();
        List arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                h7 h7Var = this.f110184a;
                h7Var.w();
                cursorQuery = u0().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                try {
                    if (cursorQuery.moveToFirst()) {
                        while (true) {
                            String string = cursorQuery.getString(0);
                            String string2 = cursorQuery.getString(1);
                            if (string2 == null) {
                                string2 = "";
                            }
                            String str3 = string2;
                            long j10 = cursorQuery.getLong(2);
                            Object objX = x(cursorQuery, 3);
                            if (objX == null) {
                                h7Var.a().o().b("Read invalid user property value, ignoring it. appId", w5.x(str));
                                str2 = str;
                            } else {
                                str2 = str;
                                arrayList.add(new xe(str2, str3, string, j10, objX));
                            }
                            try {
                                if (!cursorQuery.moveToNext()) {
                                    break;
                                }
                                str = str2;
                            } catch (SQLiteException e10) {
                                e = e10;
                                this.f110184a.a().o().c("Error querying user properties. appId", w5.x(str2), e);
                                arrayList = Collections.EMPTY_LIST;
                            }
                        }
                    }
                } catch (SQLiteException e11) {
                    e = e11;
                    str2 = str;
                }
            } finally {
                if (0 != 0) {
                    cursorQuery.close();
                }
            }
        } catch (SQLiteException e12) {
            e = e12;
            str2 = str;
        }
        if (cursorQuery != null) {
        }
        return arrayList;
    }

    public final boolean D() {
        return p0("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0155  */
    /* JADX WARN: Code duplicated, block: B:53:0x015c  */
    @androidx.annotation.m1
    public final List D0(String str, String str2, String str3) throws Throwable {
        Cursor cursor;
        String str4;
        Cursor cursorQuery;
        String str5;
        com.google.android.gms.common.internal.w.l(str);
        h();
        j();
        List arrayList = new ArrayList();
        try {
            try {
                ArrayList arrayList2 = new ArrayList(3);
                String str6 = str;
                arrayList2.add(str6);
                StringBuilder sb2 = new StringBuilder("app_id=?");
                if (TextUtils.isEmpty(str2)) {
                    str4 = str2;
                } else {
                    str4 = str2;
                    try {
                        arrayList2.add(str4);
                        sb2.append(" and origin=?");
                    } catch (SQLiteException e10) {
                        e = e10;
                        cursor = null;
                        try {
                            this.f110184a.a().o().d("(2)Error querying user properties", w5.x(str), str4, e);
                            arrayList = Collections.EMPTY_LIST;
                            cursorQuery = cursor;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return arrayList;
                        } catch (Throwable th2) {
                            th = th2;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                }
                if (!TextUtils.isEmpty(str3)) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 1);
                    sb3.append(str3);
                    sb3.append("*");
                    arrayList2.add(sb3.toString());
                    sb2.append(" and name glob ?");
                }
                String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                String string = sb2.toString();
                h7 h7Var = this.f110184a;
                h7Var.w();
                cursorQuery = u0().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, string, strArr, null, null, "rowid", "1001");
                try {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            while (true) {
                                int size = arrayList.size();
                                h7Var.w();
                                if (size >= 1000) {
                                    u5 u5VarO = h7Var.a().o();
                                    h7Var.w();
                                    u5VarO.b("Read more than the max allowed user properties, ignoring excess", 1000);
                                    break;
                                }
                                String string2 = cursorQuery.getString(0);
                                long j10 = cursorQuery.getLong(1);
                                Object objX = x(cursorQuery, 2);
                                String string3 = cursorQuery.getString(3);
                                if (objX == null) {
                                    try {
                                        h7Var.a().o().d("(2)Read invalid user property value, ignoring it", w5.x(str6), string3, str3);
                                        str5 = string3;
                                    } catch (SQLiteException e11) {
                                        e = e11;
                                        str5 = string3;
                                        cursor = cursorQuery;
                                        str4 = str5;
                                        this.f110184a.a().o().d("(2)Error querying user properties", w5.x(str), str4, e);
                                        arrayList = Collections.EMPTY_LIST;
                                        cursorQuery = cursor;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        return arrayList;
                                    }
                                } else {
                                    str5 = string3;
                                    arrayList.add(new xe(str6, str5, string2, j10, objX));
                                }
                                try {
                                    if (!cursorQuery.moveToNext()) {
                                        break;
                                    }
                                    str6 = str;
                                    str4 = str5;
                                } catch (SQLiteException e12) {
                                    e = e12;
                                    cursor = cursorQuery;
                                    str4 = str5;
                                    this.f110184a.a().o().d("(2)Error querying user properties", w5.x(str), str4, e);
                                    arrayList = Collections.EMPTY_LIST;
                                    cursorQuery = cursor;
                                }
                            }
                        }
                    } catch (SQLiteException e13) {
                        e = e13;
                        cursor = cursorQuery;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return arrayList;
                } catch (Throwable th3) {
                    th = th3;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e14) {
                e = e14;
                str4 = str2;
            }
        } catch (Throwable th4) {
            th = th4;
            cursor = null;
        }
    }

    public final long E(String str) {
        com.google.android.gms.common.internal.w.l(str);
        return q0("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    @androidx.annotation.m1
    public final boolean E0(zzah zzahVar) {
        com.google.android.gms.common.internal.w.r(zzahVar);
        h();
        j();
        String str = zzahVar.f110845a;
        com.google.android.gms.common.internal.w.r(str);
        if (B0(str, zzahVar.f110847c.f110875b) == null) {
            long jP0 = p0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.f110184a.w();
            if (jP0 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzahVar.f110846b);
        contentValues.put("name", zzahVar.f110847c.f110875b);
        o0(contentValues, "value", com.google.android.gms.common.internal.w.r(zzahVar.f110847c.O1()));
        contentValues.put("active", Boolean.valueOf(zzahVar.f110849e));
        contentValues.put(n6.a.C2338a.f332736d, zzahVar.f110850f);
        contentValues.put(n6.a.C2338a.f332737e, Long.valueOf(zzahVar.f110852h));
        h7 h7Var = this.f110184a;
        contentValues.put("timed_out_event", h7Var.C().T(zzahVar.f110851g));
        contentValues.put(n6.a.C2338a.f332745m, Long.valueOf(zzahVar.f110848d));
        contentValues.put("triggered_event", h7Var.C().T(zzahVar.f110853i));
        contentValues.put(n6.a.C2338a.f332747o, Long.valueOf(zzahVar.f110847c.f110876c));
        contentValues.put(n6.a.C2338a.f332742j, Long.valueOf(zzahVar.f110854j));
        contentValues.put("expired_event", h7Var.C().T(zzahVar.f110855k));
        try {
            if (u0().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                h7Var.a().o().b("Failed to insert/update conditional user property (got -1)", w5.x(str));
            }
        } catch (SQLiteException e10) {
            this.f110184a.a().o().c("Error storing conditional user property", w5.x(str), e10);
        }
        return true;
    }

    public final boolean F(String str, Long l10, long j10, com.google.android.gms.internal.measurement.y6 y6Var) {
        h();
        j();
        com.google.android.gms.common.internal.w.r(y6Var);
        com.google.android.gms.common.internal.w.l(str);
        com.google.android.gms.common.internal.w.r(l10);
        h7 h7Var = this.f110184a;
        byte[] bArrG = y6Var.g();
        h7Var.a().w().c("Saving complex main event, appId, data size", h7Var.D().a(str), Integer.valueOf(bArrG.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", bArrG);
        try {
            if (u0().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            h7Var.a().o().b("Failed to insert complex main event (got -1). appId", w5.x(str));
            return false;
        } catch (SQLiteException e10) {
            this.f110184a.a().o().c("Error storing complex main event. appId", w5.x(str), e10);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0129  */
    @androidx.annotation.m1
    public final zzah F0(String str, String str2) throws Throwable {
        String str3;
        Cursor cursorQuery;
        com.google.android.gms.common.internal.w.l(str);
        com.google.android.gms.common.internal.w.l(str2);
        h();
        j();
        Cursor cursor = null;
        try {
            cursorQuery = u0().query("conditional_properties", new String[]{"origin", "value", "active", n6.a.C2338a.f332736d, n6.a.C2338a.f332737e, "timed_out_event", n6.a.C2338a.f332745m, "triggered_event", n6.a.C2338a.f332747o, n6.a.C2338a.f332742j, "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str4 = string;
                    Object objX = x(cursorQuery, 1);
                    boolean z10 = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j10 = cursorQuery.getLong(4);
                    qe qeVar = this.f110700b;
                    ve veVarK0 = qeVar.K0();
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<zzbg> creator = zzbg.CREATOR;
                    zzbg zzbgVar = (zzbg) veVarK0.N(blob, creator);
                    str3 = str2;
                    try {
                        zzah zzahVar = new zzah(str, str4, new zzpl(str3, cursorQuery.getLong(8), objX, str4), cursorQuery.getLong(6), z10, string2, zzbgVar, j10, (zzbg) qeVar.K0().N(cursorQuery.getBlob(7), creator), cursorQuery.getLong(9), (zzbg) qeVar.K0().N(cursorQuery.getBlob(10), creator));
                        if (cursorQuery.moveToNext()) {
                            h7 h7Var = this.f110184a;
                            h7Var.a().o().c("Got multiple records for conditional property, expected one", w5.x(str), h7Var.D().c(str3));
                        }
                        cursorQuery.close();
                        return zzahVar;
                    } catch (SQLiteException e10) {
                        e = e10;
                    }
                } catch (SQLiteException e11) {
                    e = e11;
                    str3 = str2;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e12) {
            e = e12;
            str3 = str2;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
        }
        h7 h7Var2 = this.f110184a;
        h7Var2.a().o().d("Error querying conditional property", w5.x(str), h7Var2.D().c(str3), e);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009b  */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x007a: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:19:0x007a */
    public final Bundle G(String str) throws Throwable {
        Cursor cursorRawQuery;
        Cursor cursor;
        h();
        j();
        Cursor cursor2 = null;
        try {
            try {
                cursorRawQuery = u0().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        try {
                            com.google.android.gms.internal.measurement.y6 y6Var = (com.google.android.gms.internal.measurement.y6) ((com.google.android.gms.internal.measurement.x6) ve.W(com.google.android.gms.internal.measurement.y6.O(), cursorRawQuery.getBlob(0))).r();
                            this.f110700b.K0();
                            Bundle bundleQ = ve.q(y6Var.E());
                            cursorRawQuery.close();
                            return bundleQ;
                        } catch (IOException e10) {
                            this.f110184a.a().o().c("Failed to retrieve default event parameters. appId", w5.x(str), e10);
                        }
                    } else {
                        this.f110184a.a().w().a("Default event parameters not found");
                    }
                } catch (SQLiteException e11) {
                    e = e11;
                    this.f110184a.a().o().b("Error selecting default event parameters", e);
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e12) {
            e = e12;
            cursorRawQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return null;
    }

    @androidx.annotation.m1
    public final int G0(String str, String str2) {
        com.google.android.gms.common.internal.w.l(str);
        com.google.android.gms.common.internal.w.l(str2);
        h();
        j();
        try {
            return u0().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            h7 h7Var = this.f110184a;
            h7Var.a().o().d("Error deleting conditional property", w5.x(str), h7Var.D().c(str2), e10);
            return 0;
        }
    }

    final boolean H(String str, long j10) {
        try {
            return q0("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j10)}, 0L) <= 0 && q0("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j10)}, 0L) > 0;
        } catch (SQLiteException e10) {
            this.f110184a.a().o().b("Error checking backfill conditions", e10);
            return false;
        }
    }

    @androidx.annotation.m1
    public final List H0(String str, String str2, String str3) {
        com.google.android.gms.common.internal.w.l(str);
        h();
        j();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb2.append(" and name glob ?");
        }
        return I0(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x002e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:? A[LOOP:2: B:51:0x010b->B:120:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0103  */
    /* JADX WARN: Code duplicated, block: B:53:0x0111  */
    public final void I(String str, Long l10, String str2, Bundle bundle) {
        h7 h7Var;
        Bundle bundle2;
        a0 a0Var;
        long j10;
        String str3;
        ContentValues contentValues;
        com.google.android.gms.internal.measurement.k7 k7Var;
        Iterator it;
        String str4 = str;
        com.google.android.gms.common.internal.w.r(bundle);
        h();
        j();
        r rVar = l10 != null ? new r(this, str4, l10.longValue()) : new r(this, str4);
        List<q> listA = rVar.a();
        while (!listA.isEmpty()) {
            for (q qVar : listA) {
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        Cursor cursor = null;
                        com.google.android.gms.internal.measurement.k7 k7Var2 = null;
                        Cursor cursor2 = null;
                        try {
                            try {
                                Cursor cursorQuery = u0().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str4, Long.toString(qVar.f110371b)}, null, null, "rowid", "2");
                                try {
                                    try {
                                        if (cursorQuery.moveToFirst()) {
                                            try {
                                                k7Var = (com.google.android.gms.internal.measurement.k7) ((com.google.android.gms.internal.measurement.j7) ve.W(com.google.android.gms.internal.measurement.k7.j0(), cursorQuery.getBlob(0))).r();
                                                try {
                                                    if (cursorQuery.moveToNext()) {
                                                        this.f110184a.a().r().b("Get multiple raw event metadata records, expected one. appId", w5.x(str4));
                                                    }
                                                    cursorQuery.close();
                                                    cursorQuery.close();
                                                } catch (SQLiteException e10) {
                                                    e = e10;
                                                    cursor = cursorQuery;
                                                    this.f110184a.a().o().c("Data loss. Error selecting raw event. appId", w5.x(str4), e);
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                }
                                                k7Var2 = k7Var;
                                            } catch (IOException e11) {
                                                this.f110184a.a().o().c("Data loss. Failed to merge raw event metadata. appId", w5.x(str4), e11);
                                                cursorQuery.close();
                                            }
                                            if (k7Var2 != null) {
                                                it = k7Var2.m2().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        if (((com.google.android.gms.internal.measurement.b8) it.next()).G().equals(str2)) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            this.f110184a.a().o().b("Raw event metadata record is missing. appId", w5.x(str4));
                                        }
                                        cursorQuery.close();
                                    } catch (SQLiteException e12) {
                                        e = e12;
                                        k7Var = null;
                                    }
                                    if (k7Var2 != null) {
                                        it = k7Var2.m2().iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                if (((com.google.android.gms.internal.measurement.b8) it.next()).G().equals(str2)) {
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor2 = cursorQuery;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (SQLiteException e13) {
                            e = e13;
                            k7Var = null;
                        }
                    }
                    long jUpdate = u0().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j10)});
                    if (jUpdate != 1) {
                        h7Var.a().o().c("Failed to update raw event. appId, updatedRows", w5.x(str3), Long.valueOf(jUpdate));
                    }
                } catch (SQLiteException e14) {
                    this.f110184a.a().o().c("Error updating raw event. appId", w5.x(a0Var.f109730a), e14);
                }
                qe qeVar = this.f110700b;
                ve veVarK0 = qeVar.K0();
                com.google.android.gms.internal.measurement.y6 y6Var = qVar.f110373d;
                Bundle bundle3 = new Bundle();
                for (com.google.android.gms.internal.measurement.c7 c7Var : y6Var.E()) {
                    if (c7Var.M()) {
                        bundle3.putDouble(c7Var.F(), c7Var.N());
                    } else if (c7Var.K()) {
                        bundle3.putFloat(c7Var.F(), c7Var.L());
                    } else if (c7Var.I()) {
                        bundle3.putLong(c7Var.F(), c7Var.J());
                    } else if (c7Var.G()) {
                        bundle3.putString(c7Var.F(), c7Var.H());
                    } else if (c7Var.O().isEmpty()) {
                        veVarK0.f110184a.a().o().b("Unexpected parameter type for parameter", c7Var);
                    } else {
                        bundle3.putParcelableArray(c7Var.F(), ve.Y(c7Var.O()));
                    }
                }
                String string = bundle3.getString("_o");
                bundle3.remove("_o");
                String strH = y6Var.H();
                if (string == null) {
                    string = "";
                }
                x5 x5Var = new x5(strH, string, bundle3, y6Var.J());
                h7Var = this.f110184a;
                Bundle bundle4 = x5Var.f110667d;
                String str5 = x5Var.f110664a;
                ze zeVarC = h7Var.C();
                if (str5.equals(com.google.firebase.messaging.e.f.f123542l)) {
                    bundle2 = new Bundle(bundle);
                    for (String str6 : bundle.keySet()) {
                        qe qeVar2 = qeVar;
                        if (str6.startsWith("gad_")) {
                            bundle2.remove(str6);
                        }
                        qeVar = qeVar2;
                    }
                } else {
                    bundle2 = bundle;
                }
                qe qeVar3 = qeVar;
                zeVarC.w(bundle4, bundle2);
                a0Var = new a0(this.f110184a, x5Var.f110665b, str4, y6Var.H(), y6Var.J(), y6Var.L(), bundle4);
                j10 = qVar.f110370a;
                long j11 = qVar.f110371b;
                boolean z10 = qVar.f110372c;
                h();
                j();
                com.google.android.gms.common.internal.w.r(a0Var);
                str3 = a0Var.f109730a;
                com.google.android.gms.common.internal.w.l(str3);
                byte[] bArrG = qeVar3.K0().J(a0Var).g();
                contentValues = new ContentValues();
                contentValues.put("app_id", str3);
                contentValues.put("name", a0Var.f109731b);
                contentValues.put("timestamp", Long.valueOf(a0Var.f109733d));
                contentValues.put("metadata_fingerprint", Long.valueOf(j11));
                contentValues.put("data", bArrG);
                contentValues.put("realtime", Integer.valueOf(z10 ? 1 : 0));
                str4 = str;
            }
            listA = rVar.a();
            str4 = str;
        }
    }

    public final List I0(String str, String[] strArr) {
        h();
        j();
        List arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseU0 = u0();
                String[] strArr2 = {"app_id", "origin", "name", "value", "active", n6.a.C2338a.f332736d, n6.a.C2338a.f332737e, "timed_out_event", n6.a.C2338a.f332745m, "triggered_event", n6.a.C2338a.f332747o, n6.a.C2338a.f332742j, "expired_event"};
                h7 h7Var = this.f110184a;
                h7Var.w();
                cursorQuery = sQLiteDatabaseU0.query("conditional_properties", strArr2, str, strArr, null, null, "rowid", "1001");
                if (cursorQuery.moveToFirst()) {
                    do {
                        int size = arrayList.size();
                        h7Var.w();
                        if (size >= 1000) {
                            u5 u5VarO = h7Var.a().o();
                            h7Var.w();
                            u5VarO.b("Read more than the max allowed conditional properties, ignoring extra", 1000);
                            break;
                        }
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        String string3 = cursorQuery.getString(2);
                        Object objX = x(cursorQuery, 3);
                        boolean z10 = cursorQuery.getInt(4) != 0;
                        String string4 = cursorQuery.getString(5);
                        long j10 = cursorQuery.getLong(6);
                        qe qeVar = this.f110700b;
                        ve veVarK0 = qeVar.K0();
                        byte[] blob = cursorQuery.getBlob(7);
                        Parcelable.Creator<zzbg> creator = zzbg.CREATOR;
                        zzbg zzbgVar = (zzbg) veVarK0.N(blob, creator);
                        arrayList.add(new zzah(string, string2, new zzpl(string3, cursorQuery.getLong(10), objX, string2), cursorQuery.getLong(8), z10, string4, zzbgVar, j10, (zzbg) qeVar.K0().N(cursorQuery.getBlob(9), creator), cursorQuery.getLong(11), (zzbg) qeVar.K0().N(cursorQuery.getBlob(12), creator)));
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e10) {
                this.f110184a.a().o().b("Error querying conditional user property value", e10);
                arrayList = Collections.EMPTY_LIST;
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x0075  */
    public final r8 J(String str) {
        SQLiteException e10;
        Cursor cursorRawQuery;
        com.google.android.gms.common.internal.w.r(str);
        h();
        j();
        Cursor cursor = null;
        r8VarF = null;
        r8VarF = null;
        r8 r8VarF = null;
        try {
            cursorRawQuery = u0().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str});
            try {
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        r8VarF = r8.f(cursorRawQuery.getString(0), cursorRawQuery.getInt(1));
                    } else {
                        this.f110184a.a().w().a("No data found");
                    }
                } catch (SQLiteException e11) {
                    e10 = e11;
                    this.f110184a.a().o().b("Error querying database.", e10);
                    if (cursorRawQuery != null) {
                    }
                    return r8VarF == null ? r8.f110439c : r8VarF;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorRawQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e12) {
            e10 = e12;
            cursorRawQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        cursorRawQuery.close();
        if (r8VarF == null) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:93:0x0327  */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0304: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:83:0x0304 */
    @androidx.annotation.m1
    public final c6 J0(String str) {
        Cursor cursorQuery;
        Cursor cursor;
        Boolean boolValueOf;
        com.google.android.gms.common.internal.w.l(str);
        h();
        j();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = u0().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", io.sentry.protocol.a.b.f306114f, "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        qe qeVar = this.f110700b;
                        c6 c6Var = new c6(qeVar.g0(), str);
                        r8 r8VarG = qeVar.g(str);
                        q8 q8Var = q8.ANALYTICS_STORAGE;
                        if (r8VarG.o(q8Var)) {
                            c6Var.q0(cursorQuery.getString(0));
                        }
                        c6Var.s0(cursorQuery.getString(1));
                        if (qeVar.g(str).o(q8.AD_STORAGE)) {
                            c6Var.w0(cursorQuery.getString(2));
                        }
                        c6Var.f(cursorQuery.getLong(3));
                        c6Var.A0(cursorQuery.getLong(4));
                        c6Var.C0(cursorQuery.getLong(5));
                        c6Var.E0(cursorQuery.getString(6));
                        c6Var.I0(cursorQuery.getString(7));
                        c6Var.K0(cursorQuery.getLong(8));
                        c6Var.a(cursorQuery.getLong(9));
                        c6Var.e(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                        c6Var.o(cursorQuery.getLong(11));
                        c6Var.q(cursorQuery.getLong(12));
                        c6Var.s(cursorQuery.getLong(13));
                        c6Var.u(cursorQuery.getLong(14));
                        c6Var.i(cursorQuery.getLong(15));
                        c6Var.k(cursorQuery.getLong(16));
                        c6Var.G0(cursorQuery.isNull(17) ? androidx.collection.g3.f12261h : cursorQuery.getInt(17));
                        c6Var.y0(cursorQuery.getString(18));
                        c6Var.y(cursorQuery.getLong(19));
                        c6Var.w(cursorQuery.getLong(20));
                        c6Var.O(cursorQuery.getString(21));
                        c6Var.Q(cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0);
                        c6Var.c(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                        if (!cursorQuery.isNull(26)) {
                            c6Var.U(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                        }
                        if (qeVar.g(str).o(q8Var)) {
                            c6Var.u0(cursorQuery.getString(28));
                        }
                        c6Var.W((cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true);
                        c6Var.F(cursorQuery.getLong(39));
                        c6Var.m0(cursorQuery.getString(36));
                        c6Var.Y(cursorQuery.getLong(30));
                        c6Var.a0(cursorQuery.getLong(31));
                        fg.a();
                        h7 h7Var = this.f110184a;
                        if (h7Var.w().H(str, z4.Q0)) {
                            c6Var.c0(cursorQuery.getInt(32));
                            c6Var.k0(cursorQuery.getLong(35));
                        }
                        c6Var.e0((cursorQuery.isNull(33) || cursorQuery.getInt(33) == 0) ? false : true);
                        if (cursorQuery.isNull(34)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getInt(34) != 0);
                        }
                        c6Var.S(boolValueOf);
                        c6Var.C(cursorQuery.getInt(37));
                        c6Var.E(cursorQuery.getInt(38));
                        c6Var.H(cursorQuery.isNull(40) ? "" : (String) com.google.android.gms.common.internal.w.r(cursorQuery.getString(40)));
                        if (!cursorQuery.isNull(41)) {
                            c6Var.g0(Long.valueOf(cursorQuery.getLong(41)));
                        }
                        if (!cursorQuery.isNull(42)) {
                            c6Var.i0(Long.valueOf(cursorQuery.getLong(42)));
                        }
                        c6Var.J(cursorQuery.getBlob(43));
                        if (!cursorQuery.isNull(44)) {
                            c6Var.L(cursorQuery.getInt(44));
                        }
                        c6Var.n0();
                        if (cursorQuery.moveToNext()) {
                            h7Var.a().o().b("Got multiple records for app, expected one. appId", w5.x(str));
                        }
                        cursorQuery.close();
                        return c6Var;
                    }
                } catch (SQLiteException e10) {
                    e = e10;
                    this.f110184a.a().o().c("Error querying app. appId", w5.x(str), e);
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    @androidx.annotation.m1
    public final boolean K(String str, zzoh zzohVar) {
        h();
        j();
        com.google.android.gms.common.internal.w.r(zzohVar);
        com.google.android.gms.common.internal.w.l(str);
        h7 h7Var = this.f110184a;
        long jCurrentTimeMillis = h7Var.e().currentTimeMillis();
        y4 y4Var = z4.f110802w0;
        long jLongValue = jCurrentTimeMillis - ((Long) y4Var.b(null)).longValue();
        long j10 = zzohVar.f110863b;
        if (j10 < jLongValue || j10 > ((Long) y4Var.b(null)).longValue() + jCurrentTimeMillis) {
            h7Var.a().r().d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", w5.x(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j10));
        }
        h7Var.a().w().a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", zzohVar.f110862a);
        contentValues.put("source", Integer.valueOf(zzohVar.f110864c));
        contentValues.put("timestamp_millis", Long.valueOf(j10));
        try {
            if (u0().insert("trigger_uris", null, contentValues) != -1) {
                return true;
            }
            h7Var.a().o().b("Failed to insert trigger URI (got -1). appId", w5.x(str));
            return false;
        } catch (SQLiteException e10) {
            this.f110184a.a().o().c("Error storing trigger URI. appId", w5.x(str), e10);
            return false;
        }
    }

    @androidx.annotation.m1
    public final void K0(c6 c6Var, boolean z10, boolean z11) {
        com.google.android.gms.common.internal.w.r(c6Var);
        h();
        j();
        String strO0 = c6Var.o0();
        com.google.android.gms.common.internal.w.r(strO0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strO0);
        if (z10) {
            contentValues.put("app_instance_id", (String) null);
        } else if (this.f110700b.g(strO0).o(q8.ANALYTICS_STORAGE)) {
            contentValues.put("app_instance_id", c6Var.p0());
        }
        contentValues.put("gmp_app_id", c6Var.r0());
        qe qeVar = this.f110700b;
        if (qeVar.g(strO0).o(q8.AD_STORAGE)) {
            contentValues.put("resettable_device_id_hash", c6Var.v0());
        }
        contentValues.put("last_bundle_index", Long.valueOf(c6Var.g()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c6Var.z0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c6Var.B0()));
        contentValues.put(io.sentry.protocol.a.b.f306114f, c6Var.D0());
        contentValues.put("app_store", c6Var.H0());
        contentValues.put("gmp_version", Long.valueOf(c6Var.J0()));
        contentValues.put("dev_cert_hash", Long.valueOf(c6Var.L0()));
        contentValues.put("measurement_enabled", Boolean.valueOf(c6Var.d()));
        contentValues.put("day", Long.valueOf(c6Var.n()));
        contentValues.put("daily_public_events_count", Long.valueOf(c6Var.p()));
        contentValues.put("daily_events_count", Long.valueOf(c6Var.r()));
        contentValues.put("daily_conversions_count", Long.valueOf(c6Var.t()));
        contentValues.put("config_fetched_time", Long.valueOf(c6Var.h()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(c6Var.j()));
        contentValues.put("app_version_int", Long.valueOf(c6Var.F0()));
        contentValues.put("firebase_instance_id", c6Var.x0());
        contentValues.put("daily_error_events_count", Long.valueOf(c6Var.x()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(c6Var.v()));
        contentValues.put("health_monitor_sample", c6Var.z());
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c6Var.P()));
        contentValues.put("dynamite_version", Long.valueOf(c6Var.b()));
        if (qeVar.g(strO0).o(q8.ANALYTICS_STORAGE)) {
            contentValues.put("session_stitching_token", c6Var.t0());
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(c6Var.V()));
        contentValues.put("target_os_version", Long.valueOf(c6Var.X()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(c6Var.Z()));
        fg.a();
        h7 h7Var = this.f110184a;
        if (h7Var.w().H(strO0, z4.Q0)) {
            contentValues.put("ad_services_version", Integer.valueOf(c6Var.b0()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(c6Var.j0()));
        }
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(c6Var.d0()));
        contentValues.put("npa_metadata_value", c6Var.R());
        contentValues.put("bundle_delivery_index", Long.valueOf(c6Var.G()));
        contentValues.put("sgtm_preview_key", c6Var.l0());
        contentValues.put("dma_consent_state", Integer.valueOf(c6Var.B()));
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(c6Var.D()));
        contentValues.put("serialized_npa_metadata", c6Var.I());
        contentValues.put("client_upload_eligibility", Integer.valueOf(c6Var.M()));
        List listT = c6Var.T();
        if (listT != null) {
            if (listT.isEmpty()) {
                h7Var.a().r().b("Safelisted events should not be an empty list. appId", strO0);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", listT));
            }
        }
        com.google.android.gms.internal.measurement.ff.a();
        if (h7Var.w().H(null, z4.L0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        contentValues.put("unmatched_pfo", c6Var.f0());
        contentValues.put("unmatched_uwa", c6Var.h0());
        contentValues.put("ad_campaign_info", c6Var.K());
        try {
            SQLiteDatabase sQLiteDatabaseU0 = u0();
            if (sQLiteDatabaseU0.update("apps", contentValues, "app_id = ?", new String[]{strO0}) == 0 && sQLiteDatabaseU0.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                h7Var.a().o().b("Failed to insert/update app (got -1). appId", w5.x(strO0));
            }
        } catch (SQLiteException e10) {
            this.f110184a.a().o().c("Error storing app. appId", w5.x(strO0), e10);
        }
    }

    public final void L(String str, r8 r8Var) {
        com.google.android.gms.common.internal.w.r(str);
        com.google.android.gms.common.internal.w.r(r8Var);
        h();
        j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", r8Var.l());
        contentValues.put("consent_source", Integer.valueOf(r8Var.b()));
        N("consent_settings", "app_id", contentValues);
    }

    @androidx.annotation.m1
    public final p L0(long j10, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        return M0(j10, str, 1L, false, false, z12, false, z14, z15, z16);
    }

    @androidx.annotation.m1
    public final p M0(long j10, String str, long j11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        com.google.android.gms.common.internal.w.l(str);
        h();
        j();
        String[] strArr = {str};
        p pVar = new p();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseU0 = u0();
                cursorQuery = sQLiteDatabaseU0.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getLong(0) == j10) {
                        pVar.f110334b = cursorQuery.getLong(1);
                        pVar.f110333a = cursorQuery.getLong(2);
                        pVar.f110335c = cursorQuery.getLong(3);
                        pVar.f110336d = cursorQuery.getLong(4);
                        pVar.f110337e = cursorQuery.getLong(5);
                        pVar.f110338f = cursorQuery.getLong(6);
                        pVar.f110339g = cursorQuery.getLong(7);
                    }
                    if (z10) {
                        pVar.f110334b += j11;
                    }
                    if (z11) {
                        pVar.f110333a += j11;
                    }
                    if (z12) {
                        pVar.f110335c += j11;
                    }
                    if (z13) {
                        pVar.f110336d += j11;
                    }
                    if (z14) {
                        pVar.f110337e += j11;
                    }
                    if (z15) {
                        pVar.f110338f += j11;
                    }
                    if (z16) {
                        pVar.f110339g += j11;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j10));
                    contentValues.put("daily_public_events_count", Long.valueOf(pVar.f110333a));
                    contentValues.put("daily_events_count", Long.valueOf(pVar.f110334b));
                    contentValues.put("daily_conversions_count", Long.valueOf(pVar.f110335c));
                    contentValues.put("daily_error_events_count", Long.valueOf(pVar.f110336d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(pVar.f110337e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(pVar.f110338f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(pVar.f110339g));
                    sQLiteDatabaseU0.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    this.f110184a.a().r().b("Not updating daily counts, app is not known. appId", w5.x(str));
                }
            } catch (SQLiteException e10) {
                this.f110184a.a().o().c("Error updating daily counts. appId", w5.x(str), e10);
            }
            return pVar;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:36:? A[SYNTHETIC] */
    @androidx.annotation.m1
    public final o N0(String str) throws Throwable {
        Throwable th2;
        Cursor cursorQuery;
        com.google.android.gms.common.internal.w.l(str);
        h();
        j();
        Cursor cursor = null;
        try {
            cursorQuery = u0().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        byte[] blob = cursorQuery.getBlob(0);
                        String string = cursorQuery.getString(1);
                        String string2 = cursorQuery.getString(2);
                        if (cursorQuery.moveToNext()) {
                            this.f110184a.a().o().b("Got multiple records for app config, expected one. appId", w5.x(str));
                        }
                        if (blob != null) {
                            o oVar = new o(blob, string, string2);
                            cursorQuery.close();
                            return oVar;
                        }
                    }
                } catch (SQLiteException e10) {
                    e = e10;
                    this.f110184a.a().o().c("Error querying remote config. appId", w5.x(str), e);
                }
            } catch (Throwable th3) {
                th2 = th3;
                cursor = cursorQuery;
                if (cursor != null) {
                    throw th2;
                }
                cursor.close();
                throw th2;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursorQuery = null;
        } catch (Throwable th4) {
            th2 = th4;
            if (cursor != null) {
                throw th2;
            }
            cursor.close();
            throw th2;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x004a  */
    @androidx.annotation.m1
    public final boolean O0(com.google.android.gms.internal.measurement.k7 k7Var, boolean z10) {
        h();
        j();
        com.google.android.gms.common.internal.w.r(k7Var);
        com.google.android.gms.common.internal.w.l(k7Var.E());
        com.google.android.gms.common.internal.w.x(k7Var.t2());
        u();
        h7 h7Var = this.f110184a;
        long jCurrentTimeMillis = h7Var.e().currentTimeMillis();
        long jU2 = k7Var.u2();
        h7Var.w();
        if (jU2 >= jCurrentTimeMillis - k.q()) {
            long jU3 = k7Var.u2();
            h7Var.w();
            if (jU3 > k.q() + jCurrentTimeMillis) {
                h7Var.a().r().d("Storing bundle outside of the max uploading time span. appId, now, timestamp", w5.x(k7Var.E()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(k7Var.u2()));
            }
        } else {
            h7Var.a().r().d("Storing bundle outside of the max uploading time span. appId, now, timestamp", w5.x(k7Var.E()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(k7Var.u2()));
        }
        try {
            byte[] bArrV = this.f110700b.K0().V(k7Var.g());
            h7 h7Var2 = this.f110184a;
            h7Var2.a().w().b("Saving bundle, size", Integer.valueOf(bArrV.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", k7Var.E());
            contentValues.put("bundle_end_timestamp", Long.valueOf(k7Var.u2()));
            contentValues.put("data", bArrV);
            contentValues.put("has_realtime", Integer.valueOf(z10 ? 1 : 0));
            if (k7Var.F0()) {
                contentValues.put("retry_count", Integer.valueOf(k7Var.G0()));
            }
            try {
                if (u0().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                h7Var2.a().o().b("Failed to insert bundle (got -1). appId", w5.x(k7Var.E()));
                return false;
            } catch (SQLiteException e10) {
                this.f110184a.a().o().c("Error storing bundle. appId", w5.x(k7Var.E()), e10);
                return false;
            }
        } catch (IOException e11) {
            this.f110184a.a().o().c("Data loss. Failed to serialize bundle. appId", w5.x(k7Var.E()), e11);
            return false;
        }
    }

    public final x U(String str) {
        com.google.android.gms.common.internal.w.r(str);
        h();
        j();
        return x.g(M("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final void V(String str, x xVar) {
        com.google.android.gms.common.internal.w.r(str);
        com.google.android.gms.common.internal.w.r(xVar);
        h();
        j();
        r8 r8VarJ = J(str);
        r8 r8Var = r8.f110439c;
        if (r8VarJ == r8Var) {
            L(str, r8Var);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", xVar.e());
        N("consent_settings", "app_id", contentValues);
    }

    public final void W(String str, r8 r8Var) {
        com.google.android.gms.common.internal.w.r(str);
        com.google.android.gms.common.internal.w.r(r8Var);
        h();
        j();
        L(str, J(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", r8Var.l());
        N("consent_settings", "app_id", contentValues);
    }

    public final r8 X(String str) {
        com.google.android.gms.common.internal.w.r(str);
        h();
        j();
        return r8.f(M("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}, ""), 100);
    }

    @androidx.annotation.m1
    final void Y(String str, List list) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        boolean z10;
        com.google.android.gms.common.internal.w.r(list);
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.google.android.gms.internal.measurement.g4 g4Var = (com.google.android.gms.internal.measurement.g4) ((com.google.android.gms.internal.measurement.h4) list.get(i10)).q();
            if (g4Var.x() != 0) {
                for (int i11 = 0; i11 < g4Var.x(); i11++) {
                    com.google.android.gms.internal.measurement.i4 i4Var = (com.google.android.gms.internal.measurement.i4) g4Var.z(i11).q();
                    com.google.android.gms.internal.measurement.i4 i4Var2 = (com.google.android.gms.internal.measurement.i4) i4Var.clone();
                    String strB = s8.b(i4Var.u());
                    if (strB != null) {
                        i4Var2.v(strB);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i12 = 0;
                    while (i12 < i4Var.w()) {
                        com.google.android.gms.internal.measurement.l4 l4VarX = i4Var.x(i12);
                        com.google.android.gms.internal.measurement.i4 i4Var3 = i4Var;
                        boolean z11 = z10;
                        String strC = db.c(l4VarX.L(), t8.f110526a, t8.f110527b);
                        if (strC != null) {
                            com.google.android.gms.internal.measurement.k4 k4Var = (com.google.android.gms.internal.measurement.k4) l4VarX.q();
                            k4Var.u(strC);
                            i4Var2.z(i12, (com.google.android.gms.internal.measurement.l4) k4Var.r());
                            z10 = true;
                        } else {
                            z10 = z11;
                        }
                        i12++;
                        i4Var = i4Var3;
                    }
                    if (z10) {
                        g4Var.A(i11, i4Var2);
                        list.set(i10, (com.google.android.gms.internal.measurement.h4) g4Var.r());
                    }
                }
            }
            if (g4Var.u() != 0) {
                for (int i13 = 0; i13 < g4Var.u(); i13++) {
                    com.google.android.gms.internal.measurement.r4 r4VarV = g4Var.v(i13);
                    String strC2 = db.c(r4VarV.G(), u8.f110583a, u8.f110584b);
                    if (strC2 != null) {
                        com.google.android.gms.internal.measurement.q4 q4Var = (com.google.android.gms.internal.measurement.q4) r4VarV.q();
                        q4Var.u(strC2);
                        g4Var.w(i13, q4Var);
                        list.set(i10, (com.google.android.gms.internal.measurement.h4) g4Var.r());
                    }
                }
            }
        }
        j();
        h();
        com.google.android.gms.common.internal.w.l(str);
        com.google.android.gms.common.internal.w.r(list);
        SQLiteDatabase sQLiteDatabaseU0 = u0();
        sQLiteDatabaseU0.beginTransaction();
        try {
            j();
            h();
            com.google.android.gms.common.internal.w.l(str);
            SQLiteDatabase sQLiteDatabaseU1 = u0();
            sQLiteDatabaseU1.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseU1.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.measurement.h4 h4Var = (com.google.android.gms.internal.measurement.h4) it.next();
                j();
                h();
                com.google.android.gms.common.internal.w.l(str);
                com.google.android.gms.common.internal.w.r(h4Var);
                if (h4Var.E()) {
                    int iF = h4Var.F();
                    Iterator it2 = h4Var.J().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!((com.google.android.gms.internal.measurement.j4) it2.next()).E()) {
                                this.f110184a.a().r().c("Event filter with no ID. Audience definition ignored. appId, audienceId", w5.x(str), Integer.valueOf(iF));
                                break;
                            }
                        } else {
                            Iterator it3 = h4Var.G().iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    Iterator it4 = h4Var.J().iterator();
                                    while (true) {
                                        com.google.android.gms.internal.measurement.h4 h4Var2 = h4Var;
                                        String str2 = "app_id";
                                        try {
                                            if (!it4.hasNext()) {
                                                sQLiteDatabase = sQLiteDatabaseU0;
                                                Iterator it5 = h4Var2.G().iterator();
                                                while (true) {
                                                    if (it5.hasNext()) {
                                                        com.google.android.gms.internal.measurement.r4 r4Var = (com.google.android.gms.internal.measurement.r4) it5.next();
                                                        j();
                                                        h();
                                                        com.google.android.gms.common.internal.w.l(str);
                                                        com.google.android.gms.common.internal.w.r(r4Var);
                                                        if (r4Var.G().isEmpty()) {
                                                            this.f110184a.a().r().d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", w5.x(str), Integer.valueOf(iF), String.valueOf(r4Var.E() ? Integer.valueOf(r4Var.F()) : null));
                                                        } else {
                                                            byte[] bArrG = r4Var.g();
                                                            ContentValues contentValues = new ContentValues();
                                                            contentValues.put(str2, str);
                                                            String str3 = str2;
                                                            contentValues.put("audience_id", Integer.valueOf(iF));
                                                            contentValues.put("filter_id", r4Var.E() ? Integer.valueOf(r4Var.F()) : null);
                                                            Iterator it6 = it5;
                                                            contentValues.put("property_name", r4Var.G());
                                                            contentValues.put("session_scoped", r4Var.K() ? Boolean.valueOf(r4Var.L()) : null);
                                                            contentValues.put("data", bArrG);
                                                            try {
                                                                if (u0().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                                                                    this.f110184a.a().o().b("Failed to insert property filter (got -1). appId", w5.x(str));
                                                                } else {
                                                                    str2 = str3;
                                                                    it5 = it6;
                                                                }
                                                            } catch (SQLiteException e10) {
                                                                this.f110184a.a().o().c("Error storing property filter. appId", w5.x(str), e10);
                                                            }
                                                        }
                                                    }
                                                    sQLiteDatabaseU0 = sQLiteDatabase;
                                                    break;
                                                }
                                            }
                                            com.google.android.gms.internal.measurement.j4 j4Var = (com.google.android.gms.internal.measurement.j4) it4.next();
                                            j();
                                            h();
                                            com.google.android.gms.common.internal.w.l(str);
                                            com.google.android.gms.common.internal.w.r(j4Var);
                                            if (!j4Var.G().isEmpty()) {
                                                byte[] bArrG2 = j4Var.g();
                                                sQLiteDatabase = sQLiteDatabaseU0;
                                                ContentValues contentValues2 = new ContentValues();
                                                contentValues2.put("app_id", str);
                                                contentValues2.put("audience_id", Integer.valueOf(iF));
                                                contentValues2.put("filter_id", j4Var.E() ? Integer.valueOf(j4Var.F()) : null);
                                                contentValues2.put("event_name", j4Var.G());
                                                contentValues2.put("session_scoped", j4Var.O() ? Boolean.valueOf(j4Var.P()) : null);
                                                contentValues2.put("data", bArrG2);
                                                try {
                                                    if (u0().insertWithOnConflict("event_filters", null, contentValues2, 5) == -1) {
                                                        this.f110184a.a().o().b("Failed to insert event filter (got -1). appId", w5.x(str));
                                                    }
                                                    h4Var = h4Var2;
                                                    sQLiteDatabaseU0 = sQLiteDatabase;
                                                } catch (SQLiteException e11) {
                                                    this.f110184a.a().o().c("Error storing event filter. appId", w5.x(str), e11);
                                                    j();
                                                    h();
                                                    com.google.android.gms.common.internal.w.l(str);
                                                    SQLiteDatabase sQLiteDatabaseU2 = u0();
                                                    sQLiteDatabaseU2.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iF)});
                                                    sQLiteDatabaseU2.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iF)});
                                                    sQLiteDatabaseU0 = sQLiteDatabase;
                                                    break;
                                                }
                                            } else {
                                                this.f110184a.a().r().d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", w5.x(str), Integer.valueOf(iF), String.valueOf(j4Var.E() ? Integer.valueOf(j4Var.F()) : null));
                                                sQLiteDatabase = sQLiteDatabaseU0;
                                            }
                                            j();
                                            h();
                                            com.google.android.gms.common.internal.w.l(str);
                                            SQLiteDatabase sQLiteDatabaseU3 = u0();
                                            sQLiteDatabaseU3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iF)});
                                            sQLiteDatabaseU3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iF)});
                                            sQLiteDatabaseU0 = sQLiteDatabase;
                                            break;
                                            break;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            sQLiteDatabase.endTransaction();
                                            throw th;
                                        }
                                    }
                                }
                                if (!((com.google.android.gms.internal.measurement.r4) it3.next()).E()) {
                                    this.f110184a.a().r().c("Property filter with no ID. Audience definition ignored. appId, audienceId", w5.x(str), Integer.valueOf(iF));
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    this.f110184a.a().r().b("Audience with no ID. appId", w5.x(str));
                }
            }
            sQLiteDatabase = sQLiteDatabaseU0;
            ArrayList arrayList = new ArrayList();
            Iterator it7 = list.iterator();
            while (it7.hasNext()) {
                com.google.android.gms.internal.measurement.h4 h4Var3 = (com.google.android.gms.internal.measurement.h4) it7.next();
                arrayList.add(h4Var3.E() ? Integer.valueOf(h4Var3.F()) : null);
            }
            com.google.android.gms.common.internal.w.l(str);
            j();
            h();
            SQLiteDatabase sQLiteDatabaseU4 = u0();
            try {
                long jP0 = p0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int i14 = 0;
                int iMax = Math.max(0, Math.min(2000, this.f110184a.w().E(str, z4.V)));
                if (jP0 > iMax) {
                    ArrayList arrayList2 = new ArrayList();
                    while (true) {
                        if (i14 >= arrayList.size()) {
                            String strJoin = TextUtils.join(",", arrayList2);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(strJoin).length() + 2);
                            sb2.append("(");
                            sb2.append(strJoin);
                            sb2.append(")");
                            String string = sb2.toString();
                            StringBuilder sb3 = new StringBuilder(string.length() + androidx.media2.widget.f.i.f59773f0);
                            sb3.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb3.append(string);
                            sb3.append(" order by rowid desc limit -1 offset ?)");
                            sQLiteDatabaseU4.delete("audience_filter_values", sb3.toString(), new String[]{str, Integer.toString(iMax)});
                            break;
                        }
                        Integer num = (Integer) arrayList.get(i14);
                        if (num == null) {
                            break;
                        }
                        arrayList2.add(Integer.toString(num.intValue()));
                        i14++;
                    }
                }
            } catch (SQLiteException e12) {
                this.f110184a.a().o().c("Database error querying filters. appId", w5.x(str), e12);
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase = sQLiteDatabaseU0;
        }
    }

    @androidx.annotation.m1
    final b0 Z(String str, com.google.android.gms.internal.measurement.y6 y6Var, String str2) throws Throwable {
        b0 b0VarO = O(EventEntry.tableName, str, y6Var.H());
        if (b0VarO == null) {
            h7 h7Var = this.f110184a;
            h7Var.a().r().c("Event aggregate wasn't created during raw event logging. appId, event", w5.x(str), h7Var.D().a(str2));
            return new b0(str, y6Var.H(), 1L, 1L, 1L, y6Var.J(), 0L, null, null, null, null);
        }
        long j10 = b0VarO.f109768e + 1;
        long j11 = b0VarO.f109767d + 1;
        return new b0(b0VarO.f109764a, b0VarO.f109765b, b0VarO.f109766c + 1, j11, j10, b0VarO.f109769f, b0VarO.f109770g, b0VarO.f109771h, b0VarO.f109772i, b0VarO.f109773j, b0VarO.f109774k);
    }

    @androidx.annotation.l1
    protected final boolean a0() {
        h7 h7Var = this.f110184a;
        Context contextD = h7Var.d();
        h7Var.w();
        return contextD.getDatabasePath("google_app_measurement.db").exists();
    }

    final /* synthetic */ long b0(String str, String[] strArr, long j10) {
        return q0("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", strArr, -1L);
    }

    @Override // com.google.android.gms.measurement.internal.be
    protected final boolean l() {
        return false;
    }

    @androidx.annotation.m1
    public final long m(String str, com.google.android.gms.internal.measurement.i7 i7Var, String str2, Map map, cb cbVar, Long l10) {
        int iDelete;
        h();
        j();
        com.google.android.gms.common.internal.w.r(i7Var);
        com.google.android.gms.common.internal.w.l(str);
        h();
        j();
        if (a0()) {
            qe qeVar = this.f110700b;
            long jA = qeVar.L0().f110828f.a();
            h7 h7Var = this.f110184a;
            long jB = h7Var.e().b();
            long jAbs = Math.abs(jB - jA);
            h7Var.w();
            if (jAbs > k.r()) {
                qeVar.L0().f110828f.b(jB);
                h();
                j();
                if (a0() && (iDelete = u0().delete("upload_queue", S(), new String[0])) > 0) {
                    h7Var.a().w().b("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(iDelete));
                }
                com.google.android.gms.common.internal.w.l(str);
                h();
                j();
                try {
                    int iE = h7Var.w().E(str, z4.A);
                    if (iE > 0) {
                        u0().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iE)});
                    }
                } catch (SQLiteException e10) {
                    this.f110184a.a().o().c("Error deleting over the limit queued batches. appId", w5.x(str), e10);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb2.append(str3);
            sb2.append("=");
            sb2.append(str4);
            arrayList.add(sb2.toString());
        }
        byte[] bArrG = i7Var.g();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", bArrG);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", String.join("\r\n", arrayList));
        contentValues.put("upload_type", Integer.valueOf(cbVar.a()));
        h7 h7Var2 = this.f110184a;
        contentValues.put(n6.a.C2338a.f332745m, Long.valueOf(h7Var2.e().currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l10 != null) {
            contentValues.put("associated_row_id", l10);
        }
        try {
            long jInsert = u0().insert("upload_queue", null, contentValues);
            if (jInsert != -1) {
                return jInsert;
            }
            h7Var2.a().o().b("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
            return -1L;
        } catch (SQLiteException e11) {
            this.f110184a.a().o().c("Error storing MeasurementBatch to upload_queue. appId", str, e11);
            return -1L;
        }
    }

    final /* synthetic */ td m0() {
        return this.f110510e;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00b1  */
    @androidx.annotation.m1
    public final te n(long j10) throws Throwable {
        Cursor cursorQuery;
        h();
        j();
        Cursor cursor = null;
        try {
            cursorQuery = u0().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", n6.a.C2338a.f332745m, "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j10)}, null, null, null, "1");
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        te teVarR = R((String) com.google.android.gms.common.internal.w.r(cursorQuery.getString(1)), j10, cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                        cursorQuery.close();
                        return teVarR;
                    }
                } catch (SQLiteException e10) {
                    e = e10;
                    this.f110184a.a().o().c("Error to querying MeasurementBatch from upload_queue. rowId", Long.valueOf(j10), e);
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x026b  */
    /* JADX WARN: Code duplicated, block: B:125:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0103 A[Catch: all -> 0x0080, SQLiteException -> 0x0082, TryCatch #0 {all -> 0x0080, blocks: (B:15:0x006c, B:18:0x0074, B:19:0x0078, B:45:0x00da, B:47:0x0103, B:48:0x0118, B:49:0x011c, B:50:0x012c, B:52:0x0132, B:53:0x0145, B:56:0x0161, B:68:0x018a, B:71:0x0192, B:77:0x01b4, B:61:0x0177, B:75:0x01a6, B:76:0x01af, B:98:0x023b, B:40:0x00ca, B:43:0x00d2), top: B:111:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0118 A[Catch: all -> 0x0080, SQLiteException -> 0x0082, TRY_LEAVE, TryCatch #0 {all -> 0x0080, blocks: (B:15:0x006c, B:18:0x0074, B:19:0x0078, B:45:0x00da, B:47:0x0103, B:48:0x0118, B:49:0x011c, B:50:0x012c, B:52:0x0132, B:53:0x0145, B:56:0x0161, B:68:0x018a, B:71:0x0192, B:77:0x01b4, B:61:0x0177, B:75:0x01a6, B:76:0x01af, B:98:0x023b, B:40:0x00ca, B:43:0x00d2), top: B:111:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0132 A[Catch: all -> 0x0080, SQLiteException -> 0x0082, TryCatch #0 {all -> 0x0080, blocks: (B:15:0x006c, B:18:0x0074, B:19:0x0078, B:45:0x00da, B:47:0x0103, B:48:0x0118, B:49:0x011c, B:50:0x012c, B:52:0x0132, B:53:0x0145, B:56:0x0161, B:68:0x018a, B:71:0x0192, B:77:0x01b4, B:61:0x0177, B:75:0x01a6, B:76:0x01af, B:98:0x023b, B:40:0x00ca, B:43:0x00d2), top: B:111:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0161 A[Catch: all -> 0x0080, SQLiteException -> 0x0082, TRY_ENTER, TryCatch #0 {all -> 0x0080, blocks: (B:15:0x006c, B:18:0x0074, B:19:0x0078, B:45:0x00da, B:47:0x0103, B:48:0x0118, B:49:0x011c, B:50:0x012c, B:52:0x0132, B:53:0x0145, B:56:0x0161, B:68:0x018a, B:71:0x0192, B:77:0x01b4, B:61:0x0177, B:75:0x01a6, B:76:0x01af, B:98:0x023b, B:40:0x00ca, B:43:0x00d2), top: B:111:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0171  */
    /* JADX WARN: Code duplicated, block: B:60:0x0175  */
    /* JADX WARN: Code duplicated, block: B:61:0x0177 A[Catch: all -> 0x0080, SQLiteException -> 0x0082, TryCatch #0 {all -> 0x0080, blocks: (B:15:0x006c, B:18:0x0074, B:19:0x0078, B:45:0x00da, B:47:0x0103, B:48:0x0118, B:49:0x011c, B:50:0x012c, B:52:0x0132, B:53:0x0145, B:56:0x0161, B:68:0x018a, B:71:0x0192, B:77:0x01b4, B:61:0x0177, B:75:0x01a6, B:76:0x01af, B:98:0x023b, B:40:0x00ca, B:43:0x00d2), top: B:111:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0180  */
    /* JADX WARN: Code duplicated, block: B:69:0x018f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0191  */
    /* JADX WARN: Code duplicated, block: B:73:0x019e  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a6 A[Catch: all -> 0x0080, SQLiteException -> 0x0082, TryCatch #0 {all -> 0x0080, blocks: (B:15:0x006c, B:18:0x0074, B:19:0x0078, B:45:0x00da, B:47:0x0103, B:48:0x0118, B:49:0x011c, B:50:0x012c, B:52:0x0132, B:53:0x0145, B:56:0x0161, B:68:0x018a, B:71:0x0192, B:77:0x01b4, B:61:0x0177, B:75:0x01a6, B:76:0x01af, B:98:0x023b, B:40:0x00ca, B:43:0x00d2), top: B:111:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01af A[Catch: all -> 0x0080, SQLiteException -> 0x0082, TryCatch #0 {all -> 0x0080, blocks: (B:15:0x006c, B:18:0x0074, B:19:0x0078, B:45:0x00da, B:47:0x0103, B:48:0x0118, B:49:0x011c, B:50:0x012c, B:52:0x0132, B:53:0x0145, B:56:0x0161, B:68:0x018a, B:71:0x0192, B:77:0x01b4, B:61:0x0177, B:75:0x01a6, B:76:0x01af, B:98:0x023b, B:40:0x00ca, B:43:0x00d2), top: B:111:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01d7 A[Catch: all -> 0x0207, SQLiteException -> 0x0209, LOOP:0: B:80:0x01d7->B:127:?, LOOP_START, TRY_LEAVE, TryCatch #2 {SQLiteException -> 0x0209, blocks: (B:78:0x01d1, B:80:0x01d7, B:81:0x01e0, B:83:0x01eb, B:92:0x0220, B:91:0x020c, B:95:0x0227), top: B:114:0x01d1 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0220 A[Catch: all -> 0x0207, SQLiteException -> 0x0209, TryCatch #2 {SQLiteException -> 0x0209, blocks: (B:78:0x01d1, B:80:0x01d7, B:81:0x01e0, B:83:0x01eb, B:92:0x0220, B:91:0x020c, B:95:0x0227), top: B:114:0x01d1 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0227 A[Catch: all -> 0x0207, SQLiteException -> 0x0209, TRY_LEAVE, TryCatch #2 {SQLiteException -> 0x0209, blocks: (B:78:0x01d1, B:80:0x01d7, B:81:0x01e0, B:83:0x01eb, B:92:0x0220, B:91:0x020c, B:95:0x0227), top: B:114:0x01d1 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    public final void n0(String str, long j10, long j11, me meVar) throws Throwable {
        ?? r10;
        ?? r11;
        Cursor cursorRawQuery;
        String str2;
        String[] strArr;
        String string;
        ?? r12;
        h7 h7Var;
        String str3;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        long j12;
        com.google.android.gms.internal.measurement.x6 x6Var;
        long jQ0;
        long j13;
        String string2;
        com.google.android.gms.common.internal.w.r(meVar);
        h();
        j();
        Cursor cursorQuery = null;
        cursorQuery = null;
        ?? r13 = 0;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseU0 = u0();
                ?? IsEmpty = TextUtils.isEmpty(str);
                String str4 = "";
                try {
                    if (IsEmpty != 0) {
                        String[] strArr5 = j11 != -1 ? new String[]{String.valueOf(j11), String.valueOf(j10)} : new String[]{String.valueOf(j10)};
                        str4 = j11 != -1 ? "rowid <= ? and " : "";
                        StringBuilder sb2 = new StringBuilder(str4.length() + com.planner5d.library.engine.input.f.b.G1);
                        sb2.append("select app_id, metadata_fingerprint from raw_events where ");
                        sb2.append(str4);
                        sb2.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                        cursorRawQuery = sQLiteDatabaseU0.rawQuery(sb2.toString(), strArr5);
                        try {
                            if (cursorRawQuery.moveToFirst()) {
                                string2 = cursorRawQuery.getString(0);
                                try {
                                    string = cursorRawQuery.getString(1);
                                    cursorRawQuery.close();
                                    r12 = string2;
                                    cursorRawQuery = sQLiteDatabaseU0.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{r12, string}, null, null, "rowid", "2");
                                    if (cursorRawQuery.moveToFirst()) {
                                        try {
                                            com.google.android.gms.internal.measurement.k7 k7Var = (com.google.android.gms.internal.measurement.k7) ((com.google.android.gms.internal.measurement.j7) ve.W(com.google.android.gms.internal.measurement.k7.j0(), cursorRawQuery.getBlob(0))).r();
                                            if (cursorRawQuery.moveToNext()) {
                                                this.f110184a.a().r().b("Get multiple raw event metadata records, expected one. appId", w5.x(r12));
                                            }
                                            cursorRawQuery.close();
                                            com.google.android.gms.common.internal.w.r(k7Var);
                                            meVar.f110271a = k7Var;
                                            h7Var = this.f110184a;
                                            str3 = "app_id = ? and metadata_fingerprint = ?";
                                            if (h7Var.w().H(null, z4.f110780l1)) {
                                                jQ0 = q0("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r12, string}, -1L);
                                                if (j11 == -1) {
                                                    j13 = j11;
                                                } else if (jQ0 != -1) {
                                                    j13 = -1;
                                                } else {
                                                    strArr2 = new String[]{r12, string};
                                                    strArr4 = strArr2;
                                                }
                                                if (j13 == -1 && jQ0 != -1) {
                                                    jQ0 = Math.min(j13, jQ0);
                                                } else if (j13 != -1) {
                                                    jQ0 = j13;
                                                }
                                                strArr3 = new String[]{r12, string, String.valueOf(jQ0)};
                                                strArr4 = strArr3;
                                                str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                            } else if (j11 != -1) {
                                                strArr3 = new String[]{r12, string, String.valueOf(j11)};
                                                strArr4 = strArr3;
                                                str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                            } else {
                                                strArr2 = new String[]{r12, string};
                                                strArr4 = strArr2;
                                            }
                                            cursorQuery = sQLiteDatabaseU0.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str3, strArr4, null, null, "rowid", null);
                                            try {
                                                if (cursorQuery.moveToFirst()) {
                                                    do {
                                                        j12 = cursorQuery.getLong(0);
                                                        try {
                                                            x6Var = (com.google.android.gms.internal.measurement.x6) ve.W(com.google.android.gms.internal.measurement.y6.O(), cursorQuery.getBlob(3));
                                                            x6Var.G(cursorQuery.getString(1));
                                                            x6Var.J(cursorQuery.getLong(2));
                                                            if (!meVar.a(j12, (com.google.android.gms.internal.measurement.y6) x6Var.r())) {
                                                                break;
                                                            }
                                                        } catch (IOException e10) {
                                                            this.f110184a.a().o().c("Data loss. Failed to merge raw event. appId", w5.x(r12), e10);
                                                        }
                                                    } while (cursorQuery.moveToNext());
                                                } else {
                                                    h7Var.a().r().b("Raw event data disappeared while in transaction. appId", w5.x(r12));
                                                }
                                            } catch (SQLiteException e11) {
                                                e = e11;
                                                r11 = r12;
                                                this.f110184a.a().o().c("Data loss. Error selecting raw event. appId", w5.x(r11), e);
                                            }
                                            cursorRawQuery = cursorQuery;
                                        } catch (IOException e12) {
                                            this.f110184a.a().o().c("Data loss. Failed to merge raw event metadata. appId", w5.x(r12), e12);
                                        }
                                    } else {
                                        this.f110184a.a().o().b("Raw event metadata record is missing. appId", w5.x(r12));
                                    }
                                } catch (SQLiteException e13) {
                                    e = e13;
                                    cursorQuery = cursorRawQuery;
                                    r11 = string2;
                                    this.f110184a.a().o().c("Data loss. Error selecting raw event. appId", w5.x(r11), e);
                                    cursorRawQuery = cursorQuery;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                }
                            }
                        } catch (SQLiteException e14) {
                            e = e14;
                            string2 = str;
                        }
                    } else {
                        try {
                            if (j11 != -1) {
                                String str5 = str;
                                strArr = new String[]{str5, String.valueOf(j11)};
                                IsEmpty = str5;
                            } else {
                                str2 = str;
                                strArr = new String[]{str2};
                            }
                            if (j11 != -1) {
                                IsEmpty = str2;
                                str4 = " and rowid <= ?";
                            }
                            IsEmpty = str2;
                            StringBuilder sb3 = new StringBuilder(str4.length() + 84);
                            sb3.append("select metadata_fingerprint from raw_events where app_id = ?");
                            sb3.append(str4);
                            sb3.append(" order by rowid limit 1;");
                            cursorRawQuery = sQLiteDatabaseU0.rawQuery(sb3.toString(), strArr);
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    string = cursorRawQuery.getString(0);
                                    cursorRawQuery.close();
                                    r12 = IsEmpty;
                                    cursorRawQuery = sQLiteDatabaseU0.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{r12, string}, null, null, "rowid", "2");
                                    if (cursorRawQuery.moveToFirst()) {
                                        this.f110184a.a().o().b("Raw event metadata record is missing. appId", w5.x(r12));
                                    } else {
                                        com.google.android.gms.internal.measurement.k7 k7Var2 = (com.google.android.gms.internal.measurement.k7) ((com.google.android.gms.internal.measurement.j7) ve.W(com.google.android.gms.internal.measurement.k7.j0(), cursorRawQuery.getBlob(0))).r();
                                        if (cursorRawQuery.moveToNext()) {
                                            this.f110184a.a().r().b("Get multiple raw event metadata records, expected one. appId", w5.x(r12));
                                        }
                                        cursorRawQuery.close();
                                        com.google.android.gms.common.internal.w.r(k7Var2);
                                        meVar.f110271a = k7Var2;
                                        h7Var = this.f110184a;
                                        str3 = "app_id = ? and metadata_fingerprint = ?";
                                        if (h7Var.w().H(null, z4.f110780l1)) {
                                            jQ0 = q0("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r12, string}, -1L);
                                            if (j11 == -1) {
                                                j13 = j11;
                                            } else if (jQ0 != -1) {
                                                j13 = -1;
                                            } else {
                                                strArr2 = new String[]{r12, string};
                                                strArr4 = strArr2;
                                            }
                                            if (j13 == -1) {
                                                if (j13 != -1) {
                                                    jQ0 = j13;
                                                }
                                            } else if (j13 != -1) {
                                                jQ0 = j13;
                                            }
                                            strArr3 = new String[]{r12, string, String.valueOf(jQ0)};
                                            strArr4 = strArr3;
                                            str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        } else if (j11 != -1) {
                                            strArr3 = new String[]{r12, string, String.valueOf(j11)};
                                            strArr4 = strArr3;
                                            str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        } else {
                                            strArr2 = new String[]{r12, string};
                                            strArr4 = strArr2;
                                        }
                                        cursorQuery = sQLiteDatabaseU0.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str3, strArr4, null, null, "rowid", null);
                                        if (cursorQuery.moveToFirst()) {
                                            do {
                                                j12 = cursorQuery.getLong(0);
                                                x6Var = (com.google.android.gms.internal.measurement.x6) ve.W(com.google.android.gms.internal.measurement.y6.O(), cursorQuery.getBlob(3));
                                                x6Var.G(cursorQuery.getString(1));
                                                x6Var.J(cursorQuery.getLong(2));
                                                if (!meVar.a(j12, (com.google.android.gms.internal.measurement.y6) x6Var.r())) {
                                                    break;
                                                    break;
                                                }
                                            } while (cursorQuery.moveToNext());
                                        } else {
                                            h7Var.a().r().b("Raw event data disappeared while in transaction. appId", w5.x(r12));
                                        }
                                        cursorRawQuery = cursorQuery;
                                    }
                                }
                            } catch (SQLiteException e15) {
                                e = e15;
                                cursorQuery = cursorRawQuery;
                                r10 = IsEmpty;
                                r11 = r10;
                                this.f110184a.a().o().c("Data loss. Error selecting raw event. appId", w5.x(r11), e);
                                cursorRawQuery = cursorQuery;
                                if (cursorRawQuery != null) {
                                    cursorRawQuery.close();
                                }
                            }
                        } catch (SQLiteException e16) {
                            e = e16;
                            r10 = IsEmpty;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r13 = "select metadata_fingerprint from raw_events where app_id = ?";
                    if (r13 != 0) {
                        r13.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (SQLiteException e17) {
            e = e17;
            r10 = str;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
    }

    @androidx.annotation.m1
    public final List o(String str, zzoo zzooVar, int i10) {
        List arrayList;
        com.google.android.gms.common.internal.w.l(str);
        h();
        j();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseU0 = u0();
                String[] strArr = {"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", n6.a.C2338a.f332745m, "associated_row_id", "last_upload_timestamp"};
                String strT = T(zzooVar.f110872a);
                String strS = S();
                StringBuilder sb2 = new StringBuilder(String.valueOf(strT).length() + 17 + strS.length());
                sb2.append("app_id=?");
                sb2.append(strT);
                sb2.append(" AND NOT ");
                sb2.append(strS);
                cursorQuery = sQLiteDatabaseU0.query("upload_queue", strArr, sb2.toString(), new String[]{str}, null, null, "creation_timestamp ASC", i10 > 0 ? String.valueOf(i10) : null);
                arrayList = new ArrayList();
                while (cursorQuery.moveToNext()) {
                    te teVarR = R(str, cursorQuery.getLong(0), cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                    if (teVarR != null) {
                        arrayList.add(teVarR);
                    }
                }
            } catch (SQLiteException e10) {
                this.f110184a.a().o().c("Error to querying MeasurementBatch from upload_queue. appId", str, e10);
                arrayList = Collections.EMPTY_LIST;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return arrayList;
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th2;
        }
    }

    @androidx.annotation.m1
    public final boolean p(String str) {
        cb[] cbVarArr = {cb.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(cbVarArr[0].a()));
        String strT = T(arrayList);
        String strS = S();
        StringBuilder sb2 = new StringBuilder(String.valueOf(strT).length() + 61 + strS.length());
        sb2.append("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?");
        sb2.append(strT);
        sb2.append(" AND NOT ");
        sb2.append(strS);
        return p0(sb2.toString(), new String[]{str}) != 0;
    }

    @androidx.annotation.m1
    public final void q(Long l10) {
        h();
        j();
        com.google.android.gms.common.internal.w.r(l10);
        try {
            if (u0().delete("upload_queue", "rowid=?", new String[]{l10.toString()}) != 1) {
                this.f110184a.a().r().a("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e10) {
            this.f110184a.a().o().b("Failed to delete a MeasurementBatch in a upload_queue table", e10);
            throw e10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    @androidx.annotation.m1
    public final String r() throws Throwable {
        SQLiteException e10;
        Cursor cursorRawQuery;
        Cursor cursor = null;
        try {
            cursorRawQuery = u0().rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
            try {
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        String string = cursorRawQuery.getString(0);
                        cursorRawQuery.close();
                        return string;
                    }
                } catch (SQLiteException e11) {
                    e10 = e11;
                    this.f110184a.a().o().b("Database error getting next bundle app id", e10);
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorRawQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e12) {
            e10 = e12;
            cursorRawQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return null;
    }

    @androidx.annotation.m1
    public final void r0() {
        j();
        u0().beginTransaction();
    }

    public final boolean s() {
        return p0("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    @androidx.annotation.m1
    public final void s0() {
        j();
        u0().setTransactionSuccessful();
    }

    @androidx.annotation.m1
    public final void t(long j10) {
        h();
        j();
        try {
            if (u0().delete("queue", "rowid=?", new String[]{String.valueOf(j10)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e10) {
            this.f110184a.a().o().b("Failed to delete a bundle in a queue table", e10);
            throw e10;
        }
    }

    @androidx.annotation.m1
    public final void t0() {
        j();
        u0().endTransaction();
    }

    @androidx.annotation.m1
    final void u() {
        h();
        j();
        if (a0()) {
            qe qeVar = this.f110700b;
            long jA = qeVar.L0().f110827e.a();
            h7 h7Var = this.f110184a;
            long jB = h7Var.e().b();
            long jAbs = Math.abs(jB - jA);
            h7Var.w();
            if (jAbs > k.r()) {
                qeVar.L0().f110827e.b(jB);
                h();
                j();
                if (a0()) {
                    SQLiteDatabase sQLiteDatabaseU0 = u0();
                    String strValueOf = String.valueOf(h7Var.e().currentTimeMillis());
                    h7Var.w();
                    int iDelete = sQLiteDatabaseU0.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{strValueOf, String.valueOf(k.q())});
                    if (iDelete > 0) {
                        h7Var.a().w().b("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
                    }
                }
            }
        }
    }

    @androidx.annotation.l1
    @androidx.annotation.m1
    final SQLiteDatabase u0() {
        h();
        try {
            return this.f110509d.getWritableDatabase();
        } catch (SQLiteException e10) {
            this.f110184a.a().r().b("Error opening database", e10);
            throw e10;
        }
    }

    @androidx.annotation.l1
    @androidx.annotation.m1
    final void v(List list) {
        h();
        j();
        com.google.android.gms.common.internal.w.r(list);
        com.google.android.gms.common.internal.w.t(list.size());
        if (a0()) {
            String strJoin = TextUtils.join(",", list);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strJoin).length() + 2);
            sb2.append("(");
            sb2.append(strJoin);
            sb2.append(")");
            String string = sb2.toString();
            StringBuilder sb3 = new StringBuilder(string.length() + 80);
            sb3.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb3.append(string);
            sb3.append(" AND retry_count =  2147483647 LIMIT 1");
            if (p0(sb3.toString(), null) > 0) {
                this.f110184a.a().r().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseU0 = u0();
                StringBuilder sb4 = new StringBuilder(string.length() + 127);
                sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb4.append(string);
                sb4.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseU0.execSQL(sb4.toString());
            } catch (SQLiteException e10) {
                this.f110184a.a().o().b("Error incrementing retry count. error", e10);
            }
        }
    }

    @androidx.annotation.m1
    public final b0 v0(String str, String str2) {
        return O(EventEntry.tableName, str, str2);
    }

    @androidx.annotation.m1
    final void w(Long l10) {
        h();
        j();
        com.google.android.gms.common.internal.w.r(l10);
        if (a0()) {
            StringBuilder sb2 = new StringBuilder(l10.toString().length() + 86);
            sb2.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb2.append(l10);
            sb2.append(" AND retry_count =  2147483647 LIMIT 1");
            if (p0(sb2.toString(), null) > 0) {
                this.f110184a.a().r().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseU0 = u0();
                long jCurrentTimeMillis = this.f110184a.e().currentTimeMillis();
                StringBuilder sb3 = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 60);
                sb3.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb3.append(jCurrentTimeMillis);
                String string = sb3.toString();
                StringBuilder sb4 = new StringBuilder(string.length() + 34 + l10.toString().length() + 29);
                sb4.append("UPDATE upload_queue");
                sb4.append(string);
                sb4.append(" WHERE rowid = ");
                sb4.append(l10);
                sb4.append(" AND retry_count < 2147483647");
                sQLiteDatabaseU0.execSQL(sb4.toString());
            } catch (SQLiteException e10) {
                this.f110184a.a().o().b("Error incrementing retry count. error", e10);
            }
        }
    }

    @androidx.annotation.m1
    public final void w0(b0 b0Var) {
        P(EventEntry.tableName, b0Var);
    }

    @androidx.annotation.l1
    @androidx.annotation.m1
    final Object x(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 0) {
            this.f110184a.a().o().a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i10));
        }
        if (type == 3) {
            return cursor.getString(i10);
        }
        if (type != 4) {
            this.f110184a.a().o().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        this.f110184a.a().o().a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    public final void x0(String str) {
        b0 b0VarO;
        Q("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = u0().query(EventEntry.tableName, (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string != null && (b0VarO = O(EventEntry.tableName, str, string)) != null) {
                            P("events_snapshot", b0VarO);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e10) {
                this.f110184a.a().o().c("Error creating snapshot. appId", w5.x(str), e10);
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th2;
        }
    }

    @androidx.annotation.m1
    public final long y() {
        return q0("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x005a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0061  */
    public final void y0(String str) throws Throwable {
        boolean z10;
        b0 b0VarO;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        b0 b0VarO2 = O(EventEntry.tableName, str, "_f");
        b0 b0VarO3 = O(EventEntry.tableName, str, "_v");
        Q(EventEntry.tableName, str);
        Cursor cursorQuery = null;
        boolean z11 = false;
        try {
            cursorQuery = u0().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                boolean z12 = false;
                z10 = false;
                do {
                    try {
                        String string = cursorQuery.getString(0);
                        if (cursorQuery.getLong(1) >= 1) {
                            if ("_f".equals(string)) {
                                z12 = true;
                            } else if ("_v".equals(string)) {
                                z10 = true;
                            }
                        }
                        if (string != null && (b0VarO = O("events_snapshot", str, string)) != null) {
                            P(EventEntry.tableName, b0VarO);
                        }
                    } catch (SQLiteException e10) {
                        e = e10;
                        z11 = z12;
                        try {
                            this.f110184a.a().o().c("Error querying snapshot. appId", w5.x(str), e);
                            z12 = z11;
                        } catch (Throwable th2) {
                            th = th2;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (z11 && b0VarO2 != null) {
                                P(EventEntry.tableName, b0VarO2);
                            } else if (!z10 && b0VarO3 != null) {
                                P(EventEntry.tableName, b0VarO3);
                            }
                            Q("events_snapshot", str);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z11 = z12;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (z11) {
                            if (!z10) {
                                P(EventEntry.tableName, b0VarO3);
                            }
                        } else if (!z10) {
                            P(EventEntry.tableName, b0VarO3);
                        }
                        Q("events_snapshot", str);
                        throw th;
                    }
                } while (cursorQuery.moveToNext());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (!z12 && b0VarO2 != null) {
                    P(EventEntry.tableName, b0VarO2);
                } else if (!z10 && b0VarO3 != null) {
                    P(EventEntry.tableName, b0VarO3);
                }
            } else {
                cursorQuery.close();
                if (b0VarO2 != null) {
                    P(EventEntry.tableName, b0VarO2);
                } else if (b0VarO3 != null) {
                    P(EventEntry.tableName, b0VarO3);
                }
            }
        } catch (SQLiteException e11) {
            e = e11;
            z10 = false;
        } catch (Throwable th4) {
            th = th4;
            z10 = false;
        }
        Q("events_snapshot", str);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x009c A[Catch: all -> 0x0074, SQLiteException -> 0x00b2, TryCatch #0 {all -> 0x0074, blocks: (B:3:0x001b, B:6:0x0041, B:8:0x0060, B:15:0x0079, B:17:0x009c, B:20:0x00b4, B:23:0x00bd), top: B:29:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:20:0x00b4 A[Catch: all -> 0x0074, SQLiteException -> 0x00b2, TRY_LEAVE, TryCatch #0 {all -> 0x0074, blocks: (B:3:0x001b, B:6:0x0041, B:8:0x0060, B:15:0x0079, B:17:0x009c, B:20:0x00b4, B:23:0x00bd), top: B:29:0x001b }] */
    @androidx.annotation.l1
    @androidx.annotation.m1
    protected final long z(String str, String str2) {
        SQLiteException e10;
        long jQ0;
        long j10;
        ContentValues contentValues;
        com.google.android.gms.common.internal.w.l(str);
        com.google.android.gms.common.internal.w.l("first_open_count");
        h();
        j();
        SQLiteDatabase sQLiteDatabaseU0 = u0();
        sQLiteDatabaseU0.beginTransaction();
        try {
            try {
                StringBuilder sb2 = new StringBuilder(48);
                sb2.append("select ");
                sb2.append("first_open_count");
                sb2.append(" from app2 where app_id=?");
                j10 = -1;
                jQ0 = q0(sb2.toString(), new String[]{str}, -1L);
                if (jQ0 == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseU0.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        this.f110184a.a().o().c("Failed to insert column (got -1). appId", w5.x(str), "first_open_count");
                    } else {
                        jQ0 = 0;
                        try {
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str);
                            contentValues.put("first_open_count", Long.valueOf(1 + jQ0));
                            if (sQLiteDatabaseU0.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                                this.f110184a.a().o().c("Failed to update column (got 0). appId", w5.x(str), "first_open_count");
                            } else {
                                sQLiteDatabaseU0.setTransactionSuccessful();
                                j10 = jQ0;
                            }
                        } catch (SQLiteException e11) {
                            e10 = e11;
                            this.f110184a.a().o().d("Error inserting column. appId", w5.x(str), "first_open_count", e10);
                        }
                    }
                } else {
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", Long.valueOf(1 + jQ0));
                    if (sQLiteDatabaseU0.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                        this.f110184a.a().o().c("Failed to update column (got 0). appId", w5.x(str), "first_open_count");
                    } else {
                        sQLiteDatabaseU0.setTransactionSuccessful();
                        j10 = jQ0;
                    }
                }
            } finally {
                sQLiteDatabaseU0.endTransaction();
            }
        } catch (SQLiteException e12) {
            e10 = e12;
            jQ0 = 0;
        }
        return j10;
    }

    @androidx.annotation.m1
    public final void z0(String str, String str2) {
        com.google.android.gms.common.internal.w.l(str);
        com.google.android.gms.common.internal.w.l(str2);
        h();
        j();
        try {
            u0().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            h7 h7Var = this.f110184a;
            h7Var.a().o().d("Error deleting user property. appId", w5.x(str), h7Var.D().c(str2), e10);
        }
    }
}
