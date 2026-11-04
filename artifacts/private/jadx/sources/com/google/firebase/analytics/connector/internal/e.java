package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.common.internal.w;
import com.google.android.gms.measurement.internal.s8;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Set f120723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.firebase.analytics.connector.a.b f120724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n6.a f120725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f120726d;

    public e(n6.a aVar, com.google.firebase.analytics.connector.a.b bVar) {
        this.f120724b = bVar;
        this.f120725c = aVar;
        d dVar = new d(this);
        this.f120726d = dVar;
        aVar.s(dVar);
        this.f120723a = new HashSet();
    }

    @Override // com.google.firebase.analytics.connector.internal.a
    public final com.google.firebase.analytics.connector.a.b a() {
        return this.f120724b;
    }

    @Override // com.google.firebase.analytics.connector.internal.a
    public final void b(Set set) {
        Set set2 = this.f120723a;
        set2.clear();
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (hashSet.size() < 50) {
                int i10 = c.f120721g;
                if (str != null && str.length() != 0) {
                    int iCodePointAt = str.codePointAt(0);
                    if (!Character.isLetter(iCodePointAt)) {
                        if (iCodePointAt == 95) {
                            iCodePointAt = 95;
                        }
                    }
                    int length = str.length();
                    int iCharCount = Character.charCount(iCodePointAt);
                    while (true) {
                        if (iCharCount >= length) {
                            if (str.length() == 0) {
                                break;
                            }
                            int iCodePointAt2 = str.codePointAt(0);
                            if (!Character.isLetter(iCodePointAt2)) {
                                break;
                            }
                            int length2 = str.length();
                            int iCharCount2 = Character.charCount(iCodePointAt2);
                            while (true) {
                                if (iCharCount2 < length2) {
                                    int iCodePointAt3 = str.codePointAt(iCharCount2);
                                    if (iCodePointAt3 != 95 && !Character.isLetterOrDigit(iCodePointAt3)) {
                                        break;
                                    } else {
                                        iCharCount2 += Character.charCount(iCodePointAt3);
                                    }
                                } else {
                                    String strB = s8.b(str);
                                    if (strB != null) {
                                        str = strB;
                                    }
                                    w.r(str);
                                    hashSet.add(str);
                                    break;
                                }
                            }
                        } else {
                            int iCodePointAt4 = str.codePointAt(iCharCount);
                            if (iCodePointAt4 != 95 && !Character.isLetterOrDigit(iCodePointAt4)) {
                                break;
                            } else {
                                iCharCount += Character.charCount(iCodePointAt4);
                            }
                        }
                    }
                }
            } else {
                break;
            }
        }
        set2.addAll(hashSet);
    }

    final /* synthetic */ com.google.firebase.analytics.connector.a.b c() {
        return this.f120724b;
    }

    @Override // com.google.firebase.analytics.connector.internal.a
    public final void h() {
        this.f120723a.clear();
    }
}
