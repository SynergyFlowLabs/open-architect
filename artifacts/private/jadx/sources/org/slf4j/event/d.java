package org.slf4j.event;

import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f339590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f339591b;

    public d(String str, Object obj) {
        this.f339590a = str;
        this.f339591b = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            d dVar = (d) obj;
            if (Objects.equals(this.f339590a, dVar.f339590a) && Objects.equals(this.f339591b, dVar.f339591b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f339590a, this.f339591b);
    }

    public String toString() {
        return String.valueOf(this.f339590a) + "=\"" + String.valueOf(this.f339591b) + "\"";
    }
}
