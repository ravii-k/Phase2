package org.simplilearn.workshop.util;

public class StringUtil {
	public static String fixSqlFieldValue(String value) {
		if (value == null) {
			return null;
		}
		int length = value.length();
		StringBuffer fixedValue = new StringBuffer((int)(length*1.1));
		for(int i = 0 ; i < length ;i++) {
			char c = value.charAt(i);
			if ( c == '\'') {
				fixedValue.append("''");
			}else {
				fixedValue.append(c);
			}
		}
		return fixedValue.toString();
	}
	
	public static String encodeHtmlTag(String tag) {
		if (tag==null)
			return null;
		int length = tag.length();
		StringBuffer encodedTag = new StringBuffer(2 * length);
		for(int i = 0 ; i < length;i++) {
			char c = tag.charAt(i);
			if(c=='<')
				encodedTag.append("<");
			else if(c=='>')
				encodedTag.append(">");
			else if(c=='&')
				encodedTag.append("&amp;");
			else if(c=='"')
				encodedTag.append("&quot;");
			else if(c==' ')
				encodedTag.append("&nbsp;");
			else
				encodedTag.append(c);
		}
		return encodedTag.toString();
	}
}
