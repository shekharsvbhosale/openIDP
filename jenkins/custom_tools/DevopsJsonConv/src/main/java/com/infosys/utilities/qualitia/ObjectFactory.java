//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.04 at 01:13:43 PM IST 
//
package com.infosys.utilities.qualitia;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {
	public QualitiaTest createReport() {
		return new QualitiaTest();
	}

	public QualitiaTest.Suite createReportSuite() {
		return new QualitiaTest.Suite();
	}

	public QualitiaTest.Suite.TCs createReportSuiteTCs() {
		return new QualitiaTest.Suite.TCs();
	}

	public QualitiaTest.Suite.TCs.TC createReportSuiteTCsTC() {
		return new QualitiaTest.Suite.TCs.TC();
	}

	public QualitiaTest.Suite.TCs.TC.TCIteration createReportSuiteTCsTCTCIteration() {
		return new QualitiaTest.Suite.TCs.TC.TCIteration();
	}
}