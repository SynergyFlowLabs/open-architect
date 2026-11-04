package com.appsflyer.internal;

import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class AFg1eSDK {
    private StringBuilder getRevenue = new StringBuilder();
    private final List<AFa1uSDK> getMonetizationNetwork = new ArrayList();
    private final String getCurrencyIso4217Code = null;

    enum AFa1uSDK {
        EMPTY_ARRAY,
        NONEMPTY_ARRAY,
        EMPTY_OBJECT,
        DANGLING_KEY,
        NONEMPTY_OBJECT,
        NULL
    }

    private void getMediationNetwork() throws AFg1mSDK {
        if (this.getMonetizationNetwork.isEmpty()) {
            return;
        }
        AFa1uSDK aFa1uSDKAFAdRevenueData = AFAdRevenueData();
        if (aFa1uSDKAFAdRevenueData == AFa1uSDK.EMPTY_ARRAY) {
            AFa1uSDK aFa1uSDK = AFa1uSDK.NONEMPTY_ARRAY;
            List<AFa1uSDK> list = this.getMonetizationNetwork;
            list.set(list.size() - 1, aFa1uSDK);
        } else {
            if (aFa1uSDKAFAdRevenueData == AFa1uSDK.NONEMPTY_ARRAY) {
                this.getRevenue.append(AbstractJsonLexerKt.COMMA);
                return;
            }
            if (aFa1uSDKAFAdRevenueData != AFa1uSDK.DANGLING_KEY) {
                if (aFa1uSDKAFAdRevenueData != AFa1uSDK.NULL) {
                    throw new AFg1mSDK("Nesting problem");
                }
            } else {
                this.getRevenue.append(":");
                AFa1uSDK aFa1uSDK2 = AFa1uSDK.NONEMPTY_OBJECT;
                List<AFa1uSDK> list2 = this.getMonetizationNetwork;
                list2.set(list2.size() - 1, aFa1uSDK2);
            }
        }
    }

    public final AFg1eSDK AFAdRevenueData(AFa1uSDK aFa1uSDK, AFa1uSDK aFa1uSDK2, String str) throws AFg1mSDK {
        AFa1uSDK aFa1uSDKAFAdRevenueData = AFAdRevenueData();
        if (aFa1uSDKAFAdRevenueData != aFa1uSDK2 && aFa1uSDKAFAdRevenueData != aFa1uSDK) {
            throw new AFg1mSDK("Nesting problem");
        }
        List<AFa1uSDK> list = this.getMonetizationNetwork;
        list.remove(list.size() - 1);
        this.getRevenue.append(str);
        return this;
    }

    public final AFg1eSDK getCurrencyIso4217Code(AFa1uSDK aFa1uSDK, String str) throws AFg1mSDK {
        if (this.getMonetizationNetwork.isEmpty() && this.getRevenue.length() > 0) {
            throw new AFg1mSDK("Nesting problem: multiple top-level roots");
        }
        getMediationNetwork();
        this.getMonetizationNetwork.add(aFa1uSDK);
        this.getRevenue.append(str);
        return this;
    }

    final void getMonetizationNetwork() throws AFg1mSDK {
        AFa1uSDK aFa1uSDKAFAdRevenueData = AFAdRevenueData();
        if (aFa1uSDKAFAdRevenueData == AFa1uSDK.NONEMPTY_OBJECT) {
            this.getRevenue.append(AbstractJsonLexerKt.COMMA);
        } else if (aFa1uSDKAFAdRevenueData != AFa1uSDK.EMPTY_OBJECT) {
            throw new AFg1mSDK("Nesting problem");
        }
        AFa1uSDK aFa1uSDK = AFa1uSDK.DANGLING_KEY;
        List<AFa1uSDK> list = this.getMonetizationNetwork;
        list.set(list.size() - 1, aFa1uSDK);
    }

    public final AFg1eSDK getRevenue(Object obj) throws AFg1mSDK {
        if (this.getMonetizationNetwork.isEmpty()) {
            throw new AFg1mSDK("Nesting problem");
        }
        if (((Class) AFa1kSDK.getCurrencyIso4217Code(321 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (2133 - Drawable.resolveOpacity(0, 0)), 37 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).isInstance(obj)) {
            try {
                Object[] objArr = {this};
                Map map = AFa1kSDK.f89663i;
                Object declaredMethod = map.get(704691833);
                if (declaredMethod == null) {
                    declaredMethod = ((Class) AFa1kSDK.getCurrencyIso4217Code((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + com.rabbitmq.client.a.f264844o, (char) (2133 - KeyEvent.keyCodeFromString("")), TextUtils.indexOf("", org.locationtech.jts.geom.l.f338160j) + 37)).getDeclaredMethod("getMonetizationNetwork", AFg1eSDK.class);
                    map.put(704691833, declaredMethod);
                }
                ((Method) declaredMethod).invoke(obj, objArr);
                return this;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
        }
        if (obj instanceof AFg1dSDK) {
            ((AFg1dSDK) obj).AFAdRevenueData(this);
            return this;
        }
        getMediationNetwork();
        if (obj == null || (obj instanceof Boolean) || obj == AFg1dSDK.getMonetizationNetwork) {
            this.getRevenue.append(obj);
            return this;
        }
        if (obj instanceof Number) {
            this.getRevenue.append(AFg1dSDK.getMediationNetwork((Number) obj));
            return this;
        }
        getCurrencyIso4217Code(obj.toString());
        return this;
    }

    public final String toString() {
        if (this.getRevenue.length() == 0) {
            return null;
        }
        return this.getRevenue.toString();
    }

    private AFa1uSDK AFAdRevenueData() throws AFg1mSDK {
        if (!this.getMonetizationNetwork.isEmpty()) {
            List<AFa1uSDK> list = this.getMonetizationNetwork;
            return list.get(list.size() - 1);
        }
        throw new AFg1mSDK("Nesting problem");
    }

    final void getCurrencyIso4217Code(String str) {
        this.getRevenue.append("\"");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\f') {
                this.getRevenue.append("\\f");
            } else if (cCharAt == '\r') {
                this.getRevenue.append("\\r");
            } else if (cCharAt != '\"' && cCharAt != '/' && cCharAt != '\\') {
                switch (cCharAt) {
                    case '\b':
                        this.getRevenue.append("\\b");
                        break;
                    case '\t':
                        this.getRevenue.append("\\t");
                        break;
                    case '\n':
                        this.getRevenue.append("\\n");
                        break;
                    default:
                        if (cCharAt <= 31) {
                            this.getRevenue.append(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                        } else {
                            this.getRevenue.append(cCharAt);
                        }
                        break;
                }
            } else {
                StringBuilder sb2 = this.getRevenue;
                sb2.append('\\');
                sb2.append(cCharAt);
            }
        }
        this.getRevenue.append("\"");
    }
}
