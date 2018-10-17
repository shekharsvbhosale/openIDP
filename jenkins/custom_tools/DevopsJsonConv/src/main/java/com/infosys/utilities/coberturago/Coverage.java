//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.13 at 11:15:25 AM IST 
//
package com.infosys.utilities.coberturago;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "packages" })
@XmlRootElement(name = "coverage")
public class Coverage {
	@XmlElement(required = true)
	protected Coverage.Packages packages;
	@XmlAttribute(name = "line-rate")
	protected Double lineRate;
	@XmlAttribute(name = "branch-rate")
	protected Double branchRate;
	@XmlAttribute(name = "version")
	protected String version;
	@XmlAttribute(name = "timestamp")
	protected BigDecimal timestamp;

	public Coverage.Packages getPackages() {
		return packages;
	}

	public void setPackages(Coverage.Packages value) {
		this.packages = value;
	}

	public Double getLineRate() {
		return lineRate;
	}

	public void setLineRate(Double value) {
		this.lineRate = value;
	}

	public Double getBranchRate() {
		return branchRate;
	}

	public void setBranchRate(Double value) {
		this.branchRate = value;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String value) {
		this.version = value;
	}

	public BigDecimal getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(BigDecimal value) {
		this.timestamp = value;
	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "_package" })
	public static class Packages {
		@XmlElement(name = "package", required = true)
		protected List<Coverage.Packages.Package> _package;

		public List<Coverage.Packages.Package> getPackage() {
			return _package;
		}

		public void setPackage(List<Coverage.Packages.Package> value) {
			this._package = value;
		}

		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "classes" })
		public static class Package {
			@XmlElement(required = true)
			protected Coverage.Packages.Package.Classes classes;
			@XmlAttribute(name = "name")
			protected String name;
			@XmlAttribute(name = "line-rate")
			protected Integer lineRate;
			@XmlAttribute(name = "branch-rate")
			protected Integer branchRate;
			@XmlAttribute(name = "complexity")
			protected Double complexity;

			public Coverage.Packages.Package.Classes getClasses() {
				return classes;
			}

			public void setClasses(Coverage.Packages.Package.Classes value) {
				this.classes = value;
			}

			public String getName() {
				return name;
			}

			public void setName(String value) {
				this.name = value;
			}

			public Integer getLineRate() {
				return lineRate;
			}

			public void setLineRate(Integer value) {
				this.lineRate = value;
			}

			public Integer getBranchRate() {
				return branchRate;
			}

			public void setBranchRate(Integer value) {
				this.branchRate = value;
			}

			public Double getComplexity() {
				return complexity;
			}

			public void setComplexity(Double value) {
				this.complexity = value;
			}

			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "clazz" })
			public static class Classes {
				@XmlElement(name = "class", required = true)
				protected List<Coverage.Packages.Package.Classes.Class> clazz;

				public List<Coverage.Packages.Package.Classes.Class> getClazz() {
					if (clazz == null) {
						clazz = new ArrayList<Coverage.Packages.Package.Classes.Class>();
					}
					return this.clazz;
				}

				@XmlAccessorType(XmlAccessType.FIELD)
				@XmlType(name = "", propOrder = { "methods", "lines" })
				public static class Class {
					@XmlElement(required = true)
					protected Coverage.Packages.Package.Classes.Class.Methods methods;
					@XmlElement(required = true)
					protected Coverage.Packages.Package.Classes.Class.Lines lines;
					@XmlAttribute(name = "name")
					protected String name;
					@XmlAttribute(name = "filename")
					protected String filename;
					@XmlAttribute(name = "line-rate")
					protected Integer lineRate;
					@XmlAttribute(name = "branch-rate")
					protected Integer branchRate;
					@XmlAttribute(name = "complexity")
					protected Integer complexity;

					public Coverage.Packages.Package.Classes.Class.Methods getMethods() {
						return methods;
					}

					public void setMethods(Coverage.Packages.Package.Classes.Class.Methods value) {
						this.methods = value;
					}

					public Coverage.Packages.Package.Classes.Class.Lines getLines() {
						return lines;
					}

					public void setLines(Coverage.Packages.Package.Classes.Class.Lines value) {
						this.lines = value;
					}

					public String getName() {
						return name;
					}

					public void setName(String value) {
						this.name = value;
					}

					public String getFilename() {
						return filename;
					}

					public void setFilename(String value) {
						this.filename = value;
					}

					public Integer getLineRate() {
						return lineRate;
					}

					public void setLineRate(Integer value) {
						this.lineRate = value;
					}

					public Integer getBranchRate() {
						return branchRate;
					}

					public void setBranchRate(Integer value) {
						this.branchRate = value;
					}

					public Integer getComplexity() {
						return complexity;
					}

					public void setComplexity(Integer value) {
						this.complexity = value;
					}

					@XmlAccessorType(XmlAccessType.FIELD)
					@XmlType(name = "", propOrder = { "line" })
					public static class Lines {
						@XmlElement(required = true)
						protected List<Coverage.Packages.Package.Classes.Class.Lines.Line> line;

						public List<Coverage.Packages.Package.Classes.Class.Lines.Line> getLine() {
							if (line == null) {
								line = new ArrayList<Coverage.Packages.Package.Classes.Class.Lines.Line>();
							}
							return this.line;
						}

						@XmlAccessorType(XmlAccessType.FIELD)
						@XmlType(name = "")
						public static class Line {
							@XmlAttribute(name = "number")
							protected Integer number;
							@XmlAttribute(name = "hits")
							protected Integer hits;
							@XmlAttribute(name = "branch")
							protected Boolean branch;
							@XmlAttribute(name = "condition-coverage")
							protected String conditionCoverage;

							public Integer getNumber() {
								return number;
							}

							public void setNumber(Integer value) {
								this.number = value;
							}

							public Integer getHits() {
								return hits;
							}

							public void setHits(Integer value) {
								this.hits = value;
							}

							public Boolean isBranch() {
								return branch;
							}

							public void setBranch(Boolean value) {
								this.branch = value;
							}

							public String getConditionCoverage() {
								return conditionCoverage;
							}

							public void setConditionCoverage(String value) {
								this.conditionCoverage = value;
							}
						}
					}

					@XmlAccessorType(XmlAccessType.FIELD)
					@XmlType(name = "", propOrder = { "method" })
					public static class Methods {
						@XmlElement(required = true)
						protected List<Coverage.Packages.Package.Classes.Class.Methods.Method> method;

						public List<Coverage.Packages.Package.Classes.Class.Methods.Method> getMethod() {
							if (method == null) {
								method = new ArrayList<Coverage.Packages.Package.Classes.Class.Methods.Method>();
							}
							return this.method;
						}

						@XmlAccessorType(XmlAccessType.FIELD)
						@XmlType(name = "", propOrder = { "lines" })
						public static class Method {
							@XmlElement(required = true)
							protected Coverage.Packages.Package.Classes.Class.Methods.Method.Lines lines;
							@XmlAttribute(name = "name")
							protected String name;
							@XmlAttribute(name = "signature")
							protected String signature;
							@XmlAttribute(name = "line-rate")
							protected Integer lineRate;
							@XmlAttribute(name = "branch-rate")
							protected Integer branchRate;

							public Coverage.Packages.Package.Classes.Class.Methods.Method.Lines getLines() {
								return lines;
							}

							public void setLines(Coverage.Packages.Package.Classes.Class.Methods.Method.Lines value) {
								this.lines = value;
							}

							public String getName() {
								return name;
							}

							public void setName(String value) {
								this.name = value;
							}

							public String getSignature() {
								return signature;
							}

							public void setSignature(String value) {
								this.signature = value;
							}

							public Integer getLineRate() {
								return lineRate;
							}

							public void setLineRate(Integer value) {
								this.lineRate = value;
							}

							public Integer getBranchRate() {
								return branchRate;
							}

							public void setBranchRate(Integer value) {
								this.branchRate = value;
							}

							@XmlAccessorType(XmlAccessType.FIELD)
							@XmlType(name = "", propOrder = { "line" })
							public static class Lines {
								@XmlElement(required = true)
								protected List<Coverage.Packages.Package.Classes.Class.Methods.Method.Lines.Line> line;

								public List<Coverage.Packages.Package.Classes.Class.Methods.Method.Lines.Line> getLine() {
									if (line == null) {
										line = new ArrayList<Coverage.Packages.Package.Classes.Class.Methods.Method.Lines.Line>();
									}
									return this.line;
								}

								@XmlAccessorType(XmlAccessType.FIELD)
								@XmlType(name = "")
								public static class Line {
									@XmlAttribute(name = "number")
									protected Integer number;
									@XmlAttribute(name = "hits")
									protected Integer hits;
									@XmlAttribute(name = "branch")
									protected Boolean branch;
									@XmlAttribute(name = "condition-coverage")
									protected String conditionCoverage;

									public Integer getNumber() {
										return number;
									}

									public void setNumber(Integer value) {
										this.number = value;
									}

									public Integer getHits() {
										return hits;
									}

									public void setHits(Integer value) {
										this.hits = value;
									}

									public Boolean isBranch() {
										return branch;
									}

									public void setBranch(Boolean value) {
										this.branch = value;
									}

									public String getConditionCoverage() {
										return conditionCoverage;
									}

									public void setConditionCoverage(String value) {
										this.conditionCoverage = value;
									}
								}
							}
						}
					}
				}
			}
		}
	}
}