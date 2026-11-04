package org.threeten.bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes14.dex */
final class t extends r implements Serializable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f340325f = 8386373296231747096L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f340326g = Pattern.compile("[A-Za-z][A-Za-z0-9~/._+-]+");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f340327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient org.threeten.bp.zone.g f340328e;

    t(String str, org.threeten.bp.zone.g gVar) {
        this.f340327d = str;
        this.f340328e = gVar;
    }

    static t N(String str, boolean z10) {
        org.threeten.bp.zone.g gVarZ;
        cn.d.j(str, "zoneId");
        if (str.length() < 2 || !f340326g.matcher(str).matches()) {
            throw new b("Invalid ID for region-based ZoneId, invalid format: " + str);
        }
        try {
            gVarZ = org.threeten.bp.zone.k.c(str, true);
        } catch (org.threeten.bp.zone.i e10) {
            if (str.equals("GMT0")) {
                gVarZ = s.f340320n.z();
            } else {
                if (z10) {
                    throw e10;
                }
                gVarZ = null;
            }
        }
        return new t(str, gVarZ);
    }

    private static t O(String str) {
        if (str.equals(org.locationtech.jts.io.gml2.a.f338505w) || str.startsWith(org.slf4j.h.f339615a3) || str.startsWith("-")) {
            throw new b("Invalid ID for region-based ZoneId, invalid format: " + str);
        }
        if (!str.equals("UTC") && !str.equals(org.apache.commons.lang3.time.m.f337525a) && !str.equals("UT")) {
            if (str.startsWith("UTC+") || str.startsWith("GMT+") || str.startsWith("UTC-") || str.startsWith("GMT-")) {
                s sVarT = s.T(str.substring(3));
                if (sVarT.S() == 0) {
                    return new t(str.substring(0, 3), sVarT.z());
                }
                return new t(str.substring(0, 3) + sVarT.getId(), sVarT.z());
            }
            if (!str.startsWith("UT+") && !str.startsWith("UT-")) {
                return N(str, false);
            }
            s sVarT2 = s.T(str.substring(2));
            if (sVarT2.S() == 0) {
                return new t("UT", sVarT2.z());
            }
            return new t("UT" + sVarT2.getId(), sVarT2.z());
        }
        return new t(str, s.f340320n.z());
    }

    static r R(DataInput dataInput) throws IOException {
        return O(dataInput.readUTF());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new o((byte) 7, this);
    }

    @Override // org.threeten.bp.r
    void M(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(7);
        S(dataOutput);
    }

    void S(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(this.f340327d);
    }

    @Override // org.threeten.bp.r
    public String getId() {
        return this.f340327d;
    }

    @Override // org.threeten.bp.r
    public org.threeten.bp.zone.g z() {
        org.threeten.bp.zone.g gVar = this.f340328e;
        return gVar != null ? gVar : org.threeten.bp.zone.k.c(this.f340327d, false);
    }
}
