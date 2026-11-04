package com.devtodev.core.utils.k;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes3.dex */
public class a {
    public static String a(String str, String str2) {
        return str;
    }

    public static String b(String str, String str2) throws UnsupportedEncodingException {
        return URLEncoder.encode(str, str2);
    }
}
