#pragma checksum "D:\DevResearch\CoderKemp_REPO\TechLearning-ProofOfConceptProjects\BlazorApplication\BlazorServer\App.razor" "{ff1816ec-aa5e-4d10-87f7-6f4963833460}" "10333ab92b12bdf9ab7ff993caf1264921c34c17"
// <auto-generated/>
#pragma warning disable 1591
namespace BlazorServer
{
    #line hidden
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Threading.Tasks;
    using Microsoft.AspNetCore.Components;
#line 1 "D:\DevResearch\CoderKemp_REPO\TechLearning-ProofOfConceptProjects\BlazorApplication\BlazorServer\_Imports.razor"
using System.Net.Http;

#line default
#line hidden
#line 2 "D:\DevResearch\CoderKemp_REPO\TechLearning-ProofOfConceptProjects\BlazorApplication\BlazorServer\_Imports.razor"
using Microsoft.AspNetCore.Authorization;

#line default
#line hidden
#line 3 "D:\DevResearch\CoderKemp_REPO\TechLearning-ProofOfConceptProjects\BlazorApplication\BlazorServer\_Imports.razor"
using Microsoft.AspNetCore.Components.Authorization;

#line default
#line hidden
#line 4 "D:\DevResearch\CoderKemp_REPO\TechLearning-ProofOfConceptProjects\BlazorApplication\BlazorServer\_Imports.razor"
using Microsoft.AspNetCore.Components.Forms;

#line default
#line hidden
#line 5 "D:\DevResearch\CoderKemp_REPO\TechLearning-ProofOfConceptProjects\BlazorApplication\BlazorServer\_Imports.razor"
using Microsoft.AspNetCore.Components.Routing;

#line default
#line hidden
#line 6 "D:\DevResearch\CoderKemp_REPO\TechLearning-ProofOfConceptProjects\BlazorApplication\BlazorServer\_Imports.razor"
using Microsoft.AspNetCore.Components.Web;

#line default
#line hidden
#line 7 "D:\DevResearch\CoderKemp_REPO\TechLearning-ProofOfConceptProjects\BlazorApplication\BlazorServer\_Imports.razor"
using Microsoft.JSInterop;

#line default
#line hidden
#line 8 "D:\DevResearch\CoderKemp_REPO\TechLearning-ProofOfConceptProjects\BlazorApplication\BlazorServer\_Imports.razor"
using BlazorServer;

#line default
#line hidden
#line 9 "D:\DevResearch\CoderKemp_REPO\TechLearning-ProofOfConceptProjects\BlazorApplication\BlazorServer\_Imports.razor"
using BlazorServer.Shared;

#line default
#line hidden
    public partial class App : Microsoft.AspNetCore.Components.ComponentBase
    {
        #pragma warning disable 1998
        protected override void BuildRenderTree(Microsoft.AspNetCore.Components.Rendering.RenderTreeBuilder __builder)
        {
            __builder.OpenComponent<Microsoft.AspNetCore.Components.Routing.Router>(0);
            __builder.AddAttribute(1, "AppAssembly", Microsoft.AspNetCore.Components.CompilerServices.RuntimeHelpers.TypeCheck<System.Reflection.Assembly>(
#line 2 "D:\DevResearch\CoderKemp_REPO\TechLearning-ProofOfConceptProjects\BlazorApplication\BlazorServer\App.razor"
                      typeof(Program).Assembly

#line default
#line hidden
            ));
            __builder.AddAttribute(2, "Found", (Microsoft.AspNetCore.Components.RenderFragment<Microsoft.AspNetCore.Components.RouteData>)((routeData) => (__builder2) => {
                __builder2.AddMarkupContent(3, "\r\n        ");
                __builder2.OpenComponent<Microsoft.AspNetCore.Components.RouteView>(4);
                __builder2.AddAttribute(5, "RouteData", Microsoft.AspNetCore.Components.CompilerServices.RuntimeHelpers.TypeCheck<Microsoft.AspNetCore.Components.RouteData>(
#line 4 "D:\DevResearch\CoderKemp_REPO\TechLearning-ProofOfConceptProjects\BlazorApplication\BlazorServer\App.razor"
                               routeData

#line default
#line hidden
                ));
                __builder2.AddAttribute(6, "DefaultLayout", Microsoft.AspNetCore.Components.CompilerServices.RuntimeHelpers.TypeCheck<System.Type>(
#line 4 "D:\DevResearch\CoderKemp_REPO\TechLearning-ProofOfConceptProjects\BlazorApplication\BlazorServer\App.razor"
                                                          typeof(MainLayout)

#line default
#line hidden
                ));
                __builder2.CloseComponent();
                __builder2.AddMarkupContent(7, "\r\n    ");
            }
            ));
            __builder.AddAttribute(8, "NotFound", (Microsoft.AspNetCore.Components.RenderFragment)((__builder2) => {
                __builder2.AddMarkupContent(9, "\r\n        ");
                __builder2.OpenComponent<Microsoft.AspNetCore.Components.LayoutView>(10);
                __builder2.AddAttribute(11, "Layout", Microsoft.AspNetCore.Components.CompilerServices.RuntimeHelpers.TypeCheck<System.Type>(
#line 7 "D:\DevResearch\CoderKemp_REPO\TechLearning-ProofOfConceptProjects\BlazorApplication\BlazorServer\App.razor"
                             typeof(MainLayout)

#line default
#line hidden
                ));
                __builder2.AddAttribute(12, "ChildContent", (Microsoft.AspNetCore.Components.RenderFragment)((__builder3) => {
                    __builder3.AddMarkupContent(13, "\r\n            ");
                    __builder3.AddMarkupContent(14, "<p>Sorry, there\'s nothing at this address.</p>\r\n        ");
                }
                ));
                __builder2.CloseComponent();
                __builder2.AddMarkupContent(15, "\r\n    ");
            }
            ));
            __builder.CloseComponent();
        }
        #pragma warning restore 1998
    }
}
#pragma warning restore 1591
