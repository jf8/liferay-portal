/**
 * Copyright (c) 2000-2009 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portlet.messageboards.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.BooleanWrapper;
import com.liferay.portal.kernel.util.DoubleWrapper;
import com.liferay.portal.kernel.util.IntegerWrapper;
import com.liferay.portal.kernel.util.LongWrapper;
import com.liferay.portal.kernel.util.MethodWrapper;
import com.liferay.portal.kernel.util.NullWrapper;
import com.liferay.portal.security.auth.HttpPrincipal;
import com.liferay.portal.service.http.TunnelUtil;

import com.liferay.portlet.messageboards.service.MBMessageServiceUtil;

/**
 * <a href="MBMessageServiceHttp.java.html"><b><i>View Source</i></b></a>
 *
 * <p>
 * ServiceBuilder generated this class. Modifications in this class will be
 * overwritten the next time is generated.
 * </p>
 *
 * <p>
 * This class provides a HTTP utility for the
 * {@link com.liferay.portlet.messageboards.service.MBMessageServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * {@link com.liferay.portal.security.auth.HttpPrincipal} parameter.
 * </p>
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       MBMessageServiceSoap
 * @see       com.liferay.portal.security.auth.HttpPrincipal
 * @see       com.liferay.portlet.messageboards.service.MBMessageServiceUtil
 * @generated
 */
public class MBMessageServiceHttp {
	public static com.liferay.portlet.messageboards.model.MBMessage addDiscussionMessage(
		HttpPrincipal httpPrincipal, java.lang.String className, long classPK,
		long threadId, long parentMessageId, java.lang.String subject,
		java.lang.String body, int status,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		try {
			Object paramObj0 = className;

			if (className == null) {
				paramObj0 = new NullWrapper("java.lang.String");
			}

			Object paramObj1 = new LongWrapper(classPK);

			Object paramObj2 = new LongWrapper(threadId);

			Object paramObj3 = new LongWrapper(parentMessageId);

			Object paramObj4 = subject;

			if (subject == null) {
				paramObj4 = new NullWrapper("java.lang.String");
			}

			Object paramObj5 = body;

			if (body == null) {
				paramObj5 = new NullWrapper("java.lang.String");
			}

			Object paramObj6 = new IntegerWrapper(status);

			Object paramObj7 = serviceContext;

			if (serviceContext == null) {
				paramObj7 = new NullWrapper(
						"com.liferay.portal.service.ServiceContext");
			}

			MethodWrapper methodWrapper = new MethodWrapper(MBMessageServiceUtil.class.getName(),
					"addDiscussionMessage",
					new Object[] {
						paramObj0, paramObj1, paramObj2, paramObj3, paramObj4,
						paramObj5, paramObj6, paramObj7
					});

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodWrapper);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.PortalException) {
					throw (com.liferay.portal.PortalException)e;
				}

				if (e instanceof com.liferay.portal.SystemException) {
					throw (com.liferay.portal.SystemException)e;
				}

				throw new com.liferay.portal.SystemException(e);
			}

			return (com.liferay.portlet.messageboards.model.MBMessage)returnObj;
		}
		catch (com.liferay.portal.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portlet.messageboards.model.MBMessage addMessage(
		HttpPrincipal httpPrincipal, long categoryId, java.lang.String subject,
		java.lang.String body,
		java.util.List<com.liferay.portal.kernel.util.ObjectValuePair<String, byte[]>> files,
		boolean anonymous, double priority, int status,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		try {
			Object paramObj0 = new LongWrapper(categoryId);

			Object paramObj1 = subject;

			if (subject == null) {
				paramObj1 = new NullWrapper("java.lang.String");
			}

			Object paramObj2 = body;

			if (body == null) {
				paramObj2 = new NullWrapper("java.lang.String");
			}

			Object paramObj3 = files;

			if (files == null) {
				paramObj3 = new NullWrapper("java.util.List");
			}

			Object paramObj4 = new BooleanWrapper(anonymous);

			Object paramObj5 = new DoubleWrapper(priority);

			Object paramObj6 = new IntegerWrapper(status);

			Object paramObj7 = serviceContext;

			if (serviceContext == null) {
				paramObj7 = new NullWrapper(
						"com.liferay.portal.service.ServiceContext");
			}

			MethodWrapper methodWrapper = new MethodWrapper(MBMessageServiceUtil.class.getName(),
					"addMessage",
					new Object[] {
						paramObj0, paramObj1, paramObj2, paramObj3, paramObj4,
						paramObj5, paramObj6, paramObj7
					});

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodWrapper);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.PortalException) {
					throw (com.liferay.portal.PortalException)e;
				}

				if (e instanceof com.liferay.portal.SystemException) {
					throw (com.liferay.portal.SystemException)e;
				}

				throw new com.liferay.portal.SystemException(e);
			}

			return (com.liferay.portlet.messageboards.model.MBMessage)returnObj;
		}
		catch (com.liferay.portal.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portlet.messageboards.model.MBMessage addMessage(
		HttpPrincipal httpPrincipal, long categoryId, long threadId,
		long parentMessageId, java.lang.String subject, java.lang.String body,
		java.util.List<com.liferay.portal.kernel.util.ObjectValuePair<String, byte[]>> files,
		boolean anonymous, double priority, int status,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		try {
			Object paramObj0 = new LongWrapper(categoryId);

			Object paramObj1 = new LongWrapper(threadId);

			Object paramObj2 = new LongWrapper(parentMessageId);

			Object paramObj3 = subject;

			if (subject == null) {
				paramObj3 = new NullWrapper("java.lang.String");
			}

			Object paramObj4 = body;

			if (body == null) {
				paramObj4 = new NullWrapper("java.lang.String");
			}

			Object paramObj5 = files;

			if (files == null) {
				paramObj5 = new NullWrapper("java.util.List");
			}

			Object paramObj6 = new BooleanWrapper(anonymous);

			Object paramObj7 = new DoubleWrapper(priority);

			Object paramObj8 = new IntegerWrapper(status);

			Object paramObj9 = serviceContext;

			if (serviceContext == null) {
				paramObj9 = new NullWrapper(
						"com.liferay.portal.service.ServiceContext");
			}

			MethodWrapper methodWrapper = new MethodWrapper(MBMessageServiceUtil.class.getName(),
					"addMessage",
					new Object[] {
						paramObj0, paramObj1, paramObj2, paramObj3, paramObj4,
						paramObj5, paramObj6, paramObj7, paramObj8, paramObj9
					});

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodWrapper);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.PortalException) {
					throw (com.liferay.portal.PortalException)e;
				}

				if (e instanceof com.liferay.portal.SystemException) {
					throw (com.liferay.portal.SystemException)e;
				}

				throw new com.liferay.portal.SystemException(e);
			}

			return (com.liferay.portlet.messageboards.model.MBMessage)returnObj;
		}
		catch (com.liferay.portal.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void deleteDiscussionMessage(HttpPrincipal httpPrincipal,
		long groupId, java.lang.String className, long classPK, long messageId)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		try {
			Object paramObj0 = new LongWrapper(groupId);

			Object paramObj1 = className;

			if (className == null) {
				paramObj1 = new NullWrapper("java.lang.String");
			}

			Object paramObj2 = new LongWrapper(classPK);

			Object paramObj3 = new LongWrapper(messageId);

			MethodWrapper methodWrapper = new MethodWrapper(MBMessageServiceUtil.class.getName(),
					"deleteDiscussionMessage",
					new Object[] { paramObj0, paramObj1, paramObj2, paramObj3 });

			try {
				TunnelUtil.invoke(httpPrincipal, methodWrapper);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.PortalException) {
					throw (com.liferay.portal.PortalException)e;
				}

				if (e instanceof com.liferay.portal.SystemException) {
					throw (com.liferay.portal.SystemException)e;
				}

				throw new com.liferay.portal.SystemException(e);
			}
		}
		catch (com.liferay.portal.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void deleteMessage(HttpPrincipal httpPrincipal, long messageId)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		try {
			Object paramObj0 = new LongWrapper(messageId);

			MethodWrapper methodWrapper = new MethodWrapper(MBMessageServiceUtil.class.getName(),
					"deleteMessage", new Object[] { paramObj0 });

			try {
				TunnelUtil.invoke(httpPrincipal, methodWrapper);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.PortalException) {
					throw (com.liferay.portal.PortalException)e;
				}

				if (e instanceof com.liferay.portal.SystemException) {
					throw (com.liferay.portal.SystemException)e;
				}

				throw new com.liferay.portal.SystemException(e);
			}
		}
		catch (com.liferay.portal.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.liferay.portlet.messageboards.model.MBMessage> getCategoryMessages(
		HttpPrincipal httpPrincipal, long categoryId, int status, int start,
		int end)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		try {
			Object paramObj0 = new LongWrapper(categoryId);

			Object paramObj1 = new IntegerWrapper(status);

			Object paramObj2 = new IntegerWrapper(start);

			Object paramObj3 = new IntegerWrapper(end);

			MethodWrapper methodWrapper = new MethodWrapper(MBMessageServiceUtil.class.getName(),
					"getCategoryMessages",
					new Object[] { paramObj0, paramObj1, paramObj2, paramObj3 });

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodWrapper);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.PortalException) {
					throw (com.liferay.portal.PortalException)e;
				}

				if (e instanceof com.liferay.portal.SystemException) {
					throw (com.liferay.portal.SystemException)e;
				}

				throw new com.liferay.portal.SystemException(e);
			}

			return (java.util.List<com.liferay.portlet.messageboards.model.MBMessage>)returnObj;
		}
		catch (com.liferay.portal.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static int getCategoryMessagesCount(HttpPrincipal httpPrincipal,
		long categoryId, int status) throws com.liferay.portal.SystemException {
		try {
			Object paramObj0 = new LongWrapper(categoryId);

			Object paramObj1 = new IntegerWrapper(status);

			MethodWrapper methodWrapper = new MethodWrapper(MBMessageServiceUtil.class.getName(),
					"getCategoryMessagesCount",
					new Object[] { paramObj0, paramObj1 });

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodWrapper);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.SystemException) {
					throw (com.liferay.portal.SystemException)e;
				}

				throw new com.liferay.portal.SystemException(e);
			}

			return ((Integer)returnObj).intValue();
		}
		catch (com.liferay.portal.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.lang.String getCategoryMessagesRSS(
		HttpPrincipal httpPrincipal, long categoryId, int status, int max,
		java.lang.String type, double version, java.lang.String displayStyle,
		java.lang.String feedURL, java.lang.String entryURL,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		try {
			Object paramObj0 = new LongWrapper(categoryId);

			Object paramObj1 = new IntegerWrapper(status);

			Object paramObj2 = new IntegerWrapper(max);

			Object paramObj3 = type;

			if (type == null) {
				paramObj3 = new NullWrapper("java.lang.String");
			}

			Object paramObj4 = new DoubleWrapper(version);

			Object paramObj5 = displayStyle;

			if (displayStyle == null) {
				paramObj5 = new NullWrapper("java.lang.String");
			}

			Object paramObj6 = feedURL;

			if (feedURL == null) {
				paramObj6 = new NullWrapper("java.lang.String");
			}

			Object paramObj7 = entryURL;

			if (entryURL == null) {
				paramObj7 = new NullWrapper("java.lang.String");
			}

			Object paramObj8 = themeDisplay;

			if (themeDisplay == null) {
				paramObj8 = new NullWrapper(
						"com.liferay.portal.theme.ThemeDisplay");
			}

			MethodWrapper methodWrapper = new MethodWrapper(MBMessageServiceUtil.class.getName(),
					"getCategoryMessagesRSS",
					new Object[] {
						paramObj0, paramObj1, paramObj2, paramObj3, paramObj4,
						paramObj5, paramObj6, paramObj7, paramObj8
					});

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodWrapper);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.PortalException) {
					throw (com.liferay.portal.PortalException)e;
				}

				if (e instanceof com.liferay.portal.SystemException) {
					throw (com.liferay.portal.SystemException)e;
				}

				throw new com.liferay.portal.SystemException(e);
			}

			return (java.lang.String)returnObj;
		}
		catch (com.liferay.portal.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.lang.String getCompanyMessagesRSS(
		HttpPrincipal httpPrincipal, long companyId, int status, int max,
		java.lang.String type, double version, java.lang.String displayStyle,
		java.lang.String feedURL, java.lang.String entryURL,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		try {
			Object paramObj0 = new LongWrapper(companyId);

			Object paramObj1 = new IntegerWrapper(status);

			Object paramObj2 = new IntegerWrapper(max);

			Object paramObj3 = type;

			if (type == null) {
				paramObj3 = new NullWrapper("java.lang.String");
			}

			Object paramObj4 = new DoubleWrapper(version);

			Object paramObj5 = displayStyle;

			if (displayStyle == null) {
				paramObj5 = new NullWrapper("java.lang.String");
			}

			Object paramObj6 = feedURL;

			if (feedURL == null) {
				paramObj6 = new NullWrapper("java.lang.String");
			}

			Object paramObj7 = entryURL;

			if (entryURL == null) {
				paramObj7 = new NullWrapper("java.lang.String");
			}

			Object paramObj8 = themeDisplay;

			if (themeDisplay == null) {
				paramObj8 = new NullWrapper(
						"com.liferay.portal.theme.ThemeDisplay");
			}

			MethodWrapper methodWrapper = new MethodWrapper(MBMessageServiceUtil.class.getName(),
					"getCompanyMessagesRSS",
					new Object[] {
						paramObj0, paramObj1, paramObj2, paramObj3, paramObj4,
						paramObj5, paramObj6, paramObj7, paramObj8
					});

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodWrapper);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.PortalException) {
					throw (com.liferay.portal.PortalException)e;
				}

				if (e instanceof com.liferay.portal.SystemException) {
					throw (com.liferay.portal.SystemException)e;
				}

				throw new com.liferay.portal.SystemException(e);
			}

			return (java.lang.String)returnObj;
		}
		catch (com.liferay.portal.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.lang.String getGroupMessagesRSS(
		HttpPrincipal httpPrincipal, long groupId, int status, int max,
		java.lang.String type, double version, java.lang.String displayStyle,
		java.lang.String feedURL, java.lang.String entryURL,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		try {
			Object paramObj0 = new LongWrapper(groupId);

			Object paramObj1 = new IntegerWrapper(status);

			Object paramObj2 = new IntegerWrapper(max);

			Object paramObj3 = type;

			if (type == null) {
				paramObj3 = new NullWrapper("java.lang.String");
			}

			Object paramObj4 = new DoubleWrapper(version);

			Object paramObj5 = displayStyle;

			if (displayStyle == null) {
				paramObj5 = new NullWrapper("java.lang.String");
			}

			Object paramObj6 = feedURL;

			if (feedURL == null) {
				paramObj6 = new NullWrapper("java.lang.String");
			}

			Object paramObj7 = entryURL;

			if (entryURL == null) {
				paramObj7 = new NullWrapper("java.lang.String");
			}

			Object paramObj8 = themeDisplay;

			if (themeDisplay == null) {
				paramObj8 = new NullWrapper(
						"com.liferay.portal.theme.ThemeDisplay");
			}

			MethodWrapper methodWrapper = new MethodWrapper(MBMessageServiceUtil.class.getName(),
					"getGroupMessagesRSS",
					new Object[] {
						paramObj0, paramObj1, paramObj2, paramObj3, paramObj4,
						paramObj5, paramObj6, paramObj7, paramObj8
					});

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodWrapper);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.PortalException) {
					throw (com.liferay.portal.PortalException)e;
				}

				if (e instanceof com.liferay.portal.SystemException) {
					throw (com.liferay.portal.SystemException)e;
				}

				throw new com.liferay.portal.SystemException(e);
			}

			return (java.lang.String)returnObj;
		}
		catch (com.liferay.portal.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.lang.String getGroupMessagesRSS(
		HttpPrincipal httpPrincipal, long groupId, long userId, int status,
		int max, java.lang.String type, double version,
		java.lang.String displayStyle, java.lang.String feedURL,
		java.lang.String entryURL,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		try {
			Object paramObj0 = new LongWrapper(groupId);

			Object paramObj1 = new LongWrapper(userId);

			Object paramObj2 = new IntegerWrapper(status);

			Object paramObj3 = new IntegerWrapper(max);

			Object paramObj4 = type;

			if (type == null) {
				paramObj4 = new NullWrapper("java.lang.String");
			}

			Object paramObj5 = new DoubleWrapper(version);

			Object paramObj6 = displayStyle;

			if (displayStyle == null) {
				paramObj6 = new NullWrapper("java.lang.String");
			}

			Object paramObj7 = feedURL;

			if (feedURL == null) {
				paramObj7 = new NullWrapper("java.lang.String");
			}

			Object paramObj8 = entryURL;

			if (entryURL == null) {
				paramObj8 = new NullWrapper("java.lang.String");
			}

			Object paramObj9 = themeDisplay;

			if (themeDisplay == null) {
				paramObj9 = new NullWrapper(
						"com.liferay.portal.theme.ThemeDisplay");
			}

			MethodWrapper methodWrapper = new MethodWrapper(MBMessageServiceUtil.class.getName(),
					"getGroupMessagesRSS",
					new Object[] {
						paramObj0, paramObj1, paramObj2, paramObj3, paramObj4,
						paramObj5, paramObj6, paramObj7, paramObj8, paramObj9
					});

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodWrapper);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.PortalException) {
					throw (com.liferay.portal.PortalException)e;
				}

				if (e instanceof com.liferay.portal.SystemException) {
					throw (com.liferay.portal.SystemException)e;
				}

				throw new com.liferay.portal.SystemException(e);
			}

			return (java.lang.String)returnObj;
		}
		catch (com.liferay.portal.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portlet.messageboards.model.MBMessage getMessage(
		HttpPrincipal httpPrincipal, long messageId)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		try {
			Object paramObj0 = new LongWrapper(messageId);

			MethodWrapper methodWrapper = new MethodWrapper(MBMessageServiceUtil.class.getName(),
					"getMessage", new Object[] { paramObj0 });

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodWrapper);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.PortalException) {
					throw (com.liferay.portal.PortalException)e;
				}

				if (e instanceof com.liferay.portal.SystemException) {
					throw (com.liferay.portal.SystemException)e;
				}

				throw new com.liferay.portal.SystemException(e);
			}

			return (com.liferay.portlet.messageboards.model.MBMessage)returnObj;
		}
		catch (com.liferay.portal.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portlet.messageboards.model.MBMessageDisplay getMessageDisplay(
		HttpPrincipal httpPrincipal, long messageId, int status,
		java.lang.String threadView)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		try {
			Object paramObj0 = new LongWrapper(messageId);

			Object paramObj1 = new IntegerWrapper(status);

			Object paramObj2 = threadView;

			if (threadView == null) {
				paramObj2 = new NullWrapper("java.lang.String");
			}

			MethodWrapper methodWrapper = new MethodWrapper(MBMessageServiceUtil.class.getName(),
					"getMessageDisplay",
					new Object[] { paramObj0, paramObj1, paramObj2 });

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodWrapper);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.PortalException) {
					throw (com.liferay.portal.PortalException)e;
				}

				if (e instanceof com.liferay.portal.SystemException) {
					throw (com.liferay.portal.SystemException)e;
				}

				throw new com.liferay.portal.SystemException(e);
			}

			return (com.liferay.portlet.messageboards.model.MBMessageDisplay)returnObj;
		}
		catch (com.liferay.portal.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.lang.String getThreadMessagesRSS(
		HttpPrincipal httpPrincipal, long threadId, int status, int max,
		java.lang.String type, double version, java.lang.String displayStyle,
		java.lang.String feedURL, java.lang.String entryURL,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		try {
			Object paramObj0 = new LongWrapper(threadId);

			Object paramObj1 = new IntegerWrapper(status);

			Object paramObj2 = new IntegerWrapper(max);

			Object paramObj3 = type;

			if (type == null) {
				paramObj3 = new NullWrapper("java.lang.String");
			}

			Object paramObj4 = new DoubleWrapper(version);

			Object paramObj5 = displayStyle;

			if (displayStyle == null) {
				paramObj5 = new NullWrapper("java.lang.String");
			}

			Object paramObj6 = feedURL;

			if (feedURL == null) {
				paramObj6 = new NullWrapper("java.lang.String");
			}

			Object paramObj7 = entryURL;

			if (entryURL == null) {
				paramObj7 = new NullWrapper("java.lang.String");
			}

			Object paramObj8 = themeDisplay;

			if (themeDisplay == null) {
				paramObj8 = new NullWrapper(
						"com.liferay.portal.theme.ThemeDisplay");
			}

			MethodWrapper methodWrapper = new MethodWrapper(MBMessageServiceUtil.class.getName(),
					"getThreadMessagesRSS",
					new Object[] {
						paramObj0, paramObj1, paramObj2, paramObj3, paramObj4,
						paramObj5, paramObj6, paramObj7, paramObj8
					});

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodWrapper);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.PortalException) {
					throw (com.liferay.portal.PortalException)e;
				}

				if (e instanceof com.liferay.portal.SystemException) {
					throw (com.liferay.portal.SystemException)e;
				}

				throw new com.liferay.portal.SystemException(e);
			}

			return (java.lang.String)returnObj;
		}
		catch (com.liferay.portal.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void subscribeMessage(HttpPrincipal httpPrincipal,
		long messageId)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		try {
			Object paramObj0 = new LongWrapper(messageId);

			MethodWrapper methodWrapper = new MethodWrapper(MBMessageServiceUtil.class.getName(),
					"subscribeMessage", new Object[] { paramObj0 });

			try {
				TunnelUtil.invoke(httpPrincipal, methodWrapper);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.PortalException) {
					throw (com.liferay.portal.PortalException)e;
				}

				if (e instanceof com.liferay.portal.SystemException) {
					throw (com.liferay.portal.SystemException)e;
				}

				throw new com.liferay.portal.SystemException(e);
			}
		}
		catch (com.liferay.portal.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static void unsubscribeMessage(HttpPrincipal httpPrincipal,
		long messageId)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		try {
			Object paramObj0 = new LongWrapper(messageId);

			MethodWrapper methodWrapper = new MethodWrapper(MBMessageServiceUtil.class.getName(),
					"unsubscribeMessage", new Object[] { paramObj0 });

			try {
				TunnelUtil.invoke(httpPrincipal, methodWrapper);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.PortalException) {
					throw (com.liferay.portal.PortalException)e;
				}

				if (e instanceof com.liferay.portal.SystemException) {
					throw (com.liferay.portal.SystemException)e;
				}

				throw new com.liferay.portal.SystemException(e);
			}
		}
		catch (com.liferay.portal.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portlet.messageboards.model.MBMessage updateDiscussionMessage(
		HttpPrincipal httpPrincipal, java.lang.String className, long classPK,
		long messageId, java.lang.String subject, java.lang.String body,
		int status, com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		try {
			Object paramObj0 = className;

			if (className == null) {
				paramObj0 = new NullWrapper("java.lang.String");
			}

			Object paramObj1 = new LongWrapper(classPK);

			Object paramObj2 = new LongWrapper(messageId);

			Object paramObj3 = subject;

			if (subject == null) {
				paramObj3 = new NullWrapper("java.lang.String");
			}

			Object paramObj4 = body;

			if (body == null) {
				paramObj4 = new NullWrapper("java.lang.String");
			}

			Object paramObj5 = new IntegerWrapper(status);

			Object paramObj6 = serviceContext;

			if (serviceContext == null) {
				paramObj6 = new NullWrapper(
						"com.liferay.portal.service.ServiceContext");
			}

			MethodWrapper methodWrapper = new MethodWrapper(MBMessageServiceUtil.class.getName(),
					"updateDiscussionMessage",
					new Object[] {
						paramObj0, paramObj1, paramObj2, paramObj3, paramObj4,
						paramObj5, paramObj6
					});

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodWrapper);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.PortalException) {
					throw (com.liferay.portal.PortalException)e;
				}

				if (e instanceof com.liferay.portal.SystemException) {
					throw (com.liferay.portal.SystemException)e;
				}

				throw new com.liferay.portal.SystemException(e);
			}

			return (com.liferay.portlet.messageboards.model.MBMessage)returnObj;
		}
		catch (com.liferay.portal.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portlet.messageboards.model.MBMessage updateMessage(
		HttpPrincipal httpPrincipal, long messageId, java.lang.String subject,
		java.lang.String body,
		java.util.List<com.liferay.portal.kernel.util.ObjectValuePair<String, byte[]>> files,
		java.util.List<String> existingFiles, double priority, int status,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		try {
			Object paramObj0 = new LongWrapper(messageId);

			Object paramObj1 = subject;

			if (subject == null) {
				paramObj1 = new NullWrapper("java.lang.String");
			}

			Object paramObj2 = body;

			if (body == null) {
				paramObj2 = new NullWrapper("java.lang.String");
			}

			Object paramObj3 = files;

			if (files == null) {
				paramObj3 = new NullWrapper("java.util.List");
			}

			Object paramObj4 = existingFiles;

			if (existingFiles == null) {
				paramObj4 = new NullWrapper("java.util.List");
			}

			Object paramObj5 = new DoubleWrapper(priority);

			Object paramObj6 = new IntegerWrapper(status);

			Object paramObj7 = serviceContext;

			if (serviceContext == null) {
				paramObj7 = new NullWrapper(
						"com.liferay.portal.service.ServiceContext");
			}

			MethodWrapper methodWrapper = new MethodWrapper(MBMessageServiceUtil.class.getName(),
					"updateMessage",
					new Object[] {
						paramObj0, paramObj1, paramObj2, paramObj3, paramObj4,
						paramObj5, paramObj6, paramObj7
					});

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodWrapper);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.PortalException) {
					throw (com.liferay.portal.PortalException)e;
				}

				if (e instanceof com.liferay.portal.SystemException) {
					throw (com.liferay.portal.SystemException)e;
				}

				throw new com.liferay.portal.SystemException(e);
			}

			return (com.liferay.portlet.messageboards.model.MBMessage)returnObj;
		}
		catch (com.liferay.portal.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(MBMessageServiceHttp.class);
}