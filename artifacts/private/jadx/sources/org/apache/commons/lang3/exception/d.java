package org.apache.commons.lang3.exception;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.lang3.z;

/* JADX INFO: loaded from: classes14.dex */
public class d implements e, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f337158b = 20110706;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<uk.e<String, Object>> f337159a = new ArrayList();

    @Override // org.apache.commons.lang3.exception.e
    public List<uk.e<String, Object>> a() {
        return this.f337159a;
    }

    @Override // org.apache.commons.lang3.exception.e
    public List<Object> c(String str) {
        ArrayList arrayList = new ArrayList();
        for (uk.e<String, Object> eVar : this.f337159a) {
            if (z.R(str, eVar.getKey())) {
                arrayList.add(eVar.getValue());
            }
        }
        return arrayList;
    }

    @Override // org.apache.commons.lang3.exception.e
    public Set<String> d() {
        HashSet hashSet = new HashSet();
        Iterator<uk.e<String, Object>> it = this.f337159a.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getKey());
        }
        return hashSet;
    }

    @Override // org.apache.commons.lang3.exception.e
    public String e(String str) {
        String string;
        StringBuilder sb2 = new StringBuilder(256);
        if (str != null) {
            sb2.append(str);
        }
        if (this.f337159a.size() > 0) {
            if (sb2.length() > 0) {
                sb2.append('\n');
            }
            sb2.append("Exception Context:\n");
            int i10 = 0;
            for (uk.e<String, Object> eVar : this.f337159a) {
                sb2.append("\t[");
                i10++;
                sb2.append(i10);
                sb2.append(AbstractJsonLexerKt.COLON);
                sb2.append(eVar.getKey());
                sb2.append("=");
                Object value = eVar.getValue();
                if (value == null) {
                    sb2.append(AbstractJsonLexerKt.NULL);
                } else {
                    try {
                        string = value.toString();
                    } catch (Exception e10) {
                        string = "Exception thrown on toString(): " + f.l(e10);
                    }
                    sb2.append(string);
                }
                sb2.append("]\n");
            }
            sb2.append("---------------------------------");
        }
        return sb2.toString();
    }

    @Override // org.apache.commons.lang3.exception.e
    public Object f(String str) {
        for (uk.e<String, Object> eVar : this.f337159a) {
            if (z.R(str, eVar.getKey())) {
                return eVar.getValue();
            }
        }
        return null;
    }

    @Override // org.apache.commons.lang3.exception.e
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public d b(String str, Object obj) {
        this.f337159a.add(new uk.a(str, obj));
        return this;
    }

    @Override // org.apache.commons.lang3.exception.e
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public d g(String str, Object obj) {
        Iterator<uk.e<String, Object>> it = this.f337159a.iterator();
        while (it.hasNext()) {
            if (z.R(str, it.next().getKey())) {
                it.remove();
            }
        }
        b(str, obj);
        return this;
    }
}
